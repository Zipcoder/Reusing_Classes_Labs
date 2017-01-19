/**
 * Created by prestonbattin on 1/18/17.
 */
public class Human {

    protected String name, gender, occupation, address;
    protected int age;


    Human(String name, String gender, String occupation, String address, int age){

        this.name = name;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
        this.age = age;
    }

    protected void getName(){

        System.out.println("Your name is " + name);
    }

    protected void getGender(){

        System.out.println("You are " + gender);
    }

    protected void getOccupation(){

        System.out.println("Your occupation is " + occupation);
    }

    protected void getAddress(){

        System.out.println("Your address is " + address);
    }

    protected void getAge(){

        System.out.println("Your age is " + age);
    }
}

