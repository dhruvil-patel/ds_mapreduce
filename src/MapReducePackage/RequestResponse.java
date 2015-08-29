package MapReducePackage;

/**
 *  This wraps all the classes of MAPREDUCE.java and provides additional methods for access of data. 
 */

import java.util.ArrayList;
import java.util.Arrays;

import MapReducePackage.MapReduce;
import MapReducePackage.MapReduce.ReducerTaskInfo.Builder;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

public interface RequestResponse {

	public class JobSubmitRequest {
		public String mapName;
		public String reducerName;
		public String inputFile;
		public String outputFile;
		public int numReduceTasks;

		public JobSubmitRequest() {

		}

		public JobSubmitRequest(String _mapName, String _reducerName, String _inputFile, String _outputFile,
				int _numReduceTasks) {
			mapName = _mapName;
			reducerName = _reducerName;
			inputFile = _inputFile;
			outputFile = _outputFile;
			numReduceTasks = _numReduceTasks;
		}

		public JobSubmitRequest(byte[] input) {
			MapReduce.JobSubmitRequest builder = null;
			try {
				builder = MapReduce.JobSubmitRequest.parseFrom(input);
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}

			mapName = builder.getMapName();
			reducerName = builder.getReducerName();
			inputFile = builder.getInputFile();
			outputFile = builder.getOutputFile();
			numReduceTasks = builder.getNumReduceTasks();
		}

		public byte[] toProto() {
			MapReduce.JobSubmitRequest.Builder builder = MapReduce.JobSubmitRequest.newBuilder();
			builder.setMapName(mapName);
			builder.setReducerName(reducerName);
			builder.setInputFile(inputFile);
			builder.setOutputFile(outputFile);
			builder.setNumReduceTasks(numReduceTasks);
			return builder.build().toByteArray();
		}
	}

	public class JobSubmitResponse {
		public int status;
		public int jobId;

		public JobSubmitResponse() {

		}

		public JobSubmitResponse(int _status, int _jobId) {
			status = _status;
			jobId = _jobId;
		}

		public JobSubmitResponse(byte[] input) {
			MapReduce.JobSubmitResponse builder = null;
			try {
				builder = MapReduce.JobSubmitResponse.parseFrom(input);
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}

			status = builder.getStatus();
			jobId = builder.getJobId();
		}

		public byte[] toProto() {
			MapReduce.JobSubmitResponse.Builder builder = MapReduce.JobSubmitResponse.newBuilder();
			builder.setStatus(status);
			builder.setJobId(jobId);
			return builder.build().toByteArray();
		}
	}

	public class JobStatusRequest {
		public int jobId;

		public JobStatusRequest() {

		}

		public JobStatusRequest(int _jobId) {
			jobId = _jobId;
		}

		public JobStatusRequest(byte[] input) {
			MapReduce.JobStatusRequest builder = null;
			try {
				builder = MapReduce.JobStatusRequest.parseFrom(input);
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}

			jobId = builder.getJobId();
		}

		public byte[] toProto() {
			MapReduce.JobStatusRequest.Builder builder = MapReduce.JobStatusRequest.newBuilder();
			builder.setJobId(jobId);
			return builder.build().toByteArray();
		}
	}

	public class JobStatusResponse {
		public int status;
		public boolean jobDone;
		public int totalMapTasks;
		public int numMapTasksStarted;
		public int totalReduceTasks;
		public int numReduceTasksStarted;

		public JobStatusResponse() {

		}

		public JobStatusResponse(int _status, boolean _jobDone, int _totalMapTasks, int _numMapTasksStarted,
				int _totalReduceTasks, int _numReduceTasksStarted) {
			status = _status;
			jobDone = _jobDone;
			totalMapTasks = _totalMapTasks;
			numMapTasksStarted = _numMapTasksStarted;
			totalReduceTasks = _totalReduceTasks;
			numReduceTasksStarted = _numReduceTasksStarted;
		}

		public JobStatusResponse(byte[] input) {
			MapReduce.JobStatusResponse builder = null;
			try {
				builder = MapReduce.JobStatusResponse.parseFrom(input);
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}

			status = builder.getStatus();
			jobDone = builder.getJobDone();
			totalMapTasks = builder.getTotalMapTasks();
			numMapTasksStarted = builder.getNumMapTasksStarted();
			totalReduceTasks = builder.getTotalReduceTasks();
			numReduceTasksStarted = builder.getNumReduceTasksStarted();
		}

