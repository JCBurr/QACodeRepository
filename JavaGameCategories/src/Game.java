
abstract public class Game
{

	int classification;
	String title;
	String blurb;

	public void displayBaseInformation()
	{
		System.out.println("This game, " + this.title + "," + " is classified for people aged " + this.classification
				+ "  and over.");
	}

	final public void displayBlurb()
	{
		System.out.println("Blurb: " + this.blurb);
	}

	final public void displayTitle()
	{
		System.out.println("Title: " + this.title);
	}

	abstract public void movement();

}
