
public class Bank
{
	static float dollar;
	float x;

	public void convertMoney(float m)
	{
		System.out.println(m * dollar);
	}

	public void outputDollarRate()
	{
		System.out.println("Dollar rate is: " + dollar);
	}

}