		public byte[] toProto() {
			MapReduce.JobStatusResponse.Builder builder = MapReduce.JobStatusResponse.newBuilder();
			builder.setStatus(status);
			builder.setJobDone(jobDone);
			builder.setTotalMapTasks(totalMapTasks);
			builder.setNumMapTasksStarted(numMapTasksStarted);
			builder.setTotalReduceTasks(totalReduceTasks);
			builder.setNumReduceTasksStarted(numReduceTasksStarted);
			return builder.build().toByteArray();
		}
	}

	public class MapTaskStatus {
		public int jobId;
		public int taskId;
		public boolean taskCompleted;
		public String mapOutputFile;

		public MapTaskStatus() {

		}

		public MapTaskStatus(MapReduce.MapTaskStatus mpst) {
			jobId = mpst.getJobId();
			taskId = mpst.getTaskId();
			taskCompleted = mpst.getTaskCompleted();
			mapOutputFile = mpst.getMapOutputFile();
		}

		public MapTaskStatus(int _jobId, int _taskId, boolean _taskCompleted, String _mapOutputFile) {
			jobId = _jobId;
			taskId = _taskId;
			taskCompleted = _taskCompleted;
			mapOutputFile = _mapOutputFile;
		}

		public MapTaskStatus(byte[] input) {
			MapReduce.MapTaskStatus builder = null;
			try {
				builder = MapReduce.MapTaskStatus.parseFrom(input);
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}

			jobId = builder.getJobId();
			taskId = builder.getTaskId();
			taskCompleted = builder.getTaskCompleted();
			mapOutputFile = builder.getMapOutputFile();
		}

		public MapReduce.MapTaskStatus.Builder toProtoObject() {
			MapReduce.MapTaskStatus.Builder mapTaskStatusBuilder = MapReduce.MapTaskStatus.newBuilder();
			mapTaskStatusBuilder.setJobId(jobId);
			mapTaskStatusBuilder.setTaskId(taskId);
			mapTaskStatusBuilder.setTaskCompleted(taskCompleted);
			mapTaskStatusBuilder.setMapOutputFile(mapOutputFile);
			return mapTaskStatusBuilder;
		}

		public byte[] toProto() {
			MapReduce.MapTaskStatus.Builder builder = MapReduce.MapTaskStatus.newBuilder();
			builder.setJobId(jobId);
			builder.setTaskId(taskId);
			builder.setTaskCompleted(taskCompleted);
			builder.setMapOutputFile(mapOutputFile);
			return builder.build().toByteArray();
		}
	}

	public class ReduceTaskStatus {
		public int jobId;
		public int taskId;
		public boolean taskCompleted;

		public ReduceTaskStatus() {

		}

		public ReduceTaskStatus(MapReducePackage.MapReduce.ReduceTaskStatus rdst) {
			jobId = rdst.getJobId();
			taskId = rdst.getTaskId();
			taskCompleted = rdst.getTaskCompleted();
		}

		public ReduceTaskStatus(int _jobId, int _taskId, boolean _taskCompleted) {
			jobId = _jobId;
			taskId = _taskId;
			taskCompleted = _taskCompleted;
		}

		public ReduceTaskStatus(byte[] input) {
			MapReduce.ReduceTaskStatus builder = null;
			try {
				builder = MapReduce.ReduceTaskStatus.parseFrom(input);
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}

			jobId = builder.getJobId();
			taskId = builder.getTaskId();
			taskCompleted = builder.getTaskCompleted();
		}

		public MapReduce.ReduceTaskStatus.Builder toProtoObject() {
			MapReduce.ReduceTaskStatus.Builder reduceTaskBuilder = MapReduce.ReduceTaskStatus.newBuilder();
			reduceTaskBuilder.setJobId(jobId);
			reduceTaskBuilder.setTaskId(taskId);
			reduceTaskBuilder.setTaskCompleted(taskCompleted);
			return reduceTaskBuilder;
		}

		public byte[] toProto() {
			MapReduce.ReduceTaskStatus.Builder builder = MapReduce.ReduceTaskStatus.newBuilder();
			builder.setJobId(jobId);
			builder.setTaskId(taskId);
			builder.setTaskCompleted(taskCompleted);
			return builder.build().toByteArray();
		}
	}

	public class HeartBeatRequest {
		public int taskTrackerId;
		public int numMapSlotsFree;
		public int numReduceSlotsFree;
		public ArrayList<MapTaskStatus> mapStatus;
		public ArrayList<ReduceTaskStatus> reduceStatus;

		public HeartBeatRequest() {
			mapStatus = new ArrayList<MapTaskStatus>();
			reduceStatus = new ArrayList<ReduceTaskStatus>();
		}

