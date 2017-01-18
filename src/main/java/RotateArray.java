
import java.util.*;



/**
 * Created by prestonbattin on 1/18/17.
 */
public class RotateArray {



    public void swapList(List array, int rotate){



         Collections.rotate(array, rotate);

        System.out.println(Arrays.toString(array.toArray()));

    }
}
