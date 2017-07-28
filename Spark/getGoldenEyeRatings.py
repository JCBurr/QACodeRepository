from pyspark import SparkConf, SparkContext

def GoldenEye(Rec):
	Record = Rec.split("|")
	if Record[1] == "GoldenEye (1995)":
		return True
	else:
		return False

def BreakRecord2(Rec):
	Record = Rec.split("\t")
	return Record


def Find5Stars(Rec):
	if int(Rec[1]) == int(GoldenEyeData[0]) and int(Rec[2]) == 5:
		return True
	else:
		return False

con=SparkConf()
sc=SparkContext(conf=con)
RDD1 = sc.textFile("file:///home/cloudera/sparkTests/DataFiles/Movies.item")
RDD2 = sc.textFile("file:///home/cloudera/sparkTests/DataFiles/Moving-Ratings-Done.data")

GoldenEyeData = RDD1.filter(GoldenEye).collect()[0]

RDD3 = RDD2.map(BreakRecord2)
RDD4 = RDD3.filter(Find5Stars)
numberOfInstances = RDD4.count()

print("Number of 5 star ratings for GoldenEye is ", numberOfInstances)