		public HeartBeatRequest(int _taskTrackerId, int _numMapSlotsFree, int _numReduceSlotsFree,
				ArrayList<MapTaskStatus> _mapStatus, ArrayList<ReduceTaskStatus> _reduceStatus) {
			taskTrackerId = _taskTrackerId;
			numMapSlotsFree = _numMapSlotsFree;
			numReduceSlotsFree = _numReduceSlotsFree;
			mapStatus = _mapStatus;
			reduceStatus = _reduceStatus;
		}

		public HeartBeatRequest(byte[] input) {
			MapReduce.HeartBeatRequest builder = null;
			try {
				builder = MapReduce.HeartBeatRequest.parseFrom(input);
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}

			taskTrackerId = builder.getTaskTrackerId();
			numMapSlotsFree = builder.getNumMapSlotsFree();
			numReduceSlotsFree = builder.getNumReduceSlotsFree();
			mapStatus = new ArrayList<RequestResponse.MapTaskStatus>();
			for (MapReduce.MapTaskStatus mpst : builder.getMapStatusList()) {
				mapStatus.add(new MapTaskStatus(mpst));
			}
			reduceStatus = new ArrayList<RequestResponse.ReduceTaskStatus>();
			for (MapReduce.ReduceTaskStatus rdst : builder.getReduceStatusList()) {
				reduceStatus.add(new ReduceTaskStatus(rdst));
			}
		}

		public byte[] toProto() {
			MapReduce.HeartBeatRequest.Builder builder = MapReduce.HeartBeatRequest.newBuilder();
			builder.setTaskTrackerId(taskTrackerId);
			builder.setNumMapSlotsFree(numMapSlotsFree);
			builder.setNumReduceSlotsFree(numReduceSlotsFree);
			for (MapTaskStatus mpst : mapStatus) {
				builder.addMapStatus(mpst.toProtoObject());
			}
			for (ReduceTaskStatus rdst : reduceStatus) {
				builder.addReduceStatus(rdst.toProtoObject());
			}
			return builder.build().toByteArray();
		}
	}

	public class MapTaskInfo {
		public int jobId;
		public int taskId;
		public String mapName;
		ArrayList<Integer> inputBlocks;

		public MapTaskInfo() {
			inputBlocks = new ArrayList<Integer>();
		}

		public MapTaskInfo(MapReduce.MapTaskInfo mapTaskInfo) {
			jobId = mapTaskInfo.getJobId();
			taskId = mapTaskInfo.getTaskId();
			mapName = mapTaskInfo.getMapName();
			inputBlocks = new ArrayList<Integer>();
			for (int block : mapTaskInfo.getInputBlocksList()) {
				inputBlocks.add(block);
			}
		}

		public MapTaskInfo(int _jobId, int _taskId, String _mapName, ArrayList<Integer> _inputBlocks) {
			jobId = _jobId;
			taskId = _taskId;
			mapName = _mapName;
			inputBlocks = _inputBlocks;
		}

		public MapTaskInfo(byte[] input) {
			MapReduce.MapTaskInfo builder = null;
			try {
				builder = MapReduce.MapTaskInfo.parseFrom(input);
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}

			jobId = builder.getJobId();
			taskId = builder.getTaskId();
			mapName = builder.getMapName();
			inputBlocks = new ArrayList<Integer>();
			for (int block : builder.getInputBlocksList()) {
				inputBlocks.add(block);
			}
		}

		public MapReduce.MapTaskInfo.Builder toProtoObject() {
			MapReduce.MapTaskInfo.Builder mapTaskInfoBuilder = MapReduce.MapTaskInfo.newBuilder();
			mapTaskInfoBuilder.setJobId(jobId);
			mapTaskInfoBuilder.setTaskId(taskId);
			mapTaskInfoBuilder.setMapName(mapName);
			for (int blocks : inputBlocks) {
				mapTaskInfoBuilder.addInputBlocks(blocks);
			}
			return mapTaskInfoBuilder;
		}

		public byte[] toProto() {
			MapReduce.MapTaskInfo.Builder builder = MapReduce.MapTaskInfo.newBuilder();
			builder.setJobId(jobId);
			builder.setTaskId(taskId);
			builder.setMapName(mapName);
			for (int blocks : inputBlocks) {
				builder.addInputBlocks(blocks);
			}
			return builder.build().toByteArray();
		}
	}

	public class ReducerTaskInfo {
		public int jobId;
		public int taskId;
		public String reducerName;
		ArrayList<String> mapOutputFiles;
		public String outputFile;

