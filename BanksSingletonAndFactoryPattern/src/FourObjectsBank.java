
public class FourObjectsBank
{
	static FourObjectsBank bankObject;
	static int objectCounter = 0;

	private FourObjectsBank()
	{
		System.out.println("New FourObjectsBank created.");
	}

	public static FourObjectsBank createBankObject()
	{

		if (objectCounter < 4)
		{
			bankObject = new FourObjectsBank();
			objectCounter++;
			System.out.println("Created a new bank object, total of " + objectCounter + ".");
		} else
		{
			System.out.println("Four bank objects already exists, cannot create new bank object.");
		}

		return bankObject;

	}

}
