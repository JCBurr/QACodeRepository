physics<-c(92, 72, 48)
chemistry<-c(39, 59, 80)
maths<-c(59, 67, 65)

Results<-cbind(physics, chemistry, maths)

colnames(Results) <- c("Physics", "Chemistry", "Maths")
rownames(Results) <- c("Shafeeq", "Peter", "Andrew")

print(Results["Shafeeq", c("Chemistry", "Physics")])
print(Results[c(1:2), c("Physics", "Chemistry")])
print(rowSums(Results))