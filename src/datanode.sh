cd /HDFS/bin
rm -r ./data
mkdir ./data
rmiregistry&
java -Djava.security.policy=client.policy HDFSPackage.IDataNodeServer "$1" &
java -Djava.security.policy=client.policy MapReducePackage.TaskTracker "$2"