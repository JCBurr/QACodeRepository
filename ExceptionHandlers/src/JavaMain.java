
public class JavaMain
{
	public static void main(String[] args)
	{
		int c = 0, d;
		try
		{
			d = 3 / 0;
		} catch (ArithmeticException a)
		{
			a.getCause();
			System.out.println("Cannot divide by 0.");
		}
		catch (ArrayIndexOutOfBoundsException b)
		{
			b.getCause();
			System.out.println("Array is out of bounds.");
		}

	}
}
