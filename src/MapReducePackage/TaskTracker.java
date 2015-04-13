package MapReducePackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import MapReducePackage.RequestResponse.HeartBeatResponse;
import HDFSPackage.INameNode;
import MapReducePackage.RequestResponse.HeartBeatRequest;
import MapReducePackage.RequestResponse.MapTaskInfo;
import MapReducePackage.RequestResponse.MapTaskStatus;
import MapReducePackage.RequestResponse.ReduceTaskStatus;

public class TaskTracker {
	//TODO config JT_IP,port,heartbeatTimeInterval,TT_ID,blockSize,HDFS_NN_IP,dataNodeDir

	private static final int FREE = 0, RUNNING = 1, DONE = 2;
	String JT_IP = "read from conf";
	int port;
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
	public static int blockSize;
	
	public TaskTracker() throws RemoteException, NotBoundException, UnknownHostException {
		Registry registry = LocateRegistry.getRegistry(JT_IP,port);
		jobTrackerClient = (IJobTracker) registry.lookup("JobTracker");

		mapStatusQ = new ConcurrentLinkedQueue<RequestResponse.MapTaskStatus>();
		reduceStatusQ = new ConcurrentLinkedQueue<RequestResponse.ReduceTaskStatus>();
		
		TT_ID = pack(InetAddress.getLocalHost().getAddress());
		System.out.println(TT_ID);

		mapExecutor = Executors.newFixedThreadPool(totalMapSlots);
		reduceExecutor = Executors.newFixedThreadPool(totalReduceSlots);

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
		HeartBeatResponse heartBeatResponse = new HeartBeatResponse(jobTrackerClient.heartBeat(heartBeatRequest.toProto()));
		
		for( int i = 0; i < heartBeatResponse.mapTasks.size(); i++){
			mapExecutor.execute(new mapTask(heartBeatResponse.mapTasks.get(i)));
		}
		for( int i = 0; i < heartBeatResponse.reduceTasks.size(); i++){
			reduceExecutor.execute(new reduceTask(heartBeatResponse.reduceTasks.get(i)));
		}
		
	}

	int pack(byte[] bytes) {
		  int val = 0;
		  for (int i = 0; i < bytes.length; i++) {
		    val <<= 8;
		    val |= bytes[i] & 0xff;
		  }
		  return val;
	}
	
	public static void main(String arg[]) throws RemoteException, NotBoundException, UnknownHostException{
		final TaskTracker tt = new TaskTracker();
		
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
