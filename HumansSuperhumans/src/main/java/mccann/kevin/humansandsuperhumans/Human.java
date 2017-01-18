package mccann.kevin.humansandsuperhumans;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class Human {
    String name, gender, occupation, address;
    int age;

    public Human(String name, int age, String gender, String occupation, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getAddress() {
        return address;
    }
}
