package mccann.kevin.humansandsuperhumans;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class Main {

    public static void main(String args[]) {
        Human Johnny = new Human("Johnny", 21, "male", "fireman", "123 Main St.");
        Human Jane = new Human("Jane", 18, "female", "astronaut", "125 Main St.");
        Human Jill = new Human("Jill", 22, "female", "professional golfer", "127 Main St.");
        Superhuman Sam = new Superhuman("Sam", "Steel", 28, "male","construction worker","122 Main St.", "bad", "Turns to Steel");
        Superhuman Sally = new Superhuman("Sally", "Psycho", 25, "female", "Lawyer/Doctor", "124 Main St.", "bad", "Drives people insane");
        Superhuman Sid = new Superhuman("Sid", "The Side-Splitter", 26, "male", "accountant", "126 Main St.", "good", "Uncontrollable laughter");

        System.out.println(Sam.getAddress());
        System.out.println(Sally.getGender());
        System.out.println(Sid.getOccupation());
    }
}
