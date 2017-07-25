titanicData <- read.csv("train-titanic.csv", header = TRUE)

for (i in titanicData)
{
  if(titanicData[i, "Survived"] == 1)
  {
    print(titanicData[i, "Name"])
  }
}