from pyspark import SparkConf, SparkContext, SQLContext

con=SparkConf()
sc=SparkContext(conf=con)
sql = SQLContext(sc)


RDD1 = sc.textFile("file:///home/cloudera/sparkTests/DataFiles/Results.txt")
header = RDD1.first()
RDD1.filter(line => line != header)
RDD2 = RDD1

dataFrameOne = sql.createDataFrame(RDD3)
dataFrameOne.show()
dataFrameOne.printSchema()
