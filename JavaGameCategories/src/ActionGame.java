import java.util.Scanner;

public class ActionGame extends Game
{

	String weapons[] = new String[6];

	public void populateWeaponsList()
	{
		Scanner scanVar = new Scanner(System.in);
		for (int i = 0; i < weapons.length; i++)
		{
			weapons[i] = scanVar.nextLine();
		}
		scanVar.close();
	}

	@Override
	public void movement()
	{
		System.out.println("Action game movement: WASD");
	}

	public void displayWeapons()
	{
		for (int i = 0; i < weapons.length; i++)
		{
			System.out.println(weapons[i] + " ");
		}
	}

}
