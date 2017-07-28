from pyspark import SparkConf, SparkContext

def GetJobs(rec):
	record = rec.split("|")
	return (record[3])

def GetProgrammers(rec):
	if rec == "programmer":
		return True
	else:
		return False

con=SparkConf()
sc=SparkContext(conf=con)
RDD1 = sc.textFile("file:///home/cloudera/Downloads/Users.txt")
header = RDD1.first()

RDD2 = RDD1.map(GetJobs)
data2 = RDD2.countByValue()


RDD3 = RDD2.filter(GetProgrammers)
data = RDD3.count()

print("Number of programmers = ", data)
print(data2)
