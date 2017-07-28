public class OuterClass
{
	String name;

	public class InnerClass
	{
		String name;

		public InnerClass()
		{
			name = "Andrew";
		}

		public String displayName()
		{
			System.out.println("Name: " + OuterClass.this.name);
			return this.name;
		}
	}

	public void displayNames()
	{
		InnerClass inner = new InnerClass();
		this.name = inner.displayName();
		System.out.println("Name: " + name);
	}

	public static void main(String[] args)
	{
		OuterClass outer = new OuterClass();
		outer.name = "Greg";
		outer.displayNames();
	}
}