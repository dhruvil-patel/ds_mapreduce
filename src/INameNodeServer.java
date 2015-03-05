import java.util.ArrayList;
import java.util.HashMap;


public class INameNodeServer implements INameNode {

	
	 HashMap<String, ArrayList<Integer>> nameToBlocks = new HashMap <String,ArrayList<Integer>> ();
	 HashMap<Integer, String> handleToname = new HashMap <Integer,String> ();
	 HashMap<Integer, ArrayList<DataNodeLocation>> blockToNodes = new HashMap <Integer,ArrayList<DataNodeLocation>>();
	 
	 static int fileHandle = 0;
	
	@Override
	public byte[] openFile(byte[] input) {   //OpenFileResponse
		// TODO Auto-generated method stub
		OpenFileRequest openFileRequest = new OpenFileRequest(input);
		OpenFileResponse  openFileResponse = new OpenFileResponse();
				
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
				openFileResponse.blockNums.add(-1);
			}
		}else{				//write request
			fileHandle++;
			handleToname.put(fileHandle,openFileRequest.fileName);
			openFileResponse.handle = fileHandle;
			if(nameToBlocks.containsKey(openFileRequest.fileName)){   //file exists     
				openFileResponse.status = 1;
				openFileResponse.blockNums = (ArrayList<Integer>) nameToBlocks.get(openFileRequest.fileName);
			}else{			// file does not exist.
				ArrayList<Integer> block = new ArrayList<Integer>();
				nameToBlocks.put(openFileRequest.fileName, block);
				openFileResponse.status = 2;
				openFileResponse.blockNums.add(-1);			
			}
		}
		return openFileResponse.toProto();
	}

	@Override
	public byte[] closeFile(byte[] input) { //CloseFileRequest
		// TODO Auto-generated method stub
		
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

	@Override
	public byte[] getBlockLocations(byte[] BlockLocationRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] assignBlock(byte[] AssignBlockRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] list(byte[] ListFilesRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] blockReport(byte[] BlockReportRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] heartBeat(byte[] HeartBeatRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
