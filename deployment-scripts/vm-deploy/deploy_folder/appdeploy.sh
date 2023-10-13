#! /bin/bash
set -o nounset
set -o errexit
##sed -i 's/\r$//' *.sh
APP_FILE_NAME=xxx
set killcmd {grep -v grep | awk '{print $2}' | xargs kill -9}
ps -ef | grep APP_FILE_NAME | $killcmd
nohup java -server -XX:+PrintGCDetails -XX:+PrintGCTimeStamps \
-Xloggc:./log/gc.log -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=3 \
-XX:GCLogFileSize=1024k -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=$remotefolder \
-Dspring.profiles.active=dev -jar $APP_FILE_NAME > /dev/null 2>&1 &
