cd /HDFS/bin
mkdir data
rmiregistry&
java -Djava.security.policy=client.policy HDFSPackage.IDataNodeServer