
public class oddNumberNest
{
	public static void runOddNumberLoop()
	{
		int a, b;

		for (a = 1; a <= 10; a++)
		{
			if (a % 2 == 0)
			{
				System.out.println(a);
			} else
			{
				for (b = 1; b <= a; b++)
				{
					System.out.print(b + " ");
				}
				System.out.println("");
			}
		}
	}
}