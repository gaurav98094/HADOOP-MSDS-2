
# Partitioner Example Program



### Creating the JAR FILE
```bash
$ ../bin/hadoop com.sun.tools.javac.Main *.java
```
```bash
$ jar cf PART.jar *.class
```
<img src="img/part1.png">

<br>

### Input Files
```bash
$ vi inp_partitioner.txt
```

<img src="img/part2.png">


<br>

### Ingesting Input to HDFS
```bash
$ hadoop fs -put inp_partitioner.txt /
```
<img src="img/part3.png">

<br>

### Running MapReduce
```bash
$ hadoop jar PART.jar PartitionerExample /sample /output
```
<img src="img/part6.png">

### Output File
```bash
$ hadoop fs -cat /output_part/part-r-00000.txt
```
<img src="img/part4.png">