
public class SortArray implements SortArraysInterface
{

	public void findHighestValue(int[] intArray)
	{
		int highestValue = 0;

		for (int i = 0; i < intArray.length; i++)
		{
			if (intArray[i] > highestValue)
			{
				highestValue = intArray[i];
			}
		}
		System.out.println("Highest value in the array: " + highestValue);
	}

	public void findLowestValue(int[] intArray)
	{
		int lowestValue = intArray[0];

		for (int i = 0; i < intArray.length; i++)
		{
			if (intArray[i] < lowestValue)
			{
				lowestValue = intArray[i];
			}
		}
		System.out.println("Lowest value in the array: " + lowestValue);
	}

	public void sortArray(int[] intArray)
	{

		int tempValueStorage = 0;

		boolean sorted = false, changeMade = false;

		while (sorted == false)
		{
			changeMade = false;
			for (int i = 0; i < intArray.length - 1; i++)
			{
				if (intArray[i] > intArray[i + 1])
				{
					tempValueStorage = intArray[i + 1];
					intArray[i + 1] = intArray[i];
					intArray[i] = tempValueStorage;
					changeMade = true;
				}
			}
			if (changeMade == true)
			{
				sorted = false;
			} else
			{
				sorted = true;
			}
		}
		System.out.println("Array in sorted order from lowest to highest: ");
		for (int i = 0; i < intArray.length; i++)
		{
			System.out.print(intArray[i] + " ");
		}
	}
}
