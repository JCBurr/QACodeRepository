from pyspark import SparkConf, SparkContext

con=SparkConf()
sc=SparkContext(conf=con)
list1=[1,2,3,4,5,6,1,2,1,5,5,6]
RDD1 = sc.parallelize(list1)
data = RDD1.countByValue()
for A in data:
	print(A, "-", data[A])

