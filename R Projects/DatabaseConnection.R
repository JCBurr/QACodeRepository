require(RODBC)

dx <- odbcConnect("ABCDriver", uid = "root", pwd = "root")

df <- sqlQuery(dx, "SELECT * FROM FIRSTTESTTABLE")

print(df)

close(dx)in