package MapReducePackage;

import java.net.InetAddress;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

import javax.print.attribute.standard.QueuedJobCount;

import HDFSPackage.INameNode;
import MapReducePackage.RequestResponse.HeartBeatRequest;
import MapReducePackage.RequestResponse.HeartBeatResponse;
import MapReducePackage.RequestResponse.*;
import HDFSPackage.RequestResponse.*;

public class JobTracker implements IJobTracker {

	int lastJobId;
	String NN_IP = "localhost";
	HashMap<Integer, Job> jobStatus;
	HashMap<Integer, ArrayList<MapTaskInfo>> mapQueue;
	ArrayList<ReducerTaskInfo> reduceQueue;
	INameNode nameNodeClient;

	public JobTracker() throws RemoteException {
		lastJobId = 1; // read from file
		jobStatus = new HashMap<Integer, Job>();
		mapQueue = new HashMap<Integer, ArrayList<MapTaskInfo>>();
		reduceQueue = new ArrayList<ReducerTaskInfo>();
	}

	@Override
	public byte[] jobSubmit(byte[] input) {
		// TODO Auto-generated method stub
		JobSubmitRequest jobSubmitRequest = new JobSubmitRequest(input);
		JobSubmitResponse jobSubmitResponse = null;

		Registry registry;
		OpenFileRequest openFileRequest = new OpenFileRequest(
				jobSubmitRequest.inputFile, true);

		try {
			registry = LocateRegistry.getRegistry(NN_IP);
			nameNodeClient = (INameNode) registry.lookup("NameNode");

			OpenFileResponse openFileResponse = new OpenFileResponse(
					nameNodeClient.openFile(openFileRequest.toProto()));
			if (openFileResponse.status != 1) {
				try {
					throw new Exception(jobSubmitRequest.inputFile
							+ " not found.");
				} catch (Exception e) {
					e.printStackTrace();
					jobSubmitResponse = new JobSubmitResponse(-1, -1);
				}
			} else {
				BlockLocationRequest blockLocationRequest = new BlockLocationRequest(
						openFileResponse.blockNums);
				BlockLocationResponse blockLocationResponse = new BlockLocationResponse(
						nameNodeClient.getBlockLocations(blockLocationRequest
								.toProto()));
				if(blockLocationResponse.status != 1){
					try {
						throw new Exception("BlockLocation not found.");
					} catch (Exception e) {
						e.printStackTrace();
						jobSubmitResponse = new JobSubmitResponse(-1, -1);
					}
				}
				else{
					HashMap<Integer, MapTaskInfo> mapCountMapping = new HashMap<Integer,MapTaskInfo>();
					int taskId = 0;
					int taskTrackerId;
					MapTaskInfo mpinfo;
					lastJobId++;
					for(BlockLocations blLocation : blockLocationResponse.blockLocations){
						DataNodeLocation dataNodeLocation = blLocation.locations.get(0);
						taskTrackerId = dataNodeLocation.ip;
						if(mapCountMapping.containsKey(taskTrackerId)){
							mpinfo = mapCountMapping.get(taskTrackerId);
							mpinfo.inputBlocks.add(blLocation.blockNumber);
						}else{
							mpinfo = new MapTaskInfo();
							mpinfo.jobId = lastJobId;
							mpinfo.mapName = jobSubmitRequest.mapName;
							mpinfo.inputBlocks.add(blLocation.blockNumber);
							taskId++;
							mpinfo.taskId = taskId;
						}
						mapCountMapping.put(taskTrackerId, mpinfo);
					}
					for(int ttId : mapCountMapping.keySet()){	// add local map to global map
						ArrayList<MapTaskInfo> tmp;
						if(mapQueue.containsKey(ttId)){
							tmp = mapQueue.get(ttId);
						}else{
							tmp = new ArrayList<MapTaskInfo>();
						}
						tmp.add(mapCountMapping.get(ttId));
						mapQueue.put(ttId,tmp);
					}
					
					Job job = new Job(lastJobId,jobSubmitRequest,taskId);
					jobStatus.put(lastJobId,job);
					jobSubmitResponse = new JobSubmitResponse(lastJobId, 1);
				}
			}

		} catch (RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		return jobSubmitResponse.toProto();
	}

	@Override
	public byte[] getJobStatus(byte[] input) {
		// TODO Auto-generated method stub
		JobStatusRequest jobStatusRequest = new JobStatusRequest(input);
		JobStatusResponse jobStatusResponse; 
		int jobId = jobStatusRequest.jobId;
		Job job;
		if(jobStatus.containsKey(jobId)){
			job = jobStatus.get(jobId);
			jobStatusResponse = new JobStatusResponse();
			jobStatusResponse.status = 1;
			jobStatusResponse.totalMapTasks = job.totalMapTasks;
			jobStatusResponse.numMapTasksStarted = job.numMapTasksStarted;
			jobStatusResponse.totalReduceTasks = job.totalReduceTasks;
			jobStatusResponse.numReduceTasksStarted = job.numReduceTasksStarted;
			jobStatusResponse.jobDone = job.isJobDone();
			if(jobStatusResponse.jobDone){
				jobStatus.remove(jobId);
			}
		}else{
			jobStatusResponse = new JobStatusResponse(-1,false,0,0,0,0);
		}
		return jobStatusResponse.toProto();
	}

	@Override
	public byte[] heartBeat(byte[] input) {
		// TODO Auto-generated method stub
		HeartBeatRequest heartBeatRequest = new HeartBeatRequest(input);
		int jobId;
		Job job;
		for(MapTaskStatus mapTaskStatus : heartBeatRequest.mapStatus){
			if(mapTaskStatus.taskCompleted){
				jobId = mapTaskStatus.jobId;
				job = jobStatus.get(jobId);
				job.numMapTasksCompleted++;
				job.mapOutputFiles.add(mapTaskStatus.mapOutputFile);
				if(job.numMapTasksCompleted==job.totalMapTasks){
					job.status = 1;
					
					ReducerTaskInfo reducerTaskInfo;
					for(int i=1;i<=job.totalReduceTasks;i++){
						reducerTaskInfo = new ReducerTaskInfo();
						reducerTaskInfo.jobId = jobId;
						reducerTaskInfo.taskId = job.totalMapTasks + i;
						reducerTaskInfo.reducerName = job.reducerName;
						reducerTaskInfo.mapOutputFiles = job.mapOutputFiles;
						reducerTaskInfo.outputFile = job.outputFile;
						reduceQueue.add(reducerTaskInfo);
					}
				}
			}
		}
		
		for(ReduceTaskStatus reduceTaskStatus : heartBeatRequest.reduceStatus){
			if(reduceTaskStatus.taskCompleted){
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
		while(assignMapTask > 0 && startMappers.size() > 0){
			heartBeatResponse.mapTasks.add(startMappers.get(0));
			jobId = startMappers.get(0).jobId;
			job = jobStatus.get(jobId);
			job.numMapTasksStarted++;
			jobStatus.put(jobId, job);
			startMappers.remove(0);
			assignMapTask--;
		}
		mapQueue.put(ttId, startMappers);
		
		int assignReduceTask = heartBeatRequest.numReduceSlotsFree;
		while(assignReduceTask > 0 && reduceQueue.size() > 0){
			heartBeatResponse.reduceTasks.add(reduceQueue.get(0));
			jobId = reduceQueue.get(0).jobId;
			job = jobStatus.get(jobId);
			job.numReduceTasksStarted++;
			jobStatus.put(jobId, job);
			reduceQueue.remove(0);
			assignReduceTask--;
		}
		
		return null;
	}
	
	int pack(byte[] bytes) {
		  int val = 0;
		  for (int i = 0; i < bytes.length; i++) {
		    val <<= 8;
		    val |= bytes[i] & 0xff;
		  }
		  return val;
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
	public int status; // maper or reducer is running

	public Job(int _jobId, JobSubmitRequest jobSubmitRequest,int mapTasks) {
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
		status = 0;		// 0 for map, 1 for reduce
	}
	
	boolean isJobDone(){
		if(numReduceTasksCompleted==totalReduceTasks){
			return true;
		}else
			return false;
	}
}