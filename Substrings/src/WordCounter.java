
public class WordCounter
{

	public static int countWords(String word)
	{
		int wordCounter = 0;
		for (int i = 0; i < word.length(); i++)
		{
			if (word.substring(i, i + 1).equals(" "))
			{
				wordCounter++;
			}
		}
		//System.out.print("Your sentence contains " + (wordCounter + 1) + " words.");
		return wordCounter + 1;
	}

	public static void outputWords(String x)
	{
		String sentence = x;
		int previousSpaceIndex = 0;
		for (int i = 0; i < sentence.length(); i++)
		{
			if ((((sentence.substring(i, i + 1).equals(" ") || sentence.substring(i, i + 1).equals("."))
					|| sentence.substring(i, i + 1).equals("!")) || sentence.substring(i, i + 1).equals("?")))
			{
				System.out.println(sentence.substring(previousSpaceIndex, i + 1));
				previousSpaceIndex = i + 1;
			}
		}
	}

}
