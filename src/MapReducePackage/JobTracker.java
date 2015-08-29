package MapReducePackage;

import java.io.File;
import java.net.InetAddress;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

import javax.print.attribute.standard.QueuedJobCount;

import HDFSPackage.INameNode;
import HDFSPackage.INameNodeServer;
import MapReducePackage.RequestResponse.HeartBeatRequest;
import MapReducePackage.RequestResponse.HeartBeatResponse;
import MapReducePackage.RequestResponse.*;
import HDFSPackage.RequestResponse.*;

public class JobTracker implements IJobTracker {

	int lastJobId;
	static String NNIP;
	static int port;
	HashMap<Integer, Job> jobStatus;
	HashMap<Integer, ArrayList<MapTaskInfo>> mapQueue;
	ArrayList<ReducerTaskInfo> reduceQueue;
	INameNode nameNodeClient;

	public JobTracker(String configFilePath) throws Exception {
		lastJobId = 1; // read from file
		jobStatus = new HashMap<Integer, Job>();
		mapQueue = new HashMap<Integer, ArrayList<MapTaskInfo>>();
		reduceQueue = new ArrayList<ReducerTaskInfo>();
		NNIP = new String("192.168.122.1");
		port = 10002;

		File file = new File(configFilePath);
		if (!file.exists()) {
			throw new Exception("datanode.config does not exists");
		}
		Scanner sc = new Scanner(file);
		while (sc.hasNext()) {
			String tmp[] = sc.nextLine().split(",");
			if (tmp[0].compareTo("nameNodeIp") == 0) {
				NNIP = new String(tmp[1]);
			}
			if (tmp[0].compareTo("port") == 0) {
				port = Integer.parseInt(tmp[1]);
			}

		}
		sc.close();

	}

	@Override
	public byte[] jobSubmit(byte[] input) {
		// TODO Auto-generated method stub
		JobSubmitRequest jobSubmitRequest = new JobSubmitRequest(input);
		JobSubmitResponse jobSubmitResponse = null;

		Registry registry;
		OpenFileRequest openFileRequest = new OpenFileRequest(jobSubmitRequest.inputFile, true);

		try {
			registry = LocateRegistry.getRegistry(NNIP);
			nameNodeClient = (INameNode) registry.lookup("NameNode");

			OpenFileResponse openFileResponse = new OpenFileResponse(
					nameNodeClient.openFile(openFileRequest.toProto()));
			if (openFileResponse.status != 1) {
				try {
					throw new Exception(jobSubmitRequest.inputFile + " not found.");
				} catch (Exception e) {
					e.printStackTrace();
					jobSubmitResponse = new JobSubmitResponse(-1, -1);
				}
			} else {
				BlockLocationRequest blockLocationRequest = new BlockLocationRequest(openFileResponse.blockNums);
				BlockLocationResponse blockLocationResponse = new BlockLocationResponse(
						nameNodeClient.getBlockLocations(blockLocationRequest.toProto()));
				if (blockLocationResponse.status != 1) {
					try {
						throw new Exception("BlockLocation not found.");
					} catch (Exception e) {
						e.printStackTrace();
						jobSubmitResponse = new JobSubmitResponse(-1, -1);
					}
				} else {
					HashMap<Integer, MapTaskInfo> mapCountMapping = new HashMap<Integer, MapTaskInfo>();
					int taskId = 0;
					int taskTrackerId;
					MapTaskInfo mpinfo;
					lastJobId++;
					for (BlockLocations blLocation : blockLocationResponse.blockLocations) {
						DataNodeLocation dataNodeLocation = blLocation.locations.get(0);
						taskTrackerId = dataNodeLocation.ip;
						if (mapCountMapping.containsKey(taskTrackerId)) {
							mpinfo = mapCountMapping.get(taskTrackerId);
							mpinfo.inputBlocks.add(blLocation.blockNumber);
						} else {
							mpinfo = new MapTaskInfo();
							mpinfo.jobId = lastJobId;
							mpinfo.mapName = jobSubmitRequest.mapName;
							mpinfo.inputBlocks.add(blLocation.blockNumber);
							taskId++;
							mpinfo.taskId = taskId;
						}
						mapCountMapping.put(taskTrackerId, mpinfo);
					}
					for (int ttId : mapCountMapping.keySet()) { // add local map
																// to global map
						ArrayList<MapTaskInfo> tmp;
						if (mapQueue.containsKey(ttId)) {
							System.out.println("JT: " + ttId + "Found Entry in tmp map");
							tmp = mapQueue.get(ttId);
							if (tmp == null)
								System.out.println("JT : tmp null for " + ttId);
						} else {
							tmp = new ArrayList<MapTaskInfo>();
							System.out.println("JT: " + ttId + "new Entry in tmp");
						}
						MapTaskInfo t = mapCountMapping.get(ttId);
						System.out.println("JT: t " + t);

						tmp.add(t);
						mapQueue.put(ttId, tmp);
					}

					Job job = new Job(lastJobId, jobSubmitRequest, taskId);
					jobStatus.put(lastJobId, job);
					jobSubmitResponse = new JobSubmitResponse(1, lastJobId);
				}
			}

		} catch (RemoteException | NotBoundException e) {
			e.printStackTrace();
		}

		System.out.println("JT: jobstatus " + jobSubmitResponse.status);
		return jobSubmitResponse.toProto();
	}

