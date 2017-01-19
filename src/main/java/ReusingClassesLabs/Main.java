package ReusingClassesLabs;


/**
 * Created by randallcrame on 1/18/17.
 */
public class Main {
    public static void main (String[] args){
        RotateArray object = new RotateArray();

        int array[] = {1,2,3,4,5};
        String original = "Original: ", rotated ="Rotated: ";
        for(int i:array) original += array[i-1] + " ";


        object.rotateArray(array, 2);
        for(Integer j:array) rotated+=array[j-1]+" ";

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        System.out.println(original+"\n"+rotated);


        for(int i: array) {
            System.out.println(i)
            i = array[..];
        }
    }
}
