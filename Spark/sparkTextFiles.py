from pyspark import SparkConf, SparkContext

def BreakRecord(Rec):
	Record = Rec.split("|")
	if Record[2] == "M":
		return True
	else:
		return False

con=SparkConf()
sc=SparkContext(conf=con)
RDD1 = sc.textFile("file:///home/cloudera/Downloads/Users.txt")
RDD2 = RDD1.filter(BreakRecord)
data = RDD2.collect()

for A in data:
	print(A)
