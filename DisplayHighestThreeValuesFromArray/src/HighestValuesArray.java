
public class HighestValuesArray
{
	public void calculateHighestThreeValues(int intArray[])
	{
		int highestValue = 0, secondHighestValue = 0, thirdHighestValue = 0;
		for (int i = 0; i < intArray.length; i++)
		{
			if (intArray[i] > highestValue)
			{
				thirdHighestValue = secondHighestValue;
				secondHighestValue = highestValue;
				highestValue = intArray[i];
			} else if ((intArray[i] > secondHighestValue) && (intArray[i] < highestValue))
			{
				thirdHighestValue = secondHighestValue;
				secondHighestValue = intArray[i];
			} else if ((intArray[i] > thirdHighestValue) && (intArray[i] < secondHighestValue))
			{
				thirdHighestValue = intArray[i];
			}
		}
		System.out.println("Highest three numbers are " + highestValue + ", " + secondHighestValue + " and "
				+ thirdHighestValue + " from highest to third highest.");
	}

	public void outputNormalArray(int intArray[])
	{
		for (int i = 0; i < intArray.length; i++)
		{
			System.out.print(intArray[i] + " ");
		}
		System.out.println("");
	}

}
