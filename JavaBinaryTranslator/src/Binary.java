
public class Binary
{
	public static void decimalToBinary(int x)
	{
		int decimalVal = x;
		int j = decimalVal;
		int i = 0;
		String binaryVal = "";

		while (j > 0)
		{
			if (i % 8 == 0)
			{
				binaryVal += " ";
			}
			binaryVal += (j % 2);

			j = j / 2;
			i++;
		}
	
		String reverse = new StringBuffer(binaryVal).reverse().toString();
		System.out.println(reverse);
	}
	
	public static void binaryToDecimal(String x)
	{
		String reverse = new StringBuffer(x).reverse().toString();
		int multiplier = 1;
		int digitValue = 0, total = 0;
		
		for(int i = 0; i < reverse.length(); i++)
		{
			digitValue = Integer.valueOf(reverse.substring(i, i + 1));
			digitValue = digitValue * multiplier;
			multiplier *= 2;
			total += digitValue;
		}
		System.out.println("Your binary string is " + total + " in decimal.");
	}
	
}
