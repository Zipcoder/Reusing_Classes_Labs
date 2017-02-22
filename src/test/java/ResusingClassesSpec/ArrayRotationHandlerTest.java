package ResusingClassesSpec;

import ReusingClasses.ArrayRotationHandler;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by alfatihmukhtar on 1/18/17.
 */
public class ArrayRotationHandlerTest {
    @Test
    public void rotateArrayTest() {
        ArrayRotationHandler test = new ArrayRotationHandler();
        int[] expected = {3,4,5,6,1,2};
        int[] inputArray = {1,2,3,4,5,6};
        int[] actual = test.rotateArray(inputArray, 2);
        System.out.println(expected);


        assertTrue(Arrays.equals(expected, actual));

    }
}
