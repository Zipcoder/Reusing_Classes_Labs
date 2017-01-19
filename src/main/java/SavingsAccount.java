/**
 * Created by prestonbattin on 1/19/17.
 */
public class SavingsAccount extends Account {

    static private int accountCount = 1;
    private int savingsAccountNumber;
    private double interest = 1.5;


    SavingsAccount(String name, double balance){

        super(name, balance);

        this.savingsAccountNumber = accountCount;
        accountCount++;
    }

    @Override
    protected void creditAccount(double amount) {

        this.balance += amount;
        this.interest = interest;
    }

    @Override
    protected void debitAccount(double amount) {

        this.balance -= amount;
    }

    @Override
    public double getBalance(){

        return super.getBalance();
    }

    public int getSavingsAccountNumber(){

        return this.savingsAccountNumber;
    }

    @Override
    public String getAccountName(){

        return super.getAccountName();
    }

    public double getInterest(){

        return this.interest;
    }
}