	@Override
	public byte[] getJobStatus(byte[] input) {
		// TODO Auto-generated method stub
		JobStatusRequest jobStatusRequest = new JobStatusRequest(input);
		JobStatusResponse jobStatusResponse;
		int jobId = jobStatusRequest.jobId;
		Job job;
		if (jobStatus.containsKey(jobId)) {
			job = jobStatus.get(jobId);
			jobStatusResponse = new JobStatusResponse();
			jobStatusResponse.status = 1;
			jobStatusResponse.totalMapTasks = job.totalMapTasks;
			jobStatusResponse.numMapTasksStarted = job.numMapTasksStarted;
			jobStatusResponse.totalReduceTasks = job.totalReduceTasks;

			jobStatusResponse.numReduceTasksStarted = job.numReduceTasksStarted;
			jobStatusResponse.jobDone = job.isJobDone();
			if (jobStatusResponse.jobDone) {
				jobStatus.remove(jobId);
			}
		} else {
			jobStatusResponse = new JobStatusResponse(-1, false, 0, 0, 0, 0);
		}
		return jobStatusResponse.toProto();
	}

	@Override
	public byte[] heartBeat(byte[] input) {
		// TODO Auto-generated method stub
		HeartBeatRequest heartBeatRequest = new HeartBeatRequest(input);
		int jobId;
		Job job;
		for (MapTaskStatus mapTaskStatus : heartBeatRequest.mapStatus) {
			if (mapTaskStatus.taskCompleted) {
				jobId = mapTaskStatus.jobId;
				job = jobStatus.get(jobId);
				job.numMapTasksCompleted++;
				job.mapOutputFiles.add(mapTaskStatus.mapOutputFile);
				System.out.println("MapJob completed" + job.numMapTasksCompleted + "total " + job.totalMapTasks);
				if (job.numMapTasksCompleted == job.totalMapTasks) {
					job.status = 1;
					System.out.println("Map completed.!!");
					ArrayList<ReducerTaskInfo> reducerTaskInfo = new ArrayList<ReducerTaskInfo>();
					ReducerTaskInfo r;
					// int totalReducer = job.totalReduceTasks;

					int totalReducer = Math.min(job.totalReduceTasks, job.totalMapTasks);
					job.numReduceTasksStarted = job.totalReduceTasks - totalReducer;
					job.numReduceTasksCompleted = job.totalReduceTasks - totalReducer;

					for (int i = 1; i <= totalReducer; i++) {
						r = new ReducerTaskInfo();
						r.jobId = jobId;
						r.taskId = job.totalMapTasks + i;
						r.reducerName = job.reducerName;
						r.mapOutputFiles = new ArrayList<String>();
						r.outputFile = job.outputFile;
						reducerTaskInfo.add(r);
					}
					String file;
					for (int i = 0; i < job.mapOutputFiles.size(); i++) {
						file = job.mapOutputFiles.get(i);
						r = reducerTaskInfo.get(i % totalReducer);
						reducerTaskInfo.remove(i % totalReducer);
						r.mapOutputFiles.add(file);
						reducerTaskInfo.add(i % totalReducer, r);
						System.out.println(file + "Assigned to" + (i % totalReducer));
					}
					reduceQueue.addAll(reducerTaskInfo);
				}
			}
		}

		for (ReduceTaskStatus reduceTaskStatus : heartBeatRequest.reduceStatus) {
			if (reduceTaskStatus.taskCompleted) {
				jobId = reduceTaskStatus.jobId;
				job = jobStatus.get(jobId);
				job.numReduceTasksCompleted++;
			}
		}

		HeartBeatResponse heartBeatResponse = new HeartBeatResponse();
		heartBeatResponse.status = 1;

		int ttId = heartBeatRequest.taskTrackerId;
		int assignMapTask = heartBeatRequest.numMapSlotsFree;
		ArrayList<MapTaskInfo> startMappers = mapQueue.get(ttId);
		if (startMappers != null) {
			while (assignMapTask > 0 && startMappers.size() > 0) {
				heartBeatResponse.mapTasks.add(startMappers.get(0));
				jobId = startMappers.get(0).jobId;
				job = jobStatus.get(jobId);
				job.numMapTasksStarted++;
				jobStatus.put(jobId, job);
				startMappers.remove(0);
				assignMapTask--;
			}
			mapQueue.put(ttId, startMappers);
		}
		int assignReduceTask = heartBeatRequest.numReduceSlotsFree;
		while (assignReduceTask > 0 && reduceQueue.size() > 0) {
			heartBeatResponse.reduceTasks.add(reduceQueue.get(0));
			jobId = reduceQueue.get(0).jobId;
			job = jobStatus.get(jobId);
			job.numReduceTasksStarted++;
			jobStatus.put(jobId, job);
			reduceQueue.remove(0);
			assignReduceTask--;
		}
		System.out.println("JT: HeartBeat from " + ttId);
		return heartBeatResponse.toProto();
	}

