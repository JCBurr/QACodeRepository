
public class Exams
{
	int phy = 0, che = 0, mat = 0;
	float per = 0.0f, total = 0.0f;

	public void calculate()
	{
		total = phy + che + mat;
		per = (total * 100) / 450;
	}

	public void displayResults()
	{
		System.out.println("Total results: " + total + ".");
		System.out.println("Percentage: " + per + ".");
	}

	public void setResults(int physics, int chemistry, int maths)
	{
		this.phy = physics;
		this.che = chemistry;
		this.mat = maths;
	}

}
