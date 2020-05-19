import java.util.*;
public class Gotham {
  public Gotham(){
    int baddude = 0;
    int gooddude = 0;
    int firstname = 0;
    int lastname = 0;
    int randomo = 0;
    String nombre = "";
    int prson = 0;
    int firsty = (int)(Math.random()*2+0);
    int endgame = (int)(Math.random()*2+0);
    int x = (int)(Math.random() * 11 + 1);
   	int y = (int)(Math.random() * 11 + 1);
    int stringy = 0;
    int safety = 0;
    int dmg = 0;
    int locate = 0;
    int lowcate = 0;
    int def = 0;
    int size = 0;
    String laugh = "";
    String phrase = "";
    int badhp = 0;
    int goodhp = 0;
   String[] firstNameArray = {"Clark","James","Timmy", "Token", "Butters", "Eric", "Stan", "Kenny", "Wendy", "Morgan"};
   String[] lastNameArray = {"Kent","Man","Burch", "Williams", "Chaos", "Cartman", "Randy", "Cormack", "Call", "Freeman"};
   String[] stringArray = {"KermitDaFrog is attacking FlyQuest", "FlyQuest is attacking KermitDaFrog","KermitDaFrog has a maxDamage amount of 15 and FlyQuest has a defenseAbility of 8", "FlyQuest has a maxDamage amount of 10 and KermitDaFrog has a defenseAbility of 5","KermitDaFrog has game ended a person", "FlyQuest flew someone to safety"};
   ArrayList<Person> dailyPlanet = new ArrayList<Person>();
   ArrayList<Person> safetyLand = new ArrayList<Person>();
   ArrayList<Person> gone = new ArrayList<Person>();

      while(baddude == gooddude){
      baddude = (int)(Math.random() * 50 + 0);
      gooddude = (int)(Math.random() * 50 + 0);
    }




//1
   for(int j = 0; j<50; j++)
   {
	     x = (int)(Math.random() * 10 + 0);
   		 y = (int)(Math.random() * 10 + 0);
		 nombre += firstNameArray[x];
		 nombre += " ";
		 nombre += lastNameArray[y];

        dailyPlanet.add(new NormalGuy(nombre, "engineer", 2, 2, 2));
			 

   }
  GoodGuy goodhero = new GoodGuy("Johnny Smith", "FlyQuest", "Magician", 100, 10, 10, "a lot", true, 90, "OOGA BOOGA BOOGA!");
   dailyPlanet.set(gooddude, goodhero);
   BadGuy badhero = new BadGuy("Kermit Frog","KermitDaFrog", "Quadrillionare", 120, 15, 5, "a lot", false, 91, "SKKKKKKKRRRRRRTTTTT!");
   dailyPlanet.set(baddude, badhero);



//2
   phrase = goodhero.getcatchPhrase();
   laugh = badhero.getevilLaugh();

  while(dailyPlanet.size()>2){
    locate = dailyPlanet.indexOf(badhero);
    if ((gooddude== locate+1)&&(locate > 0))
     {
      lowcate = locate-1;
       gone.add(dailyPlanet.remove(lowcate));
       System.out.println(laugh);
        stringy = 4;
      System.out.println(stringArray[stringy]);    
      System.out.println(phrase);
     }


     if ((gooddude== locate-1)&&(locate > 0))
     {
       gone.add(dailyPlanet.remove(locate + 1));
       System.out.println(laugh);
            stringy = 4;
      System.out.println(stringArray[stringy]);      
      System.out.println(phrase);

    }

    if ((gooddude != locate+1)&&(gooddude!= locate-1)&&(locate > 0)&&(locate < (dailyPlanet.size()-1)))
    {
      endgame = (int)(Math.random()*2+0);
      if(endgame == 0)
      gone.add(dailyPlanet.remove(locate + 1));
      if(endgame != 0)
      gone.add(dailyPlanet.remove(locate - 1));
      System.out.println(laugh);
      stringy = 4;
      System.out.println(stringArray[stringy]);
       System.out.println(phrase);

    }
      size = dailyPlanet.size();
      System.out.println(safety);
      safety = (int)(Math.random()*size+0);
      
      if((safety == locate) || (safety == gooddude))
      {
        while((safety == gooddude) || (safety == locate))
        {
        safety = (int)(Math.random()*size+0);
        }
      }
        System.out.println(safety);
        safetyLand.add(dailyPlanet.remove(safety));
        stringy = 5;
      System.out.println(stringArray[stringy]);    
      dailyPlanet.remove(dailyPlanet.indexOf(goodhero));
      size = dailyPlanet.size()-1;
      System.out.println(size);
      gooddude = (int)(Math.random()*size);
      System.out.println(gooddude);
      dailyPlanet.add(gooddude, goodhero);
}



//3


int endgamer = (int)(Math.random()*2+0);
stringy = 0;


goodhp = goodhero.gethitPoint();
badhp = badhero.gethitPoint();

while((goodhp>0)&&(badhp>0))
{
  if(endgamer == 0)
  {
    //BadGuy first
    stringy = 0;
    System.out.println(stringArray[stringy]);
    stringy+=2;
    System.out.println(stringArray[stringy]);
    dmg = (int)(Math.random()*badhero.getMaxDamage()+1);
    def = (int)(Math.random()*goodhero.getdefenseAbility()+1);
    if(dmg>= def){
      dmg = (int)(Math.random()*badhero.getMaxDamage()+1);
      goodhp -= goodhero.hpReduction(dmg);
      System.out.println(goodhp);
    }
    endgamer=1;
    
    if((goodhp<0)||(badhp<0)){
   break;
}
  }
if(endgamer != 0)
  {
    //GoodGuy first
    stringy = 1;
    System.out.println(stringArray[stringy]);
    stringy+=2;
    System.out.println(stringArray[stringy]);

    dmg = (int)(Math.random()*goodhero.getMaxDamage()+1);
    def = (int)(Math.random()*badhero.getdefenseAbility()+1);
    if(dmg>= def){
      dmg = (int)(Math.random()*goodhero.getMaxDamage()+1);
      badhp -= badhero.hpReduction(dmg);
      System.out.println(badhp);
    }
       endgamer=0;
    if((goodhp<0)||(badhp<0)){
  break;
}
  }


}

















  }
  public static void main(String[] args)
  	{
  		Gotham app = new Gotham();
	}

}