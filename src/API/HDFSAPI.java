package API;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Arrays;

import HDFSPackage.RequestResponse.AssignBlockResponse;
import HDFSPackage.RequestResponse.AssignBlockRequest;
import HDFSPackage.IDataNode;
import HDFSPackage.INameNode;
import HDFSPackage.RequestResponse.BlockLocationRequest;
import HDFSPackage.RequestResponse.BlockLocationResponse;
import HDFSPackage.RequestResponse.BlockLocations;
import HDFSPackage.RequestResponse.CloseFileRequest;
import HDFSPackage.RequestResponse.CloseFileResponse;
import HDFSPackage.RequestResponse.DataNodeLocation;
import HDFSPackage.RequestResponse.ListFilesRequest;
import HDFSPackage.RequestResponse.ListFilesResponse;
import HDFSPackage.RequestResponse.OpenFileRequest;
import HDFSPackage.RequestResponse.OpenFileResponse;
import HDFSPackage.RequestResponse.ReadBlockRequest;
import HDFSPackage.RequestResponse.ReadBlockResponse;
import HDFSPackage.RequestResponse.WriteBlockRequest;
import HDFSPackage.RequestResponse.WriteBlockResponse;

public class HDFSAPI {
	private INameNode nameNodeClient;
	private int blockSize = 8; 
	public HDFSAPI(String NN_IP,int _blockSize) throws RemoteException, NotBoundException{
		Registry registry = LocateRegistry.getRegistry(NN_IP);
		nameNodeClient = (INameNode) registry.lookup("NameNode");
		blockSize = _blockSize;
	}
	
	public boolean copyFromHDFS(String HDFSFileName,String localFileName) throws IOException{
		System.out.println("copy from hdfs : read");
		RandomAccessFile fd = new RandomAccessFile(localFileName, "rw");
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		OpenFileRequest openFileRequest = new OpenFileRequest(HDFSFileName,true);
		OpenFileResponse openFileResponse = new OpenFileResponse(nameNodeClient.openFile(openFileRequest.toProto()));
		System.out.println("copyFromHDFS: #of block"+ openFileResponse.blockNums.size());
		if(openFileResponse.status != 1){
			throw new FileNotFoundException("File Not found");
		}
		BlockLocationRequest blockLocationRequest = new BlockLocationRequest(openFileResponse.blockNums);
		//System.out.println( "2#of block" + blockLocationRequest.blockNums.size());
		//System.out.println("req size"+ blockLocationRequest.toProto().length);
		byte []tmp = nameNodeClient.getBlockLocations(blockLocationRequest.toProto());
		BlockLocationResponse blockLocationResponse = new BlockLocationResponse(tmp);
		//System.out.println("# of block locations " + blockLocationResponse.blockLocations.size());
		for(BlockLocations bls : blockLocationResponse.blockLocations){
			boolean readFlag = false;
			//System.out.println("# of dns" + bls.locations.size());
			for(DataNodeLocation dnl:bls.locations){
				try {
					Registry registry = LocateRegistry.getRegistry(intToIP(dnl.ip));
					IDataNode dataNodeClient = (IDataNode) registry.lookup("DataNode");
					ReadBlockRequest readBlockRequest = new ReadBlockRequest(bls.blockNumber);
					tmp = dataNodeClient.readBlock(readBlockRequest.toProto());
					ReadBlockResponse readBlockResponse = new ReadBlockResponse(tmp);
					if(readBlockResponse.status == 1){
						fd.write(readBlockResponse.data);
						readFlag = true;
						break;
					}else{
						//TODO Mark dataNode as down
					}
				} catch (NotBoundException | IOException e) {
					System.out.println("Failed to connect datanode " + dnl.ip );
				}
				
			}
			if(!readFlag)
				throw new RemoteException("None of datanodes are responding");
		}
		closeFile(openFileResponse.handle);
		fd.close();
		return true;
	}
	
	String intToIP(int ip) throws UnknownHostException{
		return InetAddress.getByAddress(unpack(ip)).getHostAddress();
	}
	
	byte[] unpack(int bytes) {
		  return new byte[] {
		    (byte)((bytes >>> 24) & 0xff),
		    (byte)((bytes >>> 16) & 0xff),
		    (byte)((bytes >>>  8) & 0xff),
		    (byte)((bytes       ) & 0xff)
		  };
	}
	
	public boolean copyToHDFS(String localFileName,String HDFSFileName) throws IOException, NotBoundException{
		byte[] buffer = new byte[blockSize];
		int handle;
		OpenFileRequest openFileRequest = new OpenFileRequest(HDFSFileName,false);
		byte []tmp =nameNodeClient.openFile(openFileRequest.toProto());
		OpenFileResponse openFileResponse = new OpenFileResponse(tmp);
		handle = openFileResponse.handle;
		System.out.println(handle);
		if(openFileResponse.status != 1){
			throw new FileNotFoundException("Unable to create file on NameNode");
		}
		RandomAccessFile fd = new RandomAccessFile(localFileName, "r");
		int lastread;
		while((lastread = fd.read(buffer))>0){
			AssignBlockRequest assignBlockRequest = new AssignBlockRequest(handle);
			tmp = nameNodeClient.assignBlock(assignBlockRequest.toProto());
			AssignBlockResponse assignBlockResponse = new AssignBlockResponse(tmp);
			int index = -1;
			for(DataNodeLocation dnl : assignBlockResponse.newBlock.locations){
				index++;
				Registry registry = LocateRegistry.getRegistry(intToIP(dnl.ip));
				System.out.println("Datanode to connect" + intToIP(dnl.ip));
				IDataNode dataNodeClient = (IDataNode) registry.lookup("DataNode");
				WriteBlockRequest writeBlockRequest = new WriteBlockRequest();
				writeBlockRequest.data = Arrays.copyOf(buffer, lastread);
				writeBlockRequest.blockInfo.locations.addAll(assignBlockResponse.newBlock.locations);
				writeBlockRequest.blockInfo.locations.remove(index);
				writeBlockRequest.blockInfo.blockNumber = assignBlockResponse.newBlock.blockNumber;
				tmp = dataNodeClient.writeBlock(writeBlockRequest.toProto());
				WriteBlockResponse writeBlockResponse = new WriteBlockResponse(tmp);
				if(writeBlockResponse.status == 1)
					break;
				else{
					//TODO Mark datanode as down
				}
			}
		}
		closeFile(handle);
		fd.close();
		return true;
	}
	/**
	 * 
	 * @param handle
	 * @throws RemoteException
	 */
	private void closeFile(int handle) throws RemoteException {
		CloseFileRequest closeFileRequest = new CloseFileRequest(handle);
		byte []tmp = nameNodeClient.closeFile(closeFileRequest.toProto());
		CloseFileResponse closeFileResponse = new CloseFileResponse(tmp);
		if(closeFileResponse.status==0)
			throw new RemoteException("File not close properly");		
	}

	public ArrayList<String> listFiles(String dirName) throws RemoteException{
		ListFilesRequest listFilesRequest = new ListFilesRequest(dirName);
		byte []tmp = nameNodeClient.list(listFilesRequest.toProto());
		ListFilesResponse listFilesResponse = new ListFilesResponse(tmp);
		if(listFilesResponse.status == 0){
			throw new RemoteException("Listfile fails");
		}
		return listFilesResponse.fileNames;
	}
}
