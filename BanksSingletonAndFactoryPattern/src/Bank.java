
public class Bank
{

	static Bank bankObject;
	private int testVariable;

	private Bank()
	{
		System.out.println("Singleton object has been created.");
	}

	public static Bank createBankObject()
	{

		if (bankObject == null)
		{
			bankObject = new Bank();
		}

		return bankObject;
	}

	public void setTestVariable()
	{
		testVariable = 7;
	}

	public void displayTestVariable()
	{
		System.out.println("Test variable is currently " + testVariable + ".");
	}

}
