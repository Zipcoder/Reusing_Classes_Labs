package gross.ryan;

/**
 * Created by ryangross on 1/18/17.
 */
public class Human {
    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String address;

    public Human(String aName, int anAge, String aGender, String aJob, String anAddress) {
        this.name = aName;
        this.age = anAge;
        this.gender = aGender;
        this.occupation = aJob;
        this.address = anAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
