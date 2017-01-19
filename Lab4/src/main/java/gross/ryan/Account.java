package gross.ryan;

/**
 * Created by ryangross on 1/18/17.
 */
public abstract class Account {
    private String accountHolder;
    private double accountBalance;
    private String accountType;

    public Account(String aName, double aBalance) {
        setAccountHolder(aName);
        setAccountBalance(aBalance );
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountBalance(double anAmt) {
        this.accountBalance = anAmt;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    private void debitAccount(double anAmt) {
        this.accountBalance += anAmt;
    }

    private void creditAccount(double anAmt) {
        this.accountBalance -= anAmt;
    }

    public void creditOrDebit(String aCommand, double anAmt) {
        if (aCommand.equals("debit")) {
            debitAccount(anAmt);

        } else {
            creditAccount(anAmt);
        }
    }

}
