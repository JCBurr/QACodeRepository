
public class JavaNestedIfs 
{

	public static void main(String[] args)
	{
	int NO = 2152;
	
	if(NO > 4000)
	{
		System.out.println("A");
		NO += 100;
			if(NO>5000)
			{
				System.out.println("B");
				System.out.println("C");
			}
			else
			{
				System.out.println("D");
			}
			System.out.println("E");	
	} 
	else
	{
		NO += 100;
		System.out.println("F");
		System.out.println("G");
		if(NO < 500)
		{
			System.out.println("J");
		}
		else
		{
			System.out.println("H");
			System.out.println("I");
		}
		System.out.println("K");
	}
	System.out.println("L");
	}
}
