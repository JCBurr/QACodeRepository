from pyspark import SparkConf, SparkContext

def check(x):
	if x > 10:
		return True
	else:
		return False

con=SparkConf()
sc=SparkContext(conf=con)
list1=[12,2,34,4,519,6,1,23,11,5,50,6]
RDD1 = sc.parallelize(list1)
RDD2 = RDD1.filter(check)
data1 = RDD2.collect()
for a in data1:
	print(a)

