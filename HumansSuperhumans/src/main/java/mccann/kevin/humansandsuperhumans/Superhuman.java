package mccann.kevin.humansandsuperhumans;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class Superhuman extends Human {
    String goodOrBad, heroName, superAbility;

    public Superhuman(String name, String heroName, int age, String gender, String occupation, String address, String goodOrBad, String superAbility) {
        super(name, age, gender, occupation, address);
        this.heroName = heroName;
        this.goodOrBad = goodOrBad;
        this.superAbility = superAbility;
    }

    public String getGoodOrBad() {
        return goodOrBad;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public String getHeroName() {
        return heroName;
    }

}
