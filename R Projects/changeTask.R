changeArray <- c(50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01)
bill = 99.99
paid = 137.87
currentVal = 0.0
currentCurrencyVal = 0.
numCurrencyUnits = 0.0
currencyUnits = 0
changeDue = 0.0

changeDue <- paid - bill
changeDue <- round(changeDue, 2)
currentVal = changeDue

penceDue <- round(changeDue %% 1, 2)
poundsDue <- as.integer(changeDue)

print(paste("Pounds:", poundsDue, " Pence: ", penceDue))

print(paste("Current change due: £", changeDue))



x = 1
repeat
{
  if(x > 12)
  {
    break
  }
  currentCurrencyVal <- changeArray[x]
  numCurrencyUnits <- currentVal / currentCurrencyVal
  currencyUnits <- as.integer(numCurrencyUnits)
  if(currencyUnits > 0)
  {
  print(paste("£", currentCurrencyVal, " ", currencyUnits))
  }
  currentVal <- currentVal %% currentCurrencyVal
  currentVal <- round(currentVal, 2)
  
  x <- x + 1
}