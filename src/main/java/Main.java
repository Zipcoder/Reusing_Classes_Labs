import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by prestonbattin on 1/18/17.
 */
public class Main {

    public static void main(String[] args) {
// create array list object
    /*    List numbers = new ArrayList();


        // populate the list
        for (int i = 0; i < 15; i++) {
            numbers.add(i);
        }

        System.out.println("Before : "+ Arrays.toString(numbers.toArray()));

        // rotate the list at distance 10
        Collections.rotate(numbers, 5);

        System.out.println("After : "+Arrays.toString(numbers.toArray()));
    }
    */

        List number = new ArrayList();

        for (int i = 1; i < 7; i++) {
            number.add(i);
        }
        System.out.println("Before rotations " + Arrays.toString(number.toArray()));
        RotateArray rotate = new RotateArray();
        System.out.println("after rotation");
        rotate.swapList(number, 5);


    }
}

