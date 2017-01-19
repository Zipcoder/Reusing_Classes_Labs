package gross.ryan;


import java.util.ArrayList;

/**
 * Created by ryangross on 1/18/17.
 */
public class RotateArray extends ArrayList {

    public void setUp() {
        for(int i = 1; i <= 6; i++) {
            this.add(i);
        }
    }

    public void rotate(int places) {
        int counter = 0;
        while (counter != places) {
            this.add(this.get(0));
            this.remove((this.get(0)));
            counter++;
        }
    }

    public static void main(String[] args) {
        RotateArray example = new RotateArray();
        example.setUp();
        System.out.println(example);
        example.rotate(2);
        System.out.println(example);
    }

}
