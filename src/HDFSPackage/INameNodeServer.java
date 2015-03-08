package HDFSPackage;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

import HDFSPackage.RequestResponse.AssignBlockRequest;
import HDFSPackage.RequestResponse.AssignBlockResponse;
import HDFSPackage.RequestResponse.BlockLocationRequest;
import HDFSPackage.RequestResponse.BlockLocationResponse;
import HDFSPackage.RequestResponse.BlockLocations;
import HDFSPackage.RequestResponse.BlockReportRequest;
import HDFSPackage.RequestResponse.BlockReportResponse;
import HDFSPackage.RequestResponse.CloseFileRequest;
import HDFSPackage.RequestResponse.CloseFileResponse;
import HDFSPackage.RequestResponse.DataNodeLocation;
import HDFSPackage.RequestResponse.HeartBeatRequest;
import HDFSPackage.RequestResponse.HeartBeatResponse;
import HDFSPackage.RequestResponse.ListFilesResponse;
import HDFSPackage.RequestResponse.OpenFileRequest;
import HDFSPackage.RequestResponse.OpenFileResponse;


public class INameNodeServer implements INameNode {

	
	 HashMap<String, ArrayList<Integer>> nameToBlocks = new HashMap <String,ArrayList<Integer>> ();
	 HashMap<Integer, String> handleToname = new HashMap <Integer,String> ();
	 HashMap<Integer, ArrayList<DataNodeLocation>> blockToNodes = new HashMap <Integer,ArrayList<DataNodeLocation>>();
	 HashMap<Integer,DataNodeLocation> aliveDataNodes = new HashMap<Integer,DataNodeLocation>();
	  
	 static int fileHandle = 0;
	 static int blockNumber = 25;   // Initialise from config
	 int replicatioFactor = 3;		// Initialise from config
	 long thresholdTime = 200;
	 private String configFile = "namenode.config";
	private String nameNodeDir;
	 static String NN_IP;
	
	public byte[] openFile(byte[] input) {   //OpenFileResponse
		OpenFileRequest openFileRequest = new OpenFileRequest(input);
		OpenFileResponse  openFileResponse = new OpenFileResponse();
		openFileRequest.fileName = nameNodeDir + "/" +openFileRequest.fileName;
		if(openFileRequest.forRead == true){     //read request
			if(nameToBlocks.containsKey(openFileRequest.fileName)){   //file exists     
				fileHandle++;
				handleToname.put(fileHandle,openFileRequest.fileName);
				openFileResponse.status = 1;
				openFileResponse.handle = fileHandle;
				openFileResponse.blockNums = (ArrayList<Integer>) nameToBlocks.get(openFileRequest.fileName);
			}else{			// file not exists		
				openFileResponse.status = -1;
				openFileResponse.handle = -1;
				openFileResponse.blockNums = new ArrayList<Integer>();
			}
		}else{				//write request
			fileHandle++;
			handleToname.put(fileHandle,openFileRequest.fileName);
			openFileResponse.handle = fileHandle;

			// Assume that file does not exist.
			ArrayList<Integer> block = new ArrayList<Integer>();
			nameToBlocks.put(openFileRequest.fileName, block);
			openFileResponse.status = 1;
			openFileResponse.blockNums = new ArrayList<Integer>();
		}
		
		return openFileResponse.toProto();
	}

	@Override
	public byte[] closeFile(byte[] input) { //CloseFileRequest
		CloseFileRequest closeFileRequest = new CloseFileRequest(input);
		CloseFileResponse closeFileResponse = new CloseFileResponse();
		if(handleToname.containsKey(closeFileRequest.handle)){			
			closeFileResponse.status = 1;
			handleToname.remove(closeFileRequest.handle);     
		}else{					
			closeFileResponse.status = -1;
		}
		return closeFileResponse.toProto();
	}
	boolean printmap = false;
	@Override
	public byte[] getBlockLocations(byte[] input) { //BlockLocationRequest
		if(!printmap){
			System.out.println("Map");
			for(Integer b : blockToNodes.keySet()){
				System.out.println(b +": " + blockToNodes.get(b).size());
			}
			printmap = true;
		}
		BlockLocationRequest blockLocationRequest = new BlockLocationRequest(input);
		BlockLocationResponse blockLocationResponse = new BlockLocationResponse();
		blockLocationResponse.status = 1; 
		System.out.println("getBlockreq # of blocks :"+blockLocationRequest.blockNums.size());
		for( int b : blockLocationRequest.blockNums){
			BlockLocations block = new BlockLocations();
			block.blockNumber = b;
			if(blockToNodes.containsKey(b)){
				block.locations = new ArrayList<RequestResponse.DataNodeLocation>(blockToNodes.get(b));
				blockLocationResponse.blockLocations.add(block);
				System.out.println("bl size : "+block.locations.size());
			}else
				blockLocationResponse.status = 0;
		}
		//set status;
		System.out.println("# of blocks " + blockLocationResponse.blockLocations.size());
		return blockLocationResponse.toProto();
	}

