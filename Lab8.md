
# Evaluating Number of Products Sold in Each Country in the online shopping portal



### Creating the JAR FILE
```bash
$ ../bin/hadoop com.sun.tools.javac.Main *.java
```
<img src="img/sales1.png">

```bash
$ jar cf KNN.jar *.class
```
<img src="img/sales2.png">

<br>

### Input Files
```bash
$ cat sales.txt
```

<img src="img/sales3.png">


<br>

### Ingesting Input to HDFS
```bash
$ hadoop fs -put sample /
```
<img src="img/sales6.png">

<br>

### Running MapReduce
```bash
$ hadoop jar Sales.jar SingleMapperReducer /sample /output
```
<img src="img/sales6.png">

### Output File
```bash
$ hadoop fs -cat /output

```
<img src="img/sales77.png">