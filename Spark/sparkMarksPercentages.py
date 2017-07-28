from pyspark import SparkConf, SparkContext

def BreakRecordPersonalInfo(Rec):
	Record = Rec.split("|")
	return (Record)

def BreakRecordResults(Rec):
	Record = Rec.split("|")
	OutputList = [Record[0], Record[2]]
	return (OutputList)

#def PrintPercentages(resultsData, personalInfo):
	

con=SparkConf()
sc=SparkContext(conf=con)
RDD1 = sc.textFile("file:///home/cloudera/sparkTests/DataFiles/Results.txt")
RDD2 = sc.textFile("file:///home/cloudera/sparkTests/DataFiles/PersonalInfo.txt")
RDD3 = RDD1.map(BreakRecordPersonalInfo)
RDD4 = RDD2.map(BreakRecordResults)

dataResults = RDD3.collect()
dataPersonalInfo = RDD4.collect()

print(dataResults)
print(dataPersonalInfo)





