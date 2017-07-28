
public class Decryptor
{

	public static void decryptTest(String inputCode)
	{
		char x;
		for (int j = -inputCode.length(); j < 255; j++)
		{
			for (int i = 0; i < inputCode.length(); i++)
			{
				x = inputCode.charAt(i);
				x += j;
				System.out.print(x);
			}
			System.out.println();
		}
	}

}
