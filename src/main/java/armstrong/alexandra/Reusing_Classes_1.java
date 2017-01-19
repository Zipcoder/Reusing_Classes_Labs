package armstrong.alexandra;

import java.util.*;

/**
 * Created by alexandraarmstrong on 1/18/17.
 */
public class Reusing_Classes_1 extends ArrayList {
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 4;

        for (int x : arr){
            System.out.print(x);
        }

        count(arr, k);

        for (int x : arr){
            System.out.print(x);
        }
    }

    public static int[] rotate(int[] arr){
        int temp = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

    public static int[] count(int[] arr, int k){
        for(int i = 0; i < k; i++) {
            rotate(arr);
        }
        return arr;
    }
}
