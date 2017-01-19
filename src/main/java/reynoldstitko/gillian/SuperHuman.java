package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/18/17.
 */
public class SuperHuman extends Human {

    private String heroName;
    private String superAbility;
    private Boolean isGood;

    public Boolean getIsGood() {
        if(isGood)
        System.out.println("Good");
        else {
            System.out.println("Not Good");
        }
        return isGood;
    }

    public void setIsGood(Boolean isGood) {
        this.isGood = isGood;
    }

    public String getHeroName() {
        System.out.println(heroName);
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getSuperAbility() {
        System.out.println(superAbility);
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }

}
