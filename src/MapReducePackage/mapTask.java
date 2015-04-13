package MapReducePackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.rmi.NotBoundException;
import java.util.Scanner;

import API.HDFSAPI;
import HDFSPackage.IDataNodeServer;
import MapReducePackage.RequestResponse.MapTaskInfo;
import MapReducePackage.RequestResponse.MapTaskStatus;

public class mapTask implements Runnable {

	MapTaskInfo mapTaskInfo;
	String outputFileName;

	public mapTask(MapTaskInfo _mapTaskInfo) {
		mapTaskInfo = _mapTaskInfo;
		outputFileName = "job_" + mapTaskInfo.jobId + "_map_" + mapTaskInfo.taskId;
	}

	public void run() {
		Class Mapper;
		IMapper mapper = null;
		try {
			Mapper = Class.forName(mapTaskInfo.mapName);
			mapper = (IMapper) Mapper.newInstance();

			Writer writer = new OutputStreamWriter(new FileOutputStream(TaskTracker.dataNodeDir + "/" +outputFileName));
			for (int blockNo : mapTaskInfo.inputBlocks) {
				File inputFile = new File(TaskTracker.dataNodeDir + "/"	+ IDataNodeServer.DN_ID + "_" + blockNo);
				Scanner sc = new Scanner(inputFile);
				while (sc.hasNext()) {
					String str = sc.nextLine();
					String outStr = mapper.map(str);
					if(outStr.length()>0)
						writer.write(outStr+"\n");
					sc.next();
				}
				sc.close();
			}
			writer.close();
			HDFSAPI hdfs = new HDFSAPI(TaskTracker.HDFS_NN_IP,TaskTracker.blockSize);
			hdfs.copyToHDFS(TaskTracker.dataNodeDir + "/" +outputFileName,outputFileName);
			
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | IOException | NotBoundException e1) {
			e1.printStackTrace();
		}
		addStatusToQueue();
	}

	void addStatusToQueue() {
		TaskTracker.mapStatusQ.add(new MapTaskStatus(mapTaskInfo.jobId,
				mapTaskInfo.taskId, true, outputFileName));
	}
}
