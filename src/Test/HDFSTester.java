package Test;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import API.HDFSAPI;

public class HDFSTester {
	public static void main(String args[]) throws NotBoundException, IOException{
		/**
		 *  Static testing only on single system with multiple VMs.
		 */
		HDFSAPI hdfs = new HDFSAPI("192.168.122.1",16777216);

		if(args.length < 2)
			hdfs.copyToHDFS(args[0], ""+args[0]);
		for(String s: hdfs.listFiles("/"))
			System.out.println(s);
		System.out.println("Write done");
		hdfs.copyFromHDFS(""+args[0],args[0]+".out");
	}
}
