public class GoodGuy extends SuperHero
{
	private String catchPhrase;

	public GoodGuy(String name,String heroName, String job, int hitPoints, int maxDamage, int defenseAbility,  String superPower, boolean cape, int powerLevel, String catchPhrase)
	{
		super(name,heroName, job, hitPoints,maxDamage, defenseAbility, superPower, cape, powerLevel);
		this.catchPhrase = catchPhrase;
	}
	public String getcatchPhrase() {
		return catchPhrase;
	}
	public void powerLevelModification()
	{
		int x = (int)(Math.random()*10)+1;
		setpowerLevel(getpowerLevel() + x);

	}
}