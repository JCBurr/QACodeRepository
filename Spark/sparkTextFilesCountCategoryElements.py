from pyspark import SparkConf, SparkContext

def BreakRecordMales(Rec):
	Record = Rec.split("|")
	if Record[2] == "M":
		return True
	else:
		return False

def BreakRecordFemales(Rec):
	Record = Rec.split("|")
	if Record[2] == "F":
		return True
	else:
		return False

con=SparkConf()
sc=SparkContext(conf=con)
RDD1 = sc.textFile("file:///home/cloudera/Downloads/Users.txt")
RDD2 = RDD1.filter(BreakRecordMales)
RDD3 = RDD1.filter(BreakRecordFemales)
dataMales = RDD2.count()
dataFemales = RDD3.count()


print(dataMales, " males and ", dataFemales, " females.")


