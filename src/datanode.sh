cd /HDFS/bin
rm -r "./data$3"
mkdir "./data$3"
rmiregistry&
java -Djava.security.policy=client.policy HDFSPackage.IDataNodeServer "$1" &
java -Djava.security.policy=client.policy MapReducePackage.TaskTracker "$2"