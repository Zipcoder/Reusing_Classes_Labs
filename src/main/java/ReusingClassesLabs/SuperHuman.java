package ReusingClassesLabs;

/**
 * Created by randallcrame on 1/18/17.
 */
public class SuperHuman extends Human {
    protected String alignment;
    protected String heroName;
    protected String superAbility;

    public String getAlignment(){
        return alignment;
    }

    public void setAlignment(String alignment){
        this.alignment = alignment;
    }

    public String getHeroName(){
        return heroName;
    }

    public void setHeroName(String heroName){
        this.heroName = heroName;
    }

    public String getSuperAbility(){
        return superAbility;
    }

    public void setSuperAbility(String superAbility){
        this.superAbility = superAbility;
    }
}
