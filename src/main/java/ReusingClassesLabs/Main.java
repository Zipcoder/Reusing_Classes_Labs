package ReusingClassesLabs;


/**
 * Created by randallcrame on 1/18/17.
 */
public class Main {
    public static void main (String[] args){
        RotateArray object = new RotateArray();

        int array[] = {1,2,3,4,5};

        System.out.println("Original: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();

        object.rotateArray(array, 2);
        System.out.println("Rotated: ");
        for(int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }

    Human bob = new Human();
    SuperHuman steve = new SuperHuman();
    Human stacy =  new SuperHuman();

    bob.setName("jim");
    System.out.println(bob.getName());
    steve.setAlignment("Good");
    System.out.println(steve.getAlignment());
    stacy.setGender("N/A"); //unable to set SuperHuman fields.
    System.out.println(stacy.getGender());
    }
}

