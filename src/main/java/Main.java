import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by prestonbattin on 1/18/17.
 */
public class Main {

    public static void main(String[] args) {

        //Rotate Array

        List number = new ArrayList();

        for (int i = 1; i < 7; i++) {
            number.add(i);
        }
        System.out.println("Before rotations " + Arrays.toString(number.toArray()));
        RotateArray rotate = new RotateArray();
        System.out.println("after rotation");
        rotate.swapList(number, 5);


        //Human Class

        Human person = new Human("Kent Klark", "Male", "Bus Boy", "101 Wazoo Lane", 23);
        SuperHero superHero = new SuperHero("Kevin", "Female", "Cheer Leader", "454 Hello World Lane", 20, "Good",
                "Kelly Frost", "Laser Vision");

        person.getName();
        person.getGender();
        person.getOccupation();
        person.getAddress();
        person.getAge();

        superHero.getName();
        superHero.getGender();
        superHero.getOccupation();
        superHero.getAddress();
        superHero.getAge();
        superHero.getSide();
        superHero.getHeroName();
        superHero.getAbility();

        //Class Manager








    }
}

