
public class NumberSeparator
{

	public static void main(String[] args)
	{
		int number = 8011;
		int numDigits = calculateNumberOfDigits(number);
		int digitsArray[] = new int[numDigits];
		digitsArray = separateDigits(digitsArray, number, numDigits);
		convertToString(digitsArray, numDigits);
	}

	public static int calculateNumberOfDigits(int x)
	{
		if (x == 0)
		{
			return 1;
		} else
		{
			int y = (int) Math.floor(Math.log10(x) + 1);
			return y;
		}
	}

	public static int[] separateDigits(int digitsArray[], int number, int numberOfDigits)
	{
		int modulusUtilValue = 0;

		switch (numberOfDigits)
		{
		case 0:
			break;
		case 1:
			modulusUtilValue = 1;
			break;
		case 2:
			modulusUtilValue = 10;
			break;
		case 3:
			modulusUtilValue = 100;
			break;
		case 4:
			modulusUtilValue = 1000;
			break;
		}

		for (int i = 0; i < numberOfDigits; i++)
		{
			digitsArray[i] = number / modulusUtilValue;
			number = number % modulusUtilValue;
			modulusUtilValue = modulusUtilValue / 10;
		}

		return digitsArray;
	}

	private static void convertToString(int digitsArray[], int numberOfDigits)
	{
		String stringArray[] = new String[numberOfDigits];
		int currentDigitValue;

		currentDigitValue = numberOfDigits;

		for (int i = 0; i < numberOfDigits; i++)
		{
			switch (digitsArray[i])
			{
			case 0:
				if (numberOfDigits == 1)
				{
					stringArray[i] = "Zero";
					break;
				} else
				{
					stringArray[i] = "";
					break;
				}
			case 1:
				stringArray[i] = "One";
				break;
			case 2:
				stringArray[i] = "Two";
				break;
			case 3:
				stringArray[i] = "Three";
				break;
			case 4:
				stringArray[i] = "Four";
				break;
			case 5:
				stringArray[i] = "Five";
				break;
			case 6:
				stringArray[i] = "Six";
				break;
			case 7:
				stringArray[i] = "Seven";
				break;
			case 8:
				stringArray[i] = "Eight";
				break;
			case 9:
				stringArray[i] = "Nine";
				break;
			}
			System.out.print(stringArray[i]);

			switch (currentDigitValue)
			{
			case 0:
				break;
			case 1:
				break;
			case 2:
				if((digitsArray[i] == 0) && (digitsArray[i+1] != 0))
				{
					System.out.print("and ");
					break;
				}
				else if (digitsArray[i] == 0)
				{
					break;
				} else
				{
					switch(digitsArray[i])
					{
					case 1:
						switch(digitsArray[i+1])
						{
						case 1: System.out.println("eleven");
							break;
						case 2: System.out.println("twelve");
							break;
						case 3: System.out.println("thirteen");
							break;
						case 4: System.out.println("fourteen");
							break;
						case 5: System.out.println("fifteen");
							break;
						case 6: System.out.println("sixteen");
							break;
						case 7: System.out.println("seventeen");
							break;
						case 8: System.out.println("eighteen");
							break;
						case 9: System.out.println("nineteen");
						break;
						}
						i = i + 1;
						break;
					case 2: System.out.print("twenty");
						break;
					case 3: System.out.print("thirty");
						break;
					case 4: System.out.print("forty");
						break;
					case 5: System.out.print("fifty");
						break;
					case 6: System.out.print("sixty");
						break;
					case 7: System.out.print("seventy");
						break;
					case 8: System.out.print("eighty");
						break;
					case 9: System.out.print("ninety");
						break;
					}
				}
				break;
			case 3:
				if(digitsArray[i] != 0)
				{
					System.out.print(" hundred ");
				}
				if(digitsArray[i+1] != 0)
				{
					System.out.print("and ");
				}
				break;
			case 4:
				System.out.print(" thousand ");
				if((digitsArray[i+1] == 0) && (digitsArray[i + 2] != 0))
				{
					System.out.print("and");
				}
				break;
			}
			currentDigitValue--;
		}
	}
}