	int pack(byte[] bytes) {
		int val = 0;
		for (int i = 0; i < bytes.length; i++) {
			val <<= 8;
			val |= bytes[i] & 0xff;
		}
		return val;
	}

	public static void main(String args[]) {
		try {
			String name = "JobTracker";
			IJobTracker jobTracker = new JobTracker(args[0]);
			IJobTracker stub = (IJobTracker) UnicastRemoteObject.exportObject(jobTracker, port);
			Registry registry = LocateRegistry.getRegistry(NNIP);
			registry.rebind(name, stub);
			System.out.println("JobTracker bound to " + NNIP + ":" + port);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}

class Job {
	public int jobId;
	public String mapName;
	public String reducerName;
	public String outputFile;
	public ArrayList<String> mapOutputFiles;
	public int totalMapTasks;
	public int numMapTasksStarted;
	public int numMapTasksCompleted;
	public int totalReduceTasks;
	public int numReduceTasksStarted;
	public int numReduceTasksCompleted;
	public int status;

	public Job(int _jobId, JobSubmitRequest jobSubmitRequest, int mapTasks) {
		jobId = _jobId;
		mapName = jobSubmitRequest.mapName;
		reducerName = jobSubmitRequest.reducerName;
		outputFile = jobSubmitRequest.outputFile;
		mapOutputFiles = new ArrayList<String>();
		totalMapTasks = mapTasks;
		numMapTasksStarted = 0;
		numMapTasksCompleted = 0;
		totalReduceTasks = jobSubmitRequest.numReduceTasks;
		numReduceTasksStarted = 0;
		numReduceTasksCompleted = 0;
		status = 0; // 0 for map, 1 for reduce
	}

	boolean isJobDone() {
		if (numReduceTasksCompleted == totalReduceTasks) {
			return true;
		} else
			return false;
	}

}