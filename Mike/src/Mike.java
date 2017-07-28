public class Mike
{

	public void Mike()
	{

		System.out.println("MIKE!");

	}

	interface mike
	{

		public void Mike();

	}

	public Mike(Mike mike)
	{

		mike.Mike();

	}

	public Mike()
	{

	}

	class michael implements mike
	{

		public void Mike()
		{

			System.out.println("NotMike");

		}

	}

	public static void main(String args[])
	{

		michael mike = new Mike(new Mike()
		{

			public void Mike()
			{

				System.out.println("Mike!!");

			}

		}).new michael();

		mike miKE = new mike()
		{

			public void Mike()
			{

				System.out.println("Mike");

			}

		};

		mike.Mike();

	}

}