package armstrong.alexandra;

/**
 * Created by alexandraarmstrong on 1/18/17.
 */
public class Reusing_Classes_2 {
    public static void main(String[] args){
        Human dude = new Human();
        Human dudette = new Human();
        SuperHuman superDude = new SuperHuman();
        SuperHuman superDudette = new SuperHuman();

        dude.setAddress("423 west west street, Boring DE 19830");
        dudette.setGender("Male");

        superDude.setGender("Male");
        superDude.setAbility("Talking");

        System.out.println(dude.address);
        System.out.println(dudette.gender);
        System.out.println(superDude.gender);
        System.out.println(superDude.ability);

    }
}

class Human{
    String name;
    int age;
    String gender;
    String occupation;
    String address;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printAge(){
        System.out.println(age);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printGender(){
        System.out.println(gender);
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void printOccupation(){
        System.out.println(occupation);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printAddress(){
        System.out.println(address);
    }
}

class SuperHuman extends Human{
    boolean good;
    String heroName;
    String ability;

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    public void printGood(){
        System.out.println(good);
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void printHeroName(){
        System.out.println(heroName);
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public void printAbility(){
        System.out.println(ability);
    }
}
