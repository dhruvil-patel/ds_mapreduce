mountPath=`realpath ..`
echo $mountPath
sudo docker run -it -v "$mountPath":/HDFS --rm dockerfile/java /bin/bash /HDFS/src/datanode.sh