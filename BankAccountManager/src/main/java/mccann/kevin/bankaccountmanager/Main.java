package mccann.kevin.bankaccountmanager;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class Main {

    public static void main(String args[]) {
        AutomaticTeller atm = new AutomaticTeller();
        CheckingAccount check1 = atm.createCheckAccount("1111", 120, "Jason Bourne", 1);
        atm.debitAccount(check1, 20);
        System.out.println(atm.checkAcctBalance(check1));
    }
}