package MapReducePackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLClassLoader;
import java.rmi.NotBoundException;
import java.util.Scanner;

import API.HDFSAPI;
import MapReducePackage.RequestResponse.MapTaskInfo;
import MapReducePackage.RequestResponse.MapTaskStatus;

public class mapTask implements Runnable {

	MapTaskInfo mapTaskInfo;
	String outputFileName;
	private String jarFileName = "Test.jar", jarFilePath;

	public mapTask(MapTaskInfo _mapTaskInfo) {
		mapTaskInfo = _mapTaskInfo;
		outputFileName = "job_" + mapTaskInfo.jobId + "_map_" + mapTaskInfo.taskId;
	}

	public void run() {
		Class Mapper;
		IMapper mapper = null;
		try {
			HDFSAPI hdfs = new HDFSAPI(TaskTracker.HDFS_NN_IP, TaskTracker.blockSize);

			jarFilePath = TaskTracker.dataNodeDir + "/" + jarFileName;
			hdfs.copyFromHDFS(jarFileName, jarFilePath);
			System.out.println("Mapper :: Jar Path " + jarFilePath);
			URL urlList[] = new URL[1];
			urlList[0] = new File(jarFilePath).toURI().toURL();
			URLClassLoader loader = new URLClassLoader(urlList);
			Mapper = Class.forName(mapTaskInfo.mapName, true, loader);
			mapper = (IMapper) Mapper.newInstance();

			Writer writer = new OutputStreamWriter(
					new FileOutputStream(TaskTracker.dataNodeDir + "/" + outputFileName));
			for (int blockNo : mapTaskInfo.inputBlocks) {
				File inputFile = new File(TaskTracker.dataNodeDir + "/" + TaskTracker.DN_ID + "_" + blockNo);
				Scanner sc = new Scanner(inputFile);
				while (sc.hasNext()) {
					String str = sc.nextLine();
					String outStr = mapper.map(str);
					if (outStr != null)
						writer.write(outStr + "\n");
				}
				sc.close();
			}
			writer.close();
			hdfs.copyToHDFS(TaskTracker.dataNodeDir + "/" + outputFileName, outputFileName);
			new File(TaskTracker.dataNodeDir + "/" + outputFileName).delete();
		} catch (LinkageError | ClassNotFoundException | InstantiationException | IllegalAccessException | IOException
				| NotBoundException e1) {
			e1.printStackTrace();
		}
		addStatusToQueue();
	}

	void addStatusToQueue() {
		TaskTracker.mapStatusQ.add(new MapTaskStatus(mapTaskInfo.jobId, mapTaskInfo.taskId, true, outputFileName));
	}
}
