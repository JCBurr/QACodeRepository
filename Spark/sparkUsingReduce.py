from pyspark import SparkConf, SparkContext

def FindMaxValue(A, B):
	if A > B:
		return A
	else:
		return B


con=SparkConf()
sc=SparkContext(conf=con)
list1=[1,2,3,4,5,92,1,93,1,145,5,6]
RDD1 = sc.parallelize(list1)
maxValue = RDD1.reduce(FindMaxValue)

print("Max value in list is ", maxValue)


