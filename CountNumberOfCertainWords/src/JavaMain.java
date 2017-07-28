
public class JavaMain
{
	public static void main(String[] args)
	{
		WordCounter words = new WordCounter();
		words.testForWord("Testing", "est");
		words.wordReplacement("I am going to Manchester", "Manchester", "hello");
	}
}
