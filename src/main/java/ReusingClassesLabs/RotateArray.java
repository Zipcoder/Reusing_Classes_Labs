package ReusingClassesLabs;

import java.util.ArrayList;

/**
 * Created by randallcrame on 1/18/17.
 */
public class RotateArray extends ArrayList {
    //private int currentArrayHolder, temporaryValue;

    public void rotateArray(int array[], int rotate) {
        int currentArrayHolder, temporaryValue;

       for (int i = 0; i < rotate; i++) {
            temporaryValue = array[0];
            for (currentArrayHolder = 0; currentArrayHolder < array.length-1; currentArrayHolder++) {
                array[currentArrayHolder] = array[currentArrayHolder+1];
            }
            array[array.length-1] = temporaryValue;


        }
    }
}
