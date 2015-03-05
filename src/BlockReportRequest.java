import java.util.ArrayList;

public class BlockReportRequest {
	DataNodeLocation location;
	int blockNumbers[];

	BlockReportRequest(byte[] input) {
		
	}

	byte[] toProto() {
		return null;
	}
}

class BlockReportResponse {
	int status[];

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
	DataNodeLocation locations[];

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
	int blockNums[];

	BlockLocationRequest(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}

class BlockLocationResponse {
	int status;
	BlockLocations blockLocations[];

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
	byte data[];

	ReadBlockResponse(byte[] input) {

	}

	byte[] toProto() {
		return null;
	}
}