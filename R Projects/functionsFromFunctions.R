F <- function(A,B)
{
  print(A + B)
  Z <- function(A)
  {
    print("Hello inner function")
  }
  return (Z)
}

X <- F(2,4)
X(2)