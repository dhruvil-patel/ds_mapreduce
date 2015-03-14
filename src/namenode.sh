#/usr/java/jdk1.7.0_75/bin/rmiregistry&
rm -r metadata
mkdir metadata
echo "1" > blocknumber
java -Djava.security.policy=server.policy HDFSPackage.INameNodeServer 