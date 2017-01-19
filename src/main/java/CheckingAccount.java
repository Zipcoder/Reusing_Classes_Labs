/**
 * Created by prestonbattin on 1/19/17.
 */
public class CheckingAccount extends Account {

    static private int accountCount = 1;
    private int checkingAccountNumber;


    CheckingAccount(String accountName, double balance){
        super(accountName,balance);

        this.checkingAccountNumber = accountCount;
        accountCount++;
    }

    @Override
    protected void creditAccount(double amount) {

        this.balance += amount;
    }

    @Override
    protected void debitAccount(double amount) {

        this.balance -= amount;
    }

    @Override
    public double getBalance(){

        return super.getBalance();
    }

    public int getCheckingAccountNumber(){

        return this.checkingAccountNumber;
    }

    @Override
    public String getAccountName(){

        return super.getAccountName();
    }


}
