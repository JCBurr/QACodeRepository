tablefrom = as.numeric(readline("Please enter the table to begin from."))
tableto = as.numeric(readline("Please enter the table to end with."))

finished = FALSE


x = tablefrom
y = 1
repeat {
  
  if(x == tableto + 1)
  {
    break
  }

 repeat 
 {
   if(y > 10)
    {
     break
    }
   print(paste(x, " times ", y, " = ", x*y))
   y = y + 1
 }
  x = x + 1
  y = 1
  print(" ")
}