
public class RangeClass
{

	public static void displayRange(int rangeMin, int rangeMax)
	{
		int numDigits = 0;

		for (int i = rangeMin; i <= rangeMax; i++)
		{
			numDigits = (int) Math.floor(Math.log10(i) + 1);
			if (numDigits == 1)
			{
				switch (i)
				{
				case 0:
					System.out.print("Zero");
					break;
				case 1:
					System.out.print("One");
					break;
				case 2:
					System.out.print("Two");
					break;
				case 3:
					System.out.print("Three");
					break;
				case 4:
					System.out.print("Four");
					break;
				case 5:
					System.out.print("Five");
					break;
				case 6:
					System.out.print("Six");
					break;
				case 7:
					System.out.print("Seven");
					break;
				case 8:
					System.out.print("Eight");
					break;
				case 9:
					System.out.print("Nine");
					break;
				}
				System.out.print(" ");
			} else if (numDigits > 1)
			{
				for (int j = 0; j < numDigits; j++)
				{
					
				}
			}
		}

		return;
	}

}
