from pyspark import SparkConf, SparkContext
from pyspark.sql import *
from pyspark.sql.types import *

con=SparkConf()
sc=SparkContext(conf=con)
sql=SQLContext(sc)

RDD1 = sc.textFile("file:///home/cloudera/sparkTests/DataFiles/personalInfo.txt")
records=RDD1.map(lambda X: X.split("|"))

schema=StructType(
	[
		StructField('RegNumber', LongType(), True),
		StructField('Name', StringType(), True),
		StructField('Address', StringType(), True)
	]
)


DF1=sql.createDataFrame(records,schema)

print("--- DF1.printSchema()")
DF1.printSchema()


print("--- DF1.show()")
DF1.show()

print(DF1.dtypes)

#print("--- Print first 2 records")
#DF1.show(2)

#print("--- DF1.select('_1', '_3').show()")
#DF1.select("_1","_3").show()

#print("--- DF1.filter(DF1._1 > 100).show()")
#DF1.select(DF1._1.alias("RegNumber")).show()




