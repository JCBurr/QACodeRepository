
public class Divsion
{
	public static void main(String[] xyz)
	{
		int a, b, c;
		a = b = c = 0;
		Divsion d = new Divsion();
		try
		{
			a = Integer.parseInt(xyz[0]);
			b = Integer.parseInt(xyz[1]);
			c = a / b;
			System.out.println("Dividing array values result: " + c);
			d.testCustomException(5);
		} catch (NumberFormatException x)
		{
			System.out.println("Please enter only integer values.");
		} catch (ArithmeticException y)
		{
			System.out.println("Please do not attempt to divide by 0.");
		} catch (IndexOutOfBoundsException z)
		{
			System.out.println("Please enter some arguments.");
		} catch (CustomException f)
		{
			System.out.println("Custom Exception thrown.");
		} catch (Exception g)
		{
			System.out.println("Caught general exception.");
		}

	}

	public void testCustomException(int a) throws CustomException
	{
		System.out.println("Custom Exception Test method called.");
		if (a < 10)
		{
			throw new CustomException();
		}
	}

}
