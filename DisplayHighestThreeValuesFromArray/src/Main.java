import java.util.Random;
public class Main
{
	public static void main(String[] args)
	{
		HighestValuesArray x = new HighestValuesArray();
		int[] testArray = new int[20];
		
		Random rand = new Random();
		
		for(int i = 0; i < testArray.length; i++)
		{
			testArray[i] = rand.nextInt(100) + 1;
		}
		x.outputNormalArray(testArray);
		x.calculateHighestThreeValues(testArray);
	}
}
