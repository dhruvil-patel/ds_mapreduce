#/usr/java/jdk1.7.0_75/bin/rmiregistry&
rm -r metadata
mkdir metadata
java -Djava.security.policy=server.policy HDFSPackage.INameNodeServer 