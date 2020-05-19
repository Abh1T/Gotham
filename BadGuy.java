public class BadGuy extends SuperHero{
	private String evilLaugh;
	public BadGuy(String name,String heroName, String job, int hitPoints, int maxDamage, int defenseAbility,  String superPower, boolean cape, int powerLevel, String evilLaugh)
	{
		super(name,heroName, job, hitPoints,maxDamage, defenseAbility, superPower, cape, powerLevel);
		this.evilLaugh = evilLaugh;
	}
	public String getevilLaugh() {
		return evilLaugh;
	}
}