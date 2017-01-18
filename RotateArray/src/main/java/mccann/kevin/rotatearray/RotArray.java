package mccann.kevin.rotatearray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class RotArray {

    public ArrayList<Integer> rotate(ArrayList<Integer> list, int k) {
        list.addAll(list.subList(0,k));
        list.removeAll(list.subList(0,k));
        return list;
    }
}
