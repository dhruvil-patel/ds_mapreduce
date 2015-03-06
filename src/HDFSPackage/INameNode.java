package HDFSPackage;
public interface INameNode {

	/* OpenFileResponse openFile(OpenFileRequest) */
	/* Method to open a file given file name with read-write flag*/
	byte[] openFile(byte[] OpenFileRequest);
	
	/* CloseFileResponse closeFile(CloseFileRequest) */
	byte[] closeFile(byte[] CloseFileRequest);
	
	/* BlockLocationResponse getBlockLocations(BlockLocationRequest) */
	/* Method to get block locations given an array of block numbers */
	byte[] getBlockLocations(byte[] BlockLocationRequest);
	
	/* AssignBlockResponse assignBlock(AssignBlockRequest) */
	/* Method to assign a block which will return the replicated block locations */
	byte[] assignBlock(byte[] AssignBlockRequest);
	
	/* ListFilesResponse list(ListFilesRequest) */
	/* List the file names (no directories needed for current implementation */
	byte[] list(byte[] ListFilesRequest);
	
	/*
		Datanode <-> Namenode interaction methods
	*/
	
	/* BlockReportResponse blockReport(BlockReportRequest) */
	/* Get the status for blocks */
	byte[] blockReport(byte[] BlockReportRequest);
	
	/* HeartBeatResponse heartBeat(HeartBeatRequest) */
	/* Heartbeat messages between NameNode and DataNode */
	byte[] heartBeat(byte[] HeartBeatRequest);
}
