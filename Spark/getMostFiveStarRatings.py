from pyspark import SparkConf, SparkContext

def GoldenEye(Rec):
	Record = Rec.split("|")
	if Record[1] == "GoldenEye (1995)":
		return True
	else:
		return False

def BreakRecords(Rec):
	Record = Rec.split("\t")
	return Record

def GetGoldenEyeRatings(Rec):
	if int(Rec[1]) == int(GoldenEyeData[0]):
		return True
	else:
		return False

def ReduceListToRatings(Rec):
	return Rec[2]

con=SparkConf()
sc=SparkContext(conf=con)
RDD1 = sc.textFile("file:///home/cloudera/sparkTests/DataFiles/Movies.item")
RDD2 = sc.textFile("file:///home/cloudera/sparkTests/DataFiles/Moving-Ratings-Done.data")

GoldenEyeData = RDD1.filter(GoldenEye).collect()[0]

RDD3 = RDD2.map(BreakRecords)
RDD4 = RDD3.filter(GetGoldenEyeRatings)
RDD5 = RDD4.map(ReduceListToRatings)
data = RDD5.countByValue()


print(data)
