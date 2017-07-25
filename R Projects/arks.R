phys <- readline("Enter physics marks.")
chem <- readline("Enter chemistry marks.")
maths <- readline("Enter maths marks.")


if(phys <70)
{
  numValues = numValues + 1
}
if(chem < 70)
{
  numValues = numValues + 1
}
if(maths < 70)
{
  numValues = numValues + 1
}

if(numValues == 0)
{
  print("Well done.")
} else if(numValues == 1)
{
  print("You failed one exam, retake it.")
} else if(numValues == 2)
{
  print("You failed two exams, retake the course.")
} else{
  print("Go home.")
}
numValues = 0