from pyspark import SparkConf, SparkContext

def BreakRecordsPipe(Rec):
	Record = Rec.split("|")
	return Record

def BreakRecordsTab(Rec):
	Record = Rec.split("\t")
	return Record

def GetNameAndID(Rec):
	return (Rec[0], Rec[1])

def Get5StarRatings(Rec):
	if int(Rec[2]) == int(5):
		return True
	else:
		return False

def GetOnlyItemIDAndRating(Rec):
	return (Rec[1], Rec[2])

def GetMovieName(Rec):
	if int(Rec[0]) == int(maxRatings[0]):
		return True
	else:
		return False

con=SparkConf()
sc=SparkContext(conf=con)
RDD1 = sc.textFile("file:///home/cloudera/sparkTests/DataFiles/Movies.item")
RDD2 = sc.textFile("file:///home/cloudera/sparkTests/DataFiles/Moving-Ratings-Done.data")
RDD3 = RDD1.map(BreakRecordsPipe)
RDD4 = RDD2.map(BreakRecordsTab)

RDDFilmNames = RDD3.map(GetNameAndID)
RDD5StarRatings = RDD4.filter(Get5StarRatings)
RDDRatingsAndMovieID = RDD5StarRatings.map(GetOnlyItemIDAndRating)
NumbersOf5StarRatings = RDDRatingsAndMovieID.countByValue()

maxRatings = max(NumbersOf5StarRatings, key=NumbersOf5StarRatings.get)
RDDNameOfHighestRatedFilm = RDDFilmNames.filter(GetMovieName)
print(RDDNameOfHighestRatedFilm.collect(), NumbersOf5StarRatings[maxRatings])
