package gross.ryan;

/**
 * Created by ryangross on 1/18/17.
 */
public class SavingsAccount extends Account {
    private String accountHolder;
    private double accountBalance;
    private static final String accountType = "savings";

    public SavingsAccount(String aName, double anAmt) {
        super(aName,anAmt);
    }

    public String getAccountHolder() {
        return this.accountHolder;

    }

    @Override
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
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
