package Test;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import API.HDFSAPI;

public class HDFSTester {
	public static void main(String args[]) throws NotBoundException, IOException{
		HDFSAPI hdfs = new HDFSAPI("10.42.0.1",4096000);

		if(args.length < 2)
			hdfs.copyToHDFS(args[0], "hdfs_"+args[0]);
		for(String s: hdfs.listFiles("/"))
			System.out.println(s);
		System.out.println("Write done");
		hdfs.copyFromHDFS("hdfs_"+args[0],args[0]+".out");
	}
}
