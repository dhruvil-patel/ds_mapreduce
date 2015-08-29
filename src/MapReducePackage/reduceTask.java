package MapReducePackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLClassLoader;
import java.rmi.NotBoundException;
import java.util.Scanner;

import API.HDFSAPI;
import HDFSPackage.IDataNodeServer;
import MapReducePackage.RequestResponse.MapTaskStatus;
import MapReducePackage.RequestResponse.ReduceTaskStatus;
import MapReducePackage.RequestResponse.ReducerTaskInfo;

public class reduceTask implements Runnable {
	ReducerTaskInfo reducerTaskInfo;
	String jarFilePath, jarFileName = "Test.jar";

	public reduceTask(ReducerTaskInfo _reducerTaskInfo) {
		reducerTaskInfo = _reducerTaskInfo;
	}

	@Override
	public void run() {
		Class Reducer;
		IReducer reducer = null;
		try {

			HDFSAPI hdfs = new HDFSAPI(TaskTracker.HDFS_NN_IP, TaskTracker.blockSize);
			jarFilePath = TaskTracker.dataNodeDir + "/" + jarFileName;
			hdfs.copyFromHDFS(jarFileName, jarFilePath);

			System.out.println("Reducer :: Jar Path " + jarFilePath);
			URL urlList[] = new URL[1];
			urlList[0] = new File(jarFilePath).toURI().toURL();
			URLClassLoader loader = new URLClassLoader(urlList);
			Reducer = Class.forName(reducerTaskInfo.reducerName, true, loader);
			reducer = (IReducer) Reducer.newInstance();
			Writer writer = new OutputStreamWriter(new FileOutputStream(
					TaskTracker.dataNodeDir + "/" + reducerTaskInfo.outputFile + reducerTaskInfo.taskId));
			for (String mapOutputFileName : reducerTaskInfo.mapOutputFiles) {
				hdfs.copyFromHDFS(mapOutputFileName, TaskTracker.dataNodeDir + "/" + mapOutputFileName);
				File inputFile = new File(TaskTracker.dataNodeDir + "/" + mapOutputFileName);
				Scanner sc = new Scanner(inputFile);
				while (sc.hasNext()) {
					String str = sc.nextLine();
					String outStr = reducer.reduce(str);
					if (outStr.length() > 0)
						writer.write(outStr + "\n");
				}
				sc.close();
				new File(TaskTracker.dataNodeDir + "/" + mapOutputFileName).delete();
			}
			writer.close();
			hdfs.copyToHDFS(TaskTracker.dataNodeDir + "/" + reducerTaskInfo.outputFile + reducerTaskInfo.taskId,
					reducerTaskInfo.outputFile + reducerTaskInfo.taskId);

			new File(TaskTracker.dataNodeDir + "/" + reducerTaskInfo.outputFile + reducerTaskInfo.taskId).delete();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IOException
				| NotBoundException e1) {
			e1.printStackTrace();
		}
		addStatusToQueue();
	}

	void addStatusToQueue() {
		TaskTracker.reduceStatusQ.add(new ReduceTaskStatus(reducerTaskInfo.jobId, reducerTaskInfo.taskId, true));
	}

}
