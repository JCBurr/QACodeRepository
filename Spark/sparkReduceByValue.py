from pyspark import SparkConf, SparkContext

def BreakRecord(rec):
	record = rec.split("|")
	return (record[0], record[2])

con=SparkConf()
sc=SparkContext(conf=con)
RDD1 = sc.textFile("file:///home/cloudera/sparkTests/Results.txt")
header = RDD1.first()
RDD1 = RDD1.filter(row >= row != header)
RDD2 = RDD1.map(BreakRecord)
data = RDD2.collect()

print(data)
