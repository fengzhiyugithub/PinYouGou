## 一、开启虚拟机并启动zookeeper

提前安装并配置zookeeper，我这里使用xshell远程连接虚拟机。

进入zookeeper目录：

```
cd zookeeper-3.4.6
```

开启zookeeper：

```
[root@localhost zookeeper-3.4.6]# ./bin/zkServer.sh start 
JMX enabled by default
Using config: /root/zookeeper-3.4.6/bin/../conf/zoo.cfg
Starting zookeeper ... STARTED
```

## 二、运行dubbox的service和web

先右击dubboxdemo-service，run server => maven install ，在goals填写tomcat7:run

再右击dubboxdemo-web，run server => maven install ，在goals填写tomcat7:run。

## 三、浏览器中通过url访问

![1549107617186](C:\Users\fzhiy\AppData\Roaming\Typora\typora-user-images\1549107617186.png)

