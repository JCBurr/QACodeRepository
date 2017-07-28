
public class QAC
{
	public QAC(int x)
	{
		this(x, 8);
		System.out.println("Called constructor 1 with value: " + x);
	}

	public QAC(int x, int y)
	{
		this(1, 2, 3);
		System.out.println("Called constructor 2 with values: " + x + " " + y);
	}

	public QAC(int x, int y, int z)
	{
		System.out.println("Call constructor 3 with values: " + x + " " + y + " " + z);
	}
}
