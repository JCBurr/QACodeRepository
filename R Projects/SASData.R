library(MicrosoftR)
carsData <- rxImport("C:/Users/james/Downloads/SAS_Task_2_Resources/cars.sas7bdat")

asianCarsRearDrive <- nrow(carsData[(carsData$Origin=="Asia") & (carsData$DriveTrain=="Rear"),])
print(paste("Number of Asian cars with rear wheel drive:", asianCarsRearDrive))

europeanCarsAverageHorsepower <- round(mean(carsData[(carsData$Origin=="Europe"), "Horsepower"]),2)
print(paste("Average horsepower of European cars is: ", europeanCarsAverageHorsepower))

usaCarsAveragePrice <- round(mean(carsData[(carsData$Origin=="USA"), "MSRP"]),2)
print(paste("Average price of USA cars is: ", usaCarsAveragePrice))

bestPriceHorsepowerRatio <- subset(carsData, select=c(Horsepower, MSRP, Origin))
bestPriceHorsepowerRatio$Ratio <- bestPriceHorsepowerRatio$MSRP / bestPriceHorsepowerRatio$Horsepower
bestOriginRatio <- subset(bestPriceHorsepowerRatio, bestPriceHorsepowerRatio$Ratio==min(bestPriceHorsepowerRatio$Ratio), select=c(Origin, Ratio))
print(paste("Region that has the highest ratio of price to horsepower ratio is: ", bestOriginRatio$Origin, " with a ratio of ", bestOriginRatio$Ratio))

library(ggplot2)

europeanBMWs <- subset(carsData, Origin == "Europe" & Make == "BMW", select=c(Type))

p <- ggplot(data = europeanBMWs, aes(x=Type, fill = Type)) + geom_bar() + ggtitle("Frequency of European BMW Models")
print(p)

priceOfSedans <- subset(carsData, Type == "Sedan", select=c(Type, Make, MSRP))
sedanPriceScatterPlot <- ggplot(data=priceOfSedans, aes(x=Make, y=MSRP, fill = MSRP)) + geom_point() + ggtitle("Price of Sedans by Manufacturer")
print(sedanPriceScatterPlot)