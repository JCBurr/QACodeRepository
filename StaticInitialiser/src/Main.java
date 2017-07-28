
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Initial dollar: " + Qa.dollar);
		Qa qaObject = new Qa();
		System.out.println("Object 1 dollar: " + Qa.dollar);
		Qa qaObject2 = new Qa();
		System.out.println("Object 2 dollar: " + Qa.dollar);
		Qa qaObject3 = new Qa();

		System.out.println("Object 1 dollar: " + Qa.dollar);
		System.out.println("Object 2 dollar: " + Qa.dollar);
		System.out.println("Object 3 dollar: " + Qa.dollar);
	}
}
