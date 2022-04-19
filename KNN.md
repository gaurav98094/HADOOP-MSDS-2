
# K MeansClustering



### Creating the JAR FILE
```bash
$ ../bin/hadoop com.sun.tools.javac.Main *.java
```
<img src="img/KNN1.png">

```bash
$ jar cf KNN.jar *.class
```
<img src="img/KNN2.png">

<br>

### Input Files
```bash
$ vi input.txt
```

<img src="img/KNN3.png">


<br>

### Ingesting Input to HDFS
```bash
$ hadoop fs -put sample /
```
<img src="img/KNN5.png">

<br>

### Running MapReduce
```bash
$ hadoop jar KNN.jar KMeans /sample /output
```
<img src="img/KNN7.png">

### Output File
```bash
$ hadoop fs -cat /output/centroids.txt
```
<img src="img/KNN6.png">