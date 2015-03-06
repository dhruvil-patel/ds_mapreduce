import java.util.ArrayList;

public class BlockReportRequest {
	public DataNodeLocation location;
	ArrayList<Integer> blockNumbers;

	BlockReportRequest(byte[] input) {
		
	}

	byte[] toProto() {
		return null;
	}
}

class BlockReportResponse {
	ArrayList<Integer> status;

	BlockReportResponse(){
		status = new ArrayList<Integer> ();
	}
	
	BlockReportResponse(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class DataNodeLocation {
	int ip;
	int port;

	DataNodeLocation(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class HeartBeatRequest {
	int id;

	HeartBeatRequest(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class HeartBeatResponse {
	int status;

	HeartBeatResponse(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class WriteBlockRequest {
	BlockLocations blockInfo;

	WriteBlockRequest(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class BlockLocations {
	int blockNumber;
	ArrayList<DataNodeLocation> locations;

	BlockLocations(){
		
	}
	
	BlockLocations(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class WriteBlockResponse {
	int status;

	WriteBlockResponse(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class CloseFileRequest {
	int handle;

	CloseFileRequest(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class CloseFileResponse {
	int status;
	
	CloseFileResponse(){
		
	}

	CloseFileResponse(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class BlockLocationRequest {
	ArrayList<Integer> blockNums;

	BlockLocationRequest(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class BlockLocationResponse {
	int status;
	ArrayList<BlockLocations> blockLocations;

	BlockLocationResponse(){
		blockLocations = new ArrayList<BlockLocations>();
	}
	
	BlockLocationResponse(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class AssignBlockRequest {
	int handle;

	AssignBlockRequest(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class AssignBlockResponse {
	int status;
	BlockLocations newBlock;

	AssignBlockResponse(){
		
	}
	
	AssignBlockResponse(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class ListFilesRequest {
	String dirName;

	ListFilesRequest(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class ListFilesResponse {
	int status;
	String fileNames;

	ListFilesResponse(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class OpenFileRequest {
	String fileName;
	boolean forRead;

	
	OpenFileRequest(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class OpenFileResponse {
	int status;
	int handle;
	ArrayList<Integer> blockNums;

	OpenFileResponse(){
		
		blockNums = new ArrayList<Integer>();
		
	}
	
	OpenFileResponse(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class ReadBlockRequest {
	int blockNumber;

	ReadBlockRequest(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class ReadBlockResponse {
	int status;
	ArrayList<Byte> data;

	ReadBlockResponse(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}