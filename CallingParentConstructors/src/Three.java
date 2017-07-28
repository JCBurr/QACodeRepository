import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Three extends Two	//Child class (end of chain)
{
	public Three(int a)
	{
		super(92);
		System.out.println("Child class constructor called with one argument " + a + ".");
	}
	
	public Three(int a, int b)
	{
		super(15, 48);
		System.out.println("Child class constructor called with two arguments " + a + " and " + b + ".");
		
	}
	
	public void message()
	{
		System.out.println("Sending message, object has been created and function called.");
	}
	
}
