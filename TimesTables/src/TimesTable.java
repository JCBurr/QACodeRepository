
public class TimesTable {

	public static void printTimesTable(int t, int r) {
		System.out.println("Times table of " + t + " up to " + r);
		for (int i = 1; i <= r; i++) 
		{
			System.out.println(t + " times " + i + " equals " + (t * i));
		}
	}
}