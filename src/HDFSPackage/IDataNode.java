package HDFSPackage;

import java.rmi.Remote;

public interface IDataNode extends Remote{

	/* ReadBlockResponse readBlock(ReadBlockRequest)) */
	/* Method to read data from any block given block-number */
	byte[] readBlock(byte[] ReadBlockRequest);
	
	/* WriteBlockResponse writeBlock(WriteBlockRequest) */
	/* Method to write data to a specific block */
	byte[] writeBlock(byte[] WriteBlockRequest);
}