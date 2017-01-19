package gross.ryan;

/**
 * Created by ryangross on 1/18/17.
 */
public class Main {

    public static void main(String[] args) {
        Human ryan = new Human("Ryan Gross", 23, "Male", "Boss Software Dev.", "Newark, DE");
        Superhuman kirby = new Superhuman("Ryan Gross", 23, "Male", "Boss Software Dev.",
                "Newark, DE", "Kirby", false, "Nintendo SuperStar <3");
        System.out.println(kirby.getName());
        System.out.println(kirby.getSupername());
        System.out.println(kirby.isBad());

    }
}