	@Override
	public byte[] assignBlock(byte[] input) {   //AssignBlockRequest 
		System.out.println("Assignblock");
		AssignBlockRequest assignBlockRequest = new AssignBlockRequest(input);
		AssignBlockResponse assignBlockResponse = new AssignBlockResponse();
		
		ArrayList<DataNodeLocation> allNodes = new ArrayList<DataNodeLocation>();
		allNodes.addAll(aliveDataNodes.values());
		Set<DataNodeLocation> node = new HashSet<>();
		
		int size = aliveDataNodes.size();
		Random randomGen = new Random();
		int i = 0;
		while(node.size() < replicatioFactor){
			int random = randomGen.nextInt(size);
			System.out.println("random "+random);
			System.out.println(allNodes.get(random).time + ":" + (System.currentTimeMillis() - thresholdTime));
			if(allNodes.get(random).time >= System.currentTimeMillis() - thresholdTime){
				node.add(allNodes.get(random));
			}
			i++;
		}
		System.out.println("Random selected" + node.size());
		/**
		 * Code to update nameToBlock mapping
		 */
		blockNumber++;
		ArrayList <Integer> blockList = new ArrayList<Integer>();
		String file = handleToname.get(assignBlockRequest.handle);
		if(nameToBlocks.containsKey(file)){
			blockList = nameToBlocks.get(file);
		}
		blockList.add(blockNumber);	
		nameToBlocks.put(file,blockList);	
		
		try {
			FileWriter fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			String data = Integer.toString(blockNumber) + ",";
			bw.append(data);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		allNodes.clear();
		allNodes.addAll(node);
		assignBlockResponse.newBlock.blockNumber = blockNumber;
		assignBlockResponse.newBlock.locations = allNodes;
		assignBlockResponse.status = 1 ;
		
		System.out.println(assignBlockResponse.newBlock.blockNumber +":" +assignBlockResponse.newBlock.locations.size());
		
		return assignBlockResponse.toProto();
	}

	@Override
	public byte[] list(byte[] input) {  //ListFilesRequest
		//ListFilesRequest listFileRequest = new ListFilesRequest(input);
		ListFilesResponse listFilesResponse = new ListFilesResponse();
		
		listFilesResponse.status = 1;
		Set<String> list = nameToBlocks.keySet();
		listFilesResponse.fileNames = new ArrayList<String>(list); 
		return listFilesResponse.toProto();
	}

	@Override
	public byte[] blockReport(byte[] input) {	//BlockLocationRequest 
		BlockReportRequest blockReportRequest = new BlockReportRequest(input);
		BlockReportResponse blockReportResponse = new BlockReportResponse();
	
		ArrayList <DataNodeLocation> dataNode;
		for(int b : blockReportRequest.blockNumbers){
			if(blockToNodes.containsKey(b)){
				dataNode = blockToNodes.get(b);
				boolean contains = false;
				for(DataNodeLocation d : dataNode){
					if(d.ip == blockReportRequest.location.ip){
						contains = true;
						break;
					}
				}
				
				if(!contains) {
					dataNode.add(blockReportRequest.location);
					blockToNodes.put(b,dataNode);
				}
			}else{
				dataNode = new ArrayList<DataNodeLocation>(); 
				dataNode.add(blockReportRequest.location);
				blockToNodes.put(b, dataNode);
			}
			blockReportResponse.status.add(1);
		}
		blockReportRequest.location.time = System.currentTimeMillis();
		aliveDataNodes.put(blockReportRequest.id, blockReportRequest.location);
		
		System.out.println("Block Report");
		return blockReportResponse.toProto();
	}

	@Override
	public byte[] heartBeat(byte[] input) {		//HeartBeatRequest
		HeartBeatRequest heartBeatRequest = new HeartBeatRequest(input);
		HeartBeatResponse heartBeatResponse = new HeartBeatResponse();
		DataNodeLocation dataNodeLocation = aliveDataNodes.get(heartBeatRequest.id);
		dataNodeLocation.time = System.currentTimeMillis();
		aliveDataNodes.put(heartBeatRequest.id, dataNodeLocation);
		heartBeatResponse.status = 1;
		System.out.println( heartBeatRequest.id + ":Heart Beat");
		return heartBeatResponse.toProto();
	}

	public INameNodeServer() throws RemoteException{
		try {
			FileInputStream  fi = new FileInputStream(configFile );
			Scanner sc = new Scanner(fi);
			while(sc.hasNext()){
				String tmp[] = sc.nextLine().split(",");
				if(tmp[0].compareTo("replicatioFactor") == 0){
					replicatioFactor = Integer.parseInt(tmp[1]);
				}
				if(tmp[0].compareTo("thresholdTime") == 0){
					thresholdTime = Integer.parseInt(tmp[1]);
				}
				if(tmp[0].compareTo("blockNumber") == 0){
					blockNumber = Integer.parseInt(tmp[1]);
				}
				if(tmp[0].compareTo("nameNodeIp") == 0){
					NN_IP = new String(tmp[1]);
				}
				if(tmp[0].compareTo("nameNodeDir") == 0){
					nameNodeDir = new String(tmp[1]);
				}
			}
			sc.close();
			
			// TODO load nameToBlock
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String args[]){
		try {
			String name = "NameNode";
            INameNode nameNode = new INameNodeServer();
            System.out.println(1);
            INameNode stub = (INameNode) UnicastRemoteObject.exportObject(nameNode, 0);
            Registry registry = LocateRegistry.getRegistry(NN_IP);
            registry.rebind(name, stub);
            System.out.println("NameNode bound");
        } catch (Exception e) {
           
            e.printStackTrace();
        }
	}
}
