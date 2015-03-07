mountPath=`realpath $1`
echo $mountPath
sudo docker run -it -v "$mountPath":/HDFS --rm dockerfile/java