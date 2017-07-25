orch <- OrchardSprays

for (i in dim(orch)[1])
{
  if(orch[i, "decrease"] == max(orch$decrease))
  {
    print("Max")
  }
}