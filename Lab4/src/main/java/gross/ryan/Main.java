package gross.ryan;

/**
 * Created by ryangross on 1/18/17.
 */
public class Main {

    public static void main(String[] args) {
        ATM initATM = new ATM();
        /*
        CheckingAccount ryan = new CheckingAccount("Ryan", 100.00);
        initATM.addAccount(ryan);
        System.out.println(initATM.getAllAccounts().get(0).getAccountHolder());
        initATM.getAccount("ryan");
        */
        initATM.createAccount("Ryan",100.00);
        initATM.getAccount("Ryan").creditOrDebit("debit",100.00);
        initATM.getAccount("Ryan").getAccountBalance();
    }
}
