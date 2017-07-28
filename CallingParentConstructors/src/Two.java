
public class Two extends One	//Parent class
{
	public Two(int a)
	{
		System.out.println("Parent class constructor called with single argument " + a + ".");
	}
	
	public Two(int a, int b)
	{
		this(6);
		System.out.println("Parent class constructor called with two arguments " + a + " and " + b + ".");
	}
}
