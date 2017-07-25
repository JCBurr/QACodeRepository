pirateBayData = read.csv("C:/Users/james/Downloads/piratebay/piratebay.csv", header = TRUE)

bestTorrentID = 0
currentMax = 0
for (i in 1:nrow(pirateBayData))
{
  if((pirateBayData[i, "seeders"] + pirateBayData[i, "leechers"]) > currentMax)
    {
      bestTorrentID = pirateBayData[i, "idtorrent"]
      currentMax = pirateBayData[i, "seeders"] + pirateBayData[i, "leechers"]
    }
}
print(paste("Most popular torrent is id: ", bestTorrentID))

maxNumSeeders = max(pirateBayData$seeders)
for(i in 1:nrow(pirateBayData))
{
  if(pirateBayData[i, "seeders"] == maxNumSeeders)
   {
    print(paste("Max number of seeders is:", pirateBayData[i, "seeders"], " with an ID of ", pirateBayData[i, "idtorrent"]))
   }
}

maxNumLeechers = max(pirateBayData$leechers)
for(i in 1:nrow(pirateBayData))
{
  if(pirateBayData[i, "leechers"] == maxNumLeechers)
  {
    print(paste("Max number of leechers is:", pirateBayData[i, "leechers"], " with an ID of ", pirateBayData[i, "idtorrent"]))
  }
}

seedersLeechersRatio = 0
idValRatio = 0
for(i in 1:nrow(pirateBayData))
{
  if((pirateBayData[i, "seeders"] == 0) || (pirateBayData[i, "leechers"] == 0))
  {
  }
  else
  {
  if((pirateBayData[i, "seeders"] / pirateBayData[i, "leechers"]) > seedersLeechersRatio)
  {
    seedersLeechersRatio = (pirateBayData[i, "seeders"] / pirateBayData[i, "leechers"])
    idValRatio = pirateBayData[i, "idtorrent"]
  }
  }
}

print(paste("Highest seeders leechers ratio is ", seedersLeechersRatio, " for the film id numbered ", idValRatio))

numDeadTorrents = 0
for(i in 1:nrow(pirateBayData))
   {
     if(pirateBayData[i, "seeders"] == 0)
     {
       numDeadTorrents = numDeadTorrents + 1
     }
}
print(paste("Number of dead torrents is: ", numDeadTorrents, "."))



