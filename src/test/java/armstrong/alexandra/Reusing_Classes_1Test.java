package armstrong.alexandra;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by alexandraarmstrong on 1/18/17.
 */
public class Reusing_Classes_1Test {
    @Test
    public void rotateTest(){
        int[] arr = {1, 2, 3, 4};
        int[] expected = {2, 3, 4, 1};
        int[] actual = Reusing_Classes_1.rotate(arr);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void countTest(){
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        int[] expected = {3, 4, 1, 2};
        int[] actual = Reusing_Classes_1.count(arr, k);
        assertArrayEquals(expected, actual);
    }
}
