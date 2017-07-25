evens <- c(2, 4, 6, 8, 10)

write.csv(evens, "evens.csv")
write.table(evens, "evens.csv", sep="\t")

odds <- read.delim("evens.csv")
odds <- odds + 1

write.csv(odds, "odds.csv")
write.table(odds, "odds.csv", sep="\t")