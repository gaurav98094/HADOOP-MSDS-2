# Date : 4th Jan 2021


## Items to Install
1. Ubuntu : Operating System (Preferably Dual Boot if you use windows)
2. Java JDK : Programming Language
3. Hadoop : Tool Package for BDA

## Some Terminologies
1. NameNode : keeps the directory tree of all files in the file system, and tracks where across the cluster the file data is kept
2. Secondary NN :takes checkpoints of the file system metadata present on namenode
3. DataNode : block server that stores the data in the local file
4. Distributed COmputing : Hadoop is a popular open source distributed computing platform under the Apache Software Foundation. It distributes wirks accross various datanode.
5. Key : unique id that identifies tasks
6. Map : Map takes a set of data and converts it into another set of data, where individual elements are broken down into keys.
7. Reduce : combines all outputs of small tasks and gives final output.
8. Node Manneger : monitoring their resource usage and reporting the same to the ResourceManager.
9. Resource Manager : allocates resources like memory, cpu etc.

## Start Hadoop
```bash
$ start dfs.sh
$ start yarn.sh
```

## Six Things that should run
- Name Node
- Secondary Name Node
- Node Manager
- Resourse Manager
- Data Node
- Job Process Scheduler (JPS)

## What is Single Cluster Hadoop ?
It has 1 Name Node, 1 Secondary Name Node, Data Node.


### How to compile Hadoop Job?
- Write the program lets say fraud_det.java
- $ javac fraud_det.java
- Create jar file
- Run the Jar file

### Some Extra Terminologies
- HDFS : Hadoop Distributed File System
- YARN : Yet Another Resourse Negotiater

# Date : 5th Jan 2021