cd /HDFS/bin
rm -r ./data
mkdir ./data
#rmiregistry&
java -Djava.rmi.server.hostname="$1" -Djava.security.policy=client.policy HDFSPackage.IDataNodeServer 
