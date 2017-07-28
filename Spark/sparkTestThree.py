from pyspark import SparkConf, SparkContext

def doubleFunction(X):
	return (X * 2)

con=SparkConf()
sc=SparkContext(conf=con)
list1=[74,3,47,92,975]
RDD1 = sc.parallelize(list1)
RDD2=RDD1.map(doubleFunction)
data=RDD2.collect()
for A in data:
	print(A)

