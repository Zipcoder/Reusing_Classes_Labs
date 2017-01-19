package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/18/17.
 */
public class Main {

    public static void main(String[] args){
        Human human1 = new Human();
        SuperHuman superhuman1 = new SuperHuman();

        human1.setName("Ted");
        human1.setAge(25);
        human1.setGender("Male");
        human1.setAddress("44 Pine Street, NJ");
        human1.setOccupation("Plumber");

        superhuman1.setHeroName("Thor");
        superhuman1.setSuperAbility("Lightning");
        superhuman1.setAge(1000);
        superhuman1.setAddress("Not of this world");
        superhuman1.setIsGood(false);
        superhuman1.setGender("Male");
        superhuman1.setOccupation("God");

        //Show the Superhuman fields that were set - including fields from the superclass
        superhuman1.getHeroName();
        superhuman1.getSuperAbility();
        superhuman1.getIsGood();
        superhuman1.getAge();
        superhuman1.getGender();
        superhuman1.getOccupation();
        superhuman1.getAddress();

        System.out.println("---------------");
        //Show the Human fields that were set - including some fields from the superclass
        human1.getName();
        human1.getAge();
        human1.getAddress();
        human1.getOccupation();
        human1.getGender();

    }
}
