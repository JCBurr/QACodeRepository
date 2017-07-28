
public class MainClass
{
	public static void main(String[] args)
	{
		Bank.dollar = 4;

		Bank HSBC = new Bank();
		Bank Natwest = new Bank();

		HSBC.x = 10.0f;
		Natwest.x = 100.0f;

		HSBC.outputDollarRate();
		Natwest.outputDollarRate();

		HSBC.convertMoney(HSBC.x);
		Natwest.convertMoney(Natwest.x);
	}
}
