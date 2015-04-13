package MapReducePackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.rmi.NotBoundException;
import java.util.Scanner;

import API.HDFSAPI;
import HDFSPackage.IDataNodeServer;
import MapReducePackage.RequestResponse.MapTaskStatus;
import MapReducePackage.RequestResponse.ReduceTaskStatus;
import MapReducePackage.RequestResponse.ReducerTaskInfo;

public class reduceTask implements Runnable {
	ReducerTaskInfo reducerTaskInfo;
	public reduceTask(ReducerTaskInfo _reducerTaskInfo) {
		reducerTaskInfo = _reducerTaskInfo;
	}
	@Override
	public void run() {
		Class Reducer;
		IReducer reducer = null;
		try {
			Reducer = Class.forName(reducerTaskInfo.reducerName);
			reducer = (IReducer) Reducer.newInstance();
			HDFSAPI hdfs = new HDFSAPI(TaskTracker.HDFS_NN_IP,TaskTracker.blockSize);
			Writer writer = new OutputStreamWriter(new FileOutputStream(TaskTracker.dataNodeDir + "/" +reducerTaskInfo.outputFile));
			for (String mapOutputFileName : reducerTaskInfo.mapOutputFiles) {
				hdfs.copyFromHDFS(mapOutputFileName,TaskTracker.dataNodeDir + "/" +mapOutputFileName);
				File inputFile = new File(TaskTracker.dataNodeDir + "/" +mapOutputFileName);
				Scanner sc = new Scanner(inputFile);
				while (sc.hasNext()) {
					String str = sc.nextLine();
					String outStr = reducer.reduce(str);
					if(outStr.length()>0)
						writer.write(outStr+"\n");
					sc.next();
				}
				sc.close();
			}
			writer.close();
			hdfs.copyToHDFS(TaskTracker.dataNodeDir + "/" +reducerTaskInfo.outputFile,reducerTaskInfo.outputFile);
			
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | IOException | NotBoundException e1) {
			e1.printStackTrace();
		}
		addStatusToQueue();
	}

	void addStatusToQueue() {
		TaskTracker.reduceStatusQ.add(new ReduceTaskStatus(reducerTaskInfo.jobId,
				reducerTaskInfo.taskId, true));
	}

}
