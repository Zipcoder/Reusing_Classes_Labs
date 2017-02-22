package ReusingClasses;

import java.util.Arrays;

/**
 * Created by alfatihmukhtar on 1/18/17.
 */
public class ArrayRotationHandler {
    // take in factor "x" to rotate by
    // rotate every item in array by "x" places

    // create method that takes two arguments (array, k) where k = number of elements to rotate.
    public int[] rotateArray(int[] array, int rotation) {
//        System.out.print("The initial array is: ");
//        for(int i=0; i<array.length; i++) {
//            System.out.println(array[i]);
//        }
        System.out.println(Arrays.toString(array));
        int[] valuesLessThanRotationAmount = new int[array.length];
        for(int j=0; j<rotation; j++) {
            valuesLessThanRotationAmount[j] = array[j];

        }
        for(int k=rotation;k<array.length;k++) {
            array[k-rotation] = array[k];
        }
        for(int h=0;h<rotation;h++) {
            array[array.length-(rotation-h)] = valuesLessThanRotationAmount[h];
        }
//        System.out.print("The new array is: ");
//        for(int i=0; i<array.length; i++) {
//            System.out.println(array[i]);
//        }
        System.out.println(Arrays.toString(array));

        return new int[0];
    }

}
