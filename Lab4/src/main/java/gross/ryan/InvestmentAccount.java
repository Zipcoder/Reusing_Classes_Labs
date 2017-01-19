package gross.ryan;

/**
 * Created by ryangross on 1/18/17.
 */
public class InvestmentAccount extends Account{
    private String accountHolder;
    private double accountBalance;
    private static String accountType = "investment";

    public InvestmentAccount(String aName, double anAmt) {
        super(aName,anAmt);
    }

    @Override
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    @Override
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
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
