import java.util.ArrayList;
import java.util.HashMap;


public class INameNodeServer implements INameNode {

	
	 HashMap nameToBlocks = new HashMap <String,ArrayList> ();
	 HashMap handleToname = new HashMap <Long,String> ();
	 static int fileHandle = 0;
	
	@Override
	public byte[] openFile(byte[] input) {   //OpenFileResponse
		// TODO Auto-generated method stub
		OpenFileRequest openFileRequest = new OpenFileRequest(input);
		OpenFileResponse  openFileResponse = null;
		
		if(openFileRequest.forRead == true){
			if(nameToBlocks.containsKey(openFileRequest.fileName )){      //Read Request
				fileHandle++;
				handleToname.put(fileHandle,openFileRequest.fileName);
				openFileResponse.status = 1;
				openFileResponse.handle = fileHandle;
				openFileResponse.blockNums = (ArrayList<Integer>) nameToBlocks.get(openFileRequest.fileName);
								
			}else{
				openFileResponse = new OpenFileResponse();
				
			}
		}else{							//Write Request 
			
		}
			
		
		return openFileResponse.toProto();
		
	}

	@Override
	public byte[] closeFile(byte[] CloseFileRequest) {
		// TODO Auto-generated method stub
		return null;
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
