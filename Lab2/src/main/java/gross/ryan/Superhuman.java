package gross.ryan;

/**
 * Created by ryangross on 1/18/17.
 */
public class Superhuman extends Human {
    String supername;
    boolean isBad;
    String superPower;


    public String getSupername() {
        return supername;
    }

    public void setSupername(String supername) {
        this.supername = supername;
    }

    public String isBad() {
        if (isBad) {
            return "Bad guy";
        } return "Good guy";
    }

    public void setBad(boolean bad) {
        isBad = bad;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public Superhuman(String name, int age, String gender, String occupation, String address,
                      String superName, boolean isBadOrGood, String superpower) {
        super(name, age, gender, occupation, address);
        supername = superName;
        isBad = isBadOrGood;
        superPower = superpower;
    }


}
