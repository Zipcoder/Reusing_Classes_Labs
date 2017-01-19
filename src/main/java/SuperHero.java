/**
 * Created by prestonbattin on 1/18/17.
 */
public class SuperHero extends Human {

    public String side, heroName, superAbility;

    SuperHero(String name, String gender, String occupation, String address, int age, String side, String heroName, String superAbility){
        super(name, gender, occupation, address, age );
        this.side = side;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }

    public void getSide(){

        System.out.println("You are " + side);

    }

    public void getHeroName(){

        System.out.println("Your Hero name is " + heroName);
    }

    public void getAbility(){

        System.out.println("Your super ability is " + superAbility);
    }

}
