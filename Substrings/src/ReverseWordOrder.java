
public class ReverseWordOrder
{

	public static void reverseOrder(String forwardString)
	{

		int wordCount = WordCounter.countWords(forwardString);

		String[] wordsArray = new String[wordCount];

		String sentence = forwardString;
		int previousSpaceIndex = 0;
		int wordsArrayIndex = 0;
		for (int i = 0; i < sentence.length(); i++)
		{
			if ((((sentence.substring(i, i + 1).equals(" ") || sentence.substring(i, i + 1).equals("."))
					|| sentence.substring(i, i + 1).equals("!")) || sentence.substring(i, i + 1).equals("?")))
			{
				wordsArray[wordsArrayIndex] = ((sentence.substring(previousSpaceIndex, i + 1)));
				wordsArrayIndex++;
				previousSpaceIndex = i + 1;
			}
		}
		for (int i = wordsArray.length - 1; i >= 0; i--)
		{
			System.out.println(wordsArray[i]);
		}
	}

}
