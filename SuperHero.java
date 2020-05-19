public class SuperHero extends Person
{
	private String superPower;
	private boolean cape;
	private int powerLevel;
	private String heroName;

	public SuperHero( String name,String heroName, String job, int hitPoint,int maxDamage, int defenseAbility, String superPower, boolean cape, int powerLevel)
	{
		super( name, job, hitPoint, maxDamage, defenseAbility);
		this.superPower = superPower;
		this.cape = cape;
		this.powerLevel = powerLevel;
		this.heroName = heroName;
	}
	public String getsuperPower() {
				return superPower;
	}
	public boolean getCape() {
				return cape;
	}
	public int getpowerLevel() {
				return powerLevel;
	}
	  public String getheroName(){
	    return heroName;
  }
  public void setpowerLevel(int x)
  {
	  powerLevel = x;
}

  public void powerLevelModification(int newLevel)
  {
	  powerLevel = newLevel;
  }
}