package HDFSPackage;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.file.Files;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import HDFSPackage.RequestResponse.BlockReportRequest;
import HDFSPackage.RequestResponse.DataNodeLocation;
import HDFSPackage.RequestResponse.ReadBlockRequest;
import HDFSPackage.RequestResponse.ReadBlockResponse;
import HDFSPackage.RequestResponse.WriteBlockRequest;
import HDFSPackage.RequestResponse.WriteBlockResponse;
import HDFSPackage.RequestResponse.HeartBeatRequest;

public class IDataNodeServer implements IDataNode {
	private static long heartbeatTimeInterval = 5000;
	int DN_ID;
	String NN_IP;
	String configFilePath = "datanode.config";
	INameNodeServer nameNodeClient;
	BlockReportRequest blockReport;
	byte []heartBeat = new HeartBeatRequest(DN_ID).toProto();
	private String dataNodeDir; 
    
	public IDataNodeServer() throws Exception {
		blockReport = new BlockReportRequest(new DataNodeLocation(), new ArrayList<Integer>());
		File file = new File(configFilePath);
		if(!file.exists()){
			throw new Exception("datanode.config does not exists");
		}
		Scanner sc = new Scanner(file);
		while(sc.hasNext()){
			String tmp[] = sc.nextLine().split(",");
			if(tmp[0].compareTo("id") == 0){
				DN_ID = Integer.parseInt(tmp[1]);
			}
			if(tmp[0].compareTo("port") == 0){
				blockReport.location.port = Integer.parseInt(tmp[1]);
			}
			if(tmp[0].compareTo("host") == 0){
				NN_IP = new String(tmp[1]);
			}
			if(tmp[0].compareTo("datanodeDir") == 0){
				dataNodeDir = new String(tmp[1]);
			}
			if(tmp[0].compareTo("heartbeatTimeInterval") == 0){
				heartbeatTimeInterval = Integer.parseInt(tmp[1]);
			}
		}
		sc.close();
		if(DN_ID == 0 || NN_IP.length() == 0){
			throw new Exception("Invalid DataNodeID in datanode.config");
		}
		
		Registry registry = LocateRegistry.getRegistry();
		nameNodeClient = (INameNodeServer) registry.lookup("NameNode");
		
		blockReport.location.ip = pack(InetAddress.getLocalHost().getAddress());
		System.out.println("DataNode IP : " + blockReport.location.ip);
		
		File folder = new File(dataNodeDir);
		File[] listOfFiles = folder.listFiles();

	    for (File blockFile : listOfFiles) {
	    	if (blockFile.isFile()) {
	    		System.out.println("File " + blockFile.getName());
	    		blockReport.blockNumbers.add(Integer.parseInt(blockFile.getName().split("_")[1]));
	    	}
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

	byte[] unpack(int bytes) {
		  return new byte[] {
		    (byte)((bytes >>> 24) & 0xff),
		    (byte)((bytes >>> 16) & 0xff),
		    (byte)((bytes >>>  8) & 0xff),
		    (byte)((bytes       ) & 0xff)
		  };
	}
	
	/**
	 * block file name : DNID_BlockNumber
	 */
	@Override
	public byte[] readBlock(byte[] readBlockRequest) {
		ReadBlockRequest readBlock = new ReadBlockRequest(readBlockRequest);
		File file = new File(DN_ID + "_" +readBlock.blockNumber);
		if(!file.exists()){
			try {
				throw new Exception(file.getName() + " not found");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			 return new ReadBlockResponse(1,Files.readAllBytes(file.toPath())).toProto();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			System.out.println("Finally:readBlock failed");
			return new ReadBlockResponse(0,null).toProto();
		}
	}

	@Override
	public byte[] writeBlock(byte[] writeBlockRequest) {
		WriteBlockRequest writeBlock = new WriteBlockRequest(writeBlockRequest);
		File file = new File(DN_ID + "_" + writeBlock.blockInfo);
		try {
			Files.write(file.toPath(), writeBlock.data);
			
			return new WriteBlockResponse(1).toProto();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			System.out.println("Finally:writeBlock failed");
			return new WriteBlockResponse(0).toProto();
		}
		
	}
	
	private void sendBlockReport() {		
		nameNodeClient.blockReport(blockReport.toProto());
	}
	private void sendHeartBeat() {
		nameNodeClient.heartBeat(heartBeat);
	}
	
	public static void main(String args[]) throws Exception{
		try {
			final IDataNodeServer dataNode = new IDataNodeServer();
		    dataNode.sendBlockReport();
		    new Timer().schedule(new TimerTask() {
		    	public void run()  {
		    		dataNode.sendHeartBeat();
		    	}
		    	}, 1, heartbeatTimeInterval);
		    String name = "DataNode";
            IDataNode stub = (IDataNode) UnicastRemoteObject.exportObject((Remote) dataNode, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind(name, (Remote) stub);
		} catch (RemoteException | NotBoundException e) {
			e.printStackTrace();
		};
	}

	

	

}
