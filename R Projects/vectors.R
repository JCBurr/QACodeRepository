salaries <- c(1700, 1600, 1200, 1000, 1500)

print(salaries[2])
print(salaries[1:7])

abc <- seq(1000, 1500, by = 2)

print(abc[abc > 1400])

salariesnew <- salaries + 10

finalsalaries <- salariesnew + salaries
print(finalsalaries)
print(max(finalsalaries))
print(sum(salaries))
print(min(finalsalaries))
print(length(salaries))
print(abc[c(T, F, F, F, F, T)])
