
public class JavaMain
{
	public static void main(String[] args)
	{
		ActionGame genericActionGame2 = new ActionGame();
		genericActionGame2.title = "Strike Force Generica";
		genericActionGame2.blurb = "THE most generic action game you've ever played!";
		genericActionGame2.displayBlurb();
		genericActionGame2.displayTitle();
		genericActionGame2.populateWeaponsList();
		genericActionGame2.movement();
		genericActionGame2.displayWeapons();
		
		RolePlayingGame x = new RolePlayingGame();
	}
}
