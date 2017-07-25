practice <- function(firstValue, secondValue, boolValue)
{
  if(firstValue == 0 && secondValue != 0)
  {
    return (secondValue)
  } else if (secondValue == 0 && firstValue != 0)
  {
    return (firstValue)
  }
  else
  {
  if(boolValue == TRUE)
  {
  outputValue <- firstValue + secondValue
  }
  else
  {
  outputValue <- firstValue * secondValue
  return (outputValue)
  }
  }
}
