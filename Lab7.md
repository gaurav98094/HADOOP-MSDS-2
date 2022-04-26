
# Count the number of missing and invalid values by joining two large given datasets


### Coping from local
```bash
$ hdfs dfs -copyFromLocal DeptStrength.txt DeptName.txt /
```
<img src="img/loc1.webp">


### Creating the JAR File
```bash
$ hadoop jar MapReduceJoin.jar MapReduceJoin/JoinDriver/DeptStrength.txt /DeptName.txt /output_mapreducejoin
```

<img src="img/loc23.png">


<br>

### Output File
```bash
$ hdfs dfs -cat /output_mapreducejoin/part-00000

```
<img src="img/loc24.png">