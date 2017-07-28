
public class WordCounter
{

	public void testForWord(String inputSentence, String testWord)
	{
		String indicesOutput = "An instance was found at character positions: ";
		int current, wordCounter = 0;
		for (current = 0; current < inputSentence.length(); current++)
		{
			if (inputSentence.length() - current > testWord.length()
					&& (inputSentence.substring(current, current + testWord.length()).equals(testWord)))
			{
				wordCounter++;
				indicesOutput += current;
				indicesOutput += ", ";
			}
		}

		System.out.println("Number of instances of " + testWord + ": " + wordCounter);
		System.out.println(indicesOutput.substring(0, indicesOutput.length() - 2));
	}

	public void wordReplacement(String inputSentence, String searchText, String replacementText)
	{
		int current;
		String fragmentOne, fragmentTwo;
		for (current = 0; current < inputSentence.length(); current++)
		{
			if (inputSentence.length() - current >= searchText.length()
					&& (inputSentence.substring(current, current + searchText.length()).equals(searchText)))
			{
				fragmentOne = inputSentence.substring(0, current);
				fragmentTwo = inputSentence.substring(current + searchText.length(), inputSentence.length());
				current += replacementText.length();
				fragmentOne += replacementText;
				fragmentOne += fragmentTwo;
				inputSentence = fragmentOne;
			}
		}
		System.out.println("String with sections replaced: ");
		System.out.println(inputSentence);
	}

}
