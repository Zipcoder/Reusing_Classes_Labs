package mccann.kevin.rotatearray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class Main {

    public static void main(String args[]) {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        RotArray rotArray = new RotArray();
        System.out.println(integerList);
        integerList = rotArray.rotate(integerList, 3);
        System.out.print(integerList);
    }
}
