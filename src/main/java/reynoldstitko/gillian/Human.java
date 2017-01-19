package reynoldstitko.gillian;

/**
 * Created by gillianreynolds-titko on 1/18/17.
 */
public class Human {

    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String address;

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        System.out.println(gender);
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        System.out.println(occupation);
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        System.out.println(address);
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
