package Test;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import MapReducePackage.IJobTracker;
import MapReducePackage.RequestResponse.JobStatusRequest;
import MapReducePackage.RequestResponse.JobStatusResponse;
import MapReducePackage.RequestResponse.JobSubmitRequest;
import MapReducePackage.RequestResponse.JobSubmitResponse;

public class MapReduceTester {

	public static void main(String arg[]) throws RemoteException, NotBoundException{
		String JT_IP = "192.168.122.1";
		int port = 10001;
		Registry registry = LocateRegistry.getRegistry(JT_IP);
		IJobTracker jobTrackerClient = (IJobTracker) registry.lookup("JobTracker");
		System.out.println("Connected to Jobtracker "+ JT_IP + ":" + port);
		JobSubmitRequest jobSubmitRequest = new JobSubmitRequest(arg[0], arg[1], arg[2], arg[3], Integer.parseInt(arg[4]));
		JobSubmitResponse jobSubmitResponse = new JobSubmitResponse(jobTrackerClient.jobSubmit(jobSubmitRequest.toProto()));
		if(jobSubmitResponse.status == 1){
			System.out.println("Job "+ jobSubmitResponse.jobId +" submitted.");
			boolean notDone = true;
			JobStatusRequest jobStatusRequest = new JobStatusRequest(jobSubmitResponse.jobId);
			int oldMapPercent, oldReducePercent, mapPercent = 0, reducePercent = 0;
			while(notDone){
				JobStatusResponse jobStatusResponse = new JobStatusResponse(jobTrackerClient.getJobStatus(jobStatusRequest.toProto()));
				oldMapPercent = mapPercent;
				oldReducePercent = reducePercent;
				mapPercent = 100*jobStatusResponse.numMapTasksStarted/jobStatusResponse.totalMapTasks;
				reducePercent = 100*jobStatusResponse.numReduceTasksStarted/jobStatusResponse.totalReduceTasks;
				notDone = !jobStatusResponse.jobDone;
				if(oldMapPercent != mapPercent || oldReducePercent != reducePercent)
					System.out.println("MapTask Started "+ mapPercent +"%  ReduceTask Started" + reducePercent+"%");
			}
		}else{
			System.out.println("Job not submitted.");
		}
	}
}