
public class StringCapitaliseAndDouble
{

	public static void alternateStringOutput(String inputString)
	{

		char x, updatedLetter;
		char stringNumber;
		int asciiIndex;
		String outputString = "";
		
		for (int i = 0; i < inputString.length(); i++)
		{
			x = inputString.charAt(i);
			asciiIndex = (int) x;

			if ((asciiIndex > 64) && (asciiIndex < 90))
			{
				asciiIndex += 32;
				updatedLetter = (char) asciiIndex;
				outputString += updatedLetter;
			} else if ((asciiIndex > 96) && (asciiIndex < 123))
			{
				asciiIndex -= 32;
				updatedLetter = (char) asciiIndex;
				outputString += updatedLetter;
			} else if ((asciiIndex > 47) && (asciiIndex < 53))
			{
				stringNumber = (char) (x + (x - 48));
				outputString += stringNumber;
			} else if ((asciiIndex > 52) && (asciiIndex < 58))
			{
				stringNumber = (char) (x + (x - 58));
				outputString += "1";
				outputString += stringNumber;
			} else
			{
				outputString += (char) asciiIndex;
			}
		}
		System.out.println("Alternated string: " + outputString);
	}

}
