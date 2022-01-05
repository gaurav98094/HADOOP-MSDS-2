# Date : 4th Jan 2021


## Items to Install
1. Ubuntu : Operating System (Preferably Dual Boot if you use windows)
2. Java JDK : Programming Language
3. Hadoop : Tool Package for BDA

## Download Links
- https://ubuntu.com/download/desktop
- https://www.oracle.com/java/technologies/downloads/
- https://hadoop.apache.org/releases.html

## Some Terminologies
1. NameNode : keeps the directory tree of all files in the file system, and tracks where across the cluster the file data is kept
2. Secondary NN :takes checkpoints of the file system metadata present on namenode
3. DataNode : block server that stores the data in the local file
4. Distributed COmputing : Hadoop is a popular open source distributed computing platform under the Apache Software Foundation. It distributes wirks accross various datanode.
5. Key : unique id that identifies tasks
6. Map : Map takes a set of data and converts it into another set of data, where individual elements are broken down into keys.
7. Reduce : combines all outputs of small tasks and gives final output.
8. Node Manneger : monitoring their resource usage and reporting the same to the ResourceManager.
9. Resource Manager : allocates resources like memory, cpu etc. It manages the use of resources across the cluster

## Start Hadoop
```bash
$ start-dfs.sh
$ start-yarn.sh
```

## Invention of Benzene (see dreams 😂😂)
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/Ouroboros-benzene.svg/200px-Ouroboros-benzene.svg.png">

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

# Date : 4th Jan 2021

## Installation Guide
### Step 1 : Update sudo
```
$ sudo apt-get-update
```
### Step 2 : Install JDK
```
$ sudo apt-get install default-jdk
$ java -version
```

### Step 3 : Hadoop
```
$ sudo addgroup hadoop
$ sudo adduser --ingroup hadoop hduser
```

### Step 4 : SSH
```
$ sudo apt-get install ssh
$ which ssh
$ which sshd
```


### Step 5 : Login to SSHD
```
$ su hduser
$ ssh-keygen -t rsa -P ""
```



