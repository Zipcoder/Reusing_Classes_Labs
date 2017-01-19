package reynoldstitko.gillian;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by gillianreynolds-titko on 1/18/17.
 */
public class RotateArrays extends ArrayList {

    public void rotateArray(ArrayList<Integer> inputArray, int k){
        System.out.println("Your input array is: "+ inputArray);
        if(k > inputArray.size()){
            System.out.print("Choose k less than or equal to your array size");
            return;
        }

        for(int i=0; i <k; i++){
            inputArray.add(inputArray.size(), inputArray.get(0));
            inputArray.remove(0);
        }
        System.out.println("Your rotated array is: "+ inputArray);
    }

    public static void main(String[] arg){

        RotateArrays tester3 = new RotateArrays();
        RotateArrays tester4 = new RotateArrays();
        tester3.add(1);
        tester3.add(2);
        tester3.add(3);
        tester3.add(4);
        tester3.add(5);
        tester3.add(6);
        tester3.rotateArray(tester3, 3);

        tester4.add(1);
        tester4.add(2);
        tester4.add(3);
        tester4.add(4);
        tester4.add(5);
        tester4.add(6);
        tester4.add(7);
        tester4.add(8);
        tester4.rotateArray(tester4, 6);

    }


}
