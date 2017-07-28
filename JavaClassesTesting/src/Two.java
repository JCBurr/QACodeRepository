
public class Two {

	public static void main(String[] args)
	{
		One x = new One();
		Three y = new Three();
		
		x.a = 24;
		x.b = 5;
		x.c = x.a + x.b;
		x.sayHi();
		System.out.println(x.c);
		
		y.a = (float)2.5;
		y.b = (float)55.132;
		y.c = (float)3.14159;
		y.outputFloats();
	}
}
