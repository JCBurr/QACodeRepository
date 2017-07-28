from pyspark import SparkConf, SparkContext



con=SparkConf()
sc=SparkContext(conf=con)
list1=[74,3,47,92,975]
RDD1 = sc.parallelize(list1)
data=RDD1.collect()
for A in data:
	print(A)

