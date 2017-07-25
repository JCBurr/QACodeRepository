testResults <- function(x)
{
  if(x > 70)
  {
    print("You passed!")
  } else
  {
    print("You failed!")
  }
}

print(apply(Results, 2, sum))