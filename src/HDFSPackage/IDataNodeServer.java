package HDFSPackage;
import HDFSPackage.RequestResponse.*;

public class IDataNodeServer implements IDataNode {

	@Override
	public byte[] readBlock(byte[] readBlockRequest) {
		// TODO Auto-generated method stub
		
		ReadBlockRequest  readblock= new ReadBlockRequest(readBlockRequest);
		
		
		
		return null;
	}

	@Override
	public byte[] writeBlock(byte[] writeBlockRequest) {
		// TODO Auto-generated method stub
		
		WriteBlockRequest  writeblock= new WriteBlockRequest(writeBlockRequest);
		return null;
	}

}
