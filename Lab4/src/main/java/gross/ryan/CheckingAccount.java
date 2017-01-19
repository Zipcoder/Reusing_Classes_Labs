package gross.ryan;

/**
 * Created by ryangross on 1/18/17.
 */
public class CheckingAccount extends Account {
    private String accountHolder;
    private double accountBalance;
    private static String accountType = "checking";

    public CheckingAccount(String aName, double anAmt) {
        super(aName,anAmt);
    }

    public String getAccountHolder() {
        return this.accountHolder;

    }

    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    public void setAccountBalance(double amount) {
        this.accountBalance = amount;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    private void debitAccount(double anAmt) {
        this.accountBalance += anAmt;
        System.out.println(anAmt + " added to your account. Balance is now: " + getAccountBalance());
    }

    private void creditAccount(double anAmt) {
        this.accountBalance -= anAmt;
        System.out.println(anAmt + " deducted from your account. Balance is now: " + getAccountBalance());
    }

    public void creditOrDebit(String aCommand, double anAmt) {
        if (aCommand.equals("debit")) {
            debitAccount(anAmt);

        } else {
            creditAccount(anAmt);
        }
    }

}
