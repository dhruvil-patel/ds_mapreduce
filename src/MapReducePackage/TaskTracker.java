package MapReducePackage;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import MapReducePackage.RequestResponse.HeartBeatResponse;
import HDFSPackage.IDataNodeServer;
import HDFSPackage.INameNode;
import MapReducePackage.RequestResponse.HeartBeatRequest;
import MapReducePackage.RequestResponse.MapTaskInfo;
import MapReducePackage.RequestResponse.MapTaskStatus;
import MapReducePackage.RequestResponse.ReduceTaskStatus;

public class TaskTracker {
	//TODO config JT_IP,port,heartbeatTimeInterval,TT_ID,blockSize,HDFS_NN_IP,dataNodeDir

	private static final int FREE = 0, RUNNING = 1, DONE = 2;
	String JT_IP = "172.17.42.1";
	int port = 10002;
	int TT_ID;
	static int heartbeatTimeInterval;
	IJobTracker jobTrackerClient;
	int numMapSlotsFree,numReduceSlotsFree;
	int totalMapSlots,totalReduceSlots;
	public static ConcurrentLinkedQueue<MapTaskStatus> mapStatusQ;
	public static ConcurrentLinkedQueue<ReduceTaskStatus> reduceStatusQ;
	Executor mapExecutor,reduceExecutor;
	AtomicInteger isMapFree[],isReduceFree[];
	Thread mapThreads[],reduceThreads[];
	ArrayList<MapTaskStatus> mapStatus;
	ArrayList<ReduceTaskStatus> reduceStatus;
	public static String dataNodeDir;
	public static String HDFS_NN_IP;
	public static int blockSize = 16777216;
	public static int DN_ID ;
	
	
	public TaskTracker(String configFilePath) throws Exception {
		Registry registry = LocateRegistry.getRegistry(JT_IP);
		jobTrackerClient = (IJobTracker) registry.lookup("JobTracker");
		System.out.println("TT:" + "Bound to JobTracker on "+ JT_IP  +":" + port);
		
		mapStatusQ = new ConcurrentLinkedQueue<RequestResponse.MapTaskStatus>();
		reduceStatusQ = new ConcurrentLinkedQueue<RequestResponse.ReduceTaskStatus>();
		
		
		
		TT_ID = pack(InetAddress.getLocalHost().getAddress());
		System.out.println(TT_ID);
		
		
		File file = new File(configFilePath);
		if(!file.exists()){
			throw new Exception("config file :"+configFilePath+" does not exists");
		}
		Scanner sc = new Scanner(file);
		while(sc.hasNext()){
			String tmp[] = sc.nextLine().split(",");
			if(tmp[0].compareTo("totalMapSlots") == 0){
				totalMapSlots = Integer.parseInt(tmp[1]);
			}
			if(tmp[0].compareTo("totalReduceSlots") == 0){
				totalReduceSlots = Integer.parseInt(tmp[1]);
			}
			if(tmp[0].compareTo("dataNodeID") == 0){
				DN_ID = Integer.parseInt(tmp[1]);
			}
			if(tmp[0].compareTo("datanodeDir") == 0){
				dataNodeDir = new String(tmp[1]);
			}
			if(tmp[0].compareTo("heartbeatTimeInterval") == 0){
				heartbeatTimeInterval = Integer.parseInt(tmp[1]);
			}
			if(tmp[0].compareTo("jobTrackerIp") == 0){
				JT_IP = new String(tmp[1]);
			}
			if(tmp[0].compareTo("nameNodeIp") == 0){
				HDFS_NN_IP = new String(tmp[1]);
			}
			if(tmp[0].compareTo("port") == 0){
				port = Integer.parseInt(tmp[1]);
			}
			
		}
		sc.close();
		
		
		mapExecutor = Executors.newFixedThreadPool(totalMapSlots);
		reduceExecutor = Executors.newFixedThreadPool(totalReduceSlots);
		mapStatus = new ArrayList<>();
		reduceStatus = new ArrayList<>();
		System.out.println("dataNodeDir"+dataNodeDir);
	}
	
	protected void sendHeartBeat() throws RemoteException {

		while(!mapStatusQ.isEmpty()){
			mapStatus.add(mapStatusQ.poll());
		}
		while(!reduceStatusQ.isEmpty()){
			reduceStatus.add(reduceStatusQ.poll());
		}

		numMapSlotsFree = totalMapSlots - mapStatus.size();
		numReduceSlotsFree = totalReduceSlots - reduceStatus.size();
		
		HeartBeatRequest heartBeatRequest= new HeartBeatRequest(TT_ID, numMapSlotsFree, numReduceSlotsFree, mapStatus, reduceStatus);
//		System.out.println("TT: toproto"+heartBeatRequest.toProto().length);
		byte [] tmp =jobTrackerClient.heartBeat(heartBeatRequest.toProto());
		
		if(tmp == null)
			System.out.println("TT: return null");
		
		HeartBeatResponse heartBeatResponse = new HeartBeatResponse(tmp);
		
		for( int i = 0; i < heartBeatResponse.mapTasks.size(); i++){
			mapExecutor.execute(new mapTask(heartBeatResponse.mapTasks.get(i)));
		}
		for( int i = 0; i < heartBeatResponse.reduceTasks.size(); i++){
			reduceExecutor.execute(new reduceTask(heartBeatResponse.reduceTasks.get(i)));
			System.out.println("Reducer inputfile Names"+heartBeatResponse.reduceTasks.get(i).mapOutputFiles);
		}
		mapStatus.clear();
		reduceStatus.clear();
	}

	int pack(byte[] bytes) {
		  int val = 0;
		  for (int i = 0; i < bytes.length; i++) {
		    val <<= 8;
		    val |= bytes[i] & 0xff;
		  }
		  return val;
	}
	
	public static void main(String arg[]) throws Exception{
		final TaskTracker tt = new TaskTracker(arg[0]);
		
		new Timer().schedule(new TimerTask() {
	    	public void run()  {
	    		try {
					tt.sendHeartBeat();
				} catch (RemoteException e) {
					e.printStackTrace();
				}
	    	}
	    	}, 1, heartbeatTimeInterval);
	}
}
