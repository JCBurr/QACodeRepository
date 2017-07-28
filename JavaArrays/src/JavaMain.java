
public class JavaMain
{
	public static void main(String[] args)
	{
		int[] intArray = new int[5];
		intArray[0] = 26;
		intArray[1] = 270;
		intArray[2] = 270;
		intArray[3] = -9;
		intArray[4] = -10;

		SortArray sorter = new SortArray();

		sorter.findHighestValue(intArray);
		sorter.findLowestValue(intArray);
		sorter.sortArray(intArray);
	}
}