		public ReducerTaskInfo() {
			mapOutputFiles = new ArrayList<String>();
		}

		public ReducerTaskInfo(MapReduce.ReducerTaskInfo reduceTaskInfo) {
			jobId = reduceTaskInfo.getJobId();
			taskId = reduceTaskInfo.getTaskId();
			reducerName = reduceTaskInfo.getReducerName();
			mapOutputFiles = new ArrayList<String>();
			for (String file : reduceTaskInfo.getMapOutputFilesList()) {
				mapOutputFiles.add(file);
			}
			outputFile = reduceTaskInfo.getOutputFile();
		}

		public ReducerTaskInfo(int _jobId, int _taskId, String _reducerName, ArrayList<String> _mapOutputFiles,
				String _outputFile) {
			jobId = _jobId;
			taskId = _taskId;
			reducerName = _reducerName;
			mapOutputFiles = _mapOutputFiles;
			outputFile = _outputFile;
		}

		public ReducerTaskInfo(byte[] input) {
			MapReduce.ReducerTaskInfo builder = null;
			try {
				builder = MapReduce.ReducerTaskInfo.parseFrom(input);
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}

			jobId = builder.getJobId();
			taskId = builder.getTaskId();
			reducerName = builder.getReducerName();
			mapOutputFiles = new ArrayList<String>();
			for (String file : builder.getMapOutputFilesList()) {
				mapOutputFiles.add(file);
			}
			outputFile = builder.getOutputFile();
		}

		public MapReduce.ReducerTaskInfo.Builder toProtoObject() {
			MapReduce.ReducerTaskInfo.Builder reducerTaskInfoBuilder = MapReduce.ReducerTaskInfo.newBuilder();
			reducerTaskInfoBuilder.setJobId(jobId);
			reducerTaskInfoBuilder.setTaskId(taskId);
			reducerTaskInfoBuilder.setReducerName(reducerName);
			for (String file : mapOutputFiles) {
				reducerTaskInfoBuilder.addMapOutputFiles(file);
			}
			reducerTaskInfoBuilder.setOutputFile(outputFile);
			return reducerTaskInfoBuilder;
		}

		public byte[] toProto() {
			MapReduce.ReducerTaskInfo.Builder builder = MapReduce.ReducerTaskInfo.newBuilder();
			builder.setJobId(jobId);
			builder.setTaskId(taskId);
			builder.setReducerName(reducerName);
			for (String file : mapOutputFiles) {
				builder.addMapOutputFiles(file);
			}
			builder.setOutputFile(outputFile);
			return builder.build().toByteArray();
		}
	}

	public class HeartBeatResponse {
		public int status;
		ArrayList<MapTaskInfo> mapTasks;
		ArrayList<ReducerTaskInfo> reduceTasks;

		public HeartBeatResponse() {
			mapTasks = new ArrayList<MapTaskInfo>();
			reduceTasks = new ArrayList<ReducerTaskInfo>();
		}

		public HeartBeatResponse(int _status, ArrayList<MapTaskInfo> _mapTasks,
				ArrayList<ReducerTaskInfo> _reduceTasks) {
			status = _status;
			mapTasks = _mapTasks;
			reduceTasks = _reduceTasks;
		}

		public HeartBeatResponse(byte[] input) {
			MapReduce.HeartBeatResponse builder = null;
			try {
				if (input == null)
					System.out.println("TT:input Null");
				builder = MapReduce.HeartBeatResponse.parseFrom(input);
			} catch (InvalidProtocolBufferException e) {
				e.printStackTrace();
			}

			status = builder.getStatus();
			mapTasks = new ArrayList<RequestResponse.MapTaskInfo>();
			for (MapReduce.MapTaskInfo mpinfo : builder.getMapTasksList()) {
				mapTasks.add(new MapTaskInfo(mpinfo));
			}
			reduceTasks = new ArrayList<RequestResponse.ReducerTaskInfo>();
			for (MapReduce.ReducerTaskInfo rdinfo : builder.getReduceTasksList()) {
				reduceTasks.add(new ReducerTaskInfo(rdinfo));
			}
		}

		public byte[] toProto() {
			MapReduce.HeartBeatResponse.Builder builder = MapReduce.HeartBeatResponse.newBuilder();
			builder.setStatus(status);
			for (MapTaskInfo mpinfo : mapTasks) {
				builder.addMapTasks(mpinfo.toProtoObject());
			}
			for (ReducerTaskInfo rdinfo : reduceTasks) {
				builder.addReduceTasks(rdinfo.toProtoObject());
			}
			return builder.build().toByteArray();
		}
	}
}
