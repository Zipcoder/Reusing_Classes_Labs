/**
 * Created by prestonbattin on 1/19/17.
 */
public class BusinessAccount extends Account{

    static private int accountCount = 1;
    private int businessAccountNumber;
    private double interest = 2.5;

    BusinessAccount(String name, double balance){

        super(name, balance);

        this.businessAccountNumber = accountCount;
        accountCount++;

        this.interest = interest;
    }

    @Override
    protected void creditAccount(double amount) {
        this.balance += amount;
    }

    @Override
    protected void debitAccount(double amount) {

        this.balance -= amount;
    }

    public double getBalance(){

        return super.getBalance();
    }

    public int getBusinessAccountNumber(){

        return this.businessAccountNumber;
    }

    public String getAccountName(){

        return super.getAccountName();
    }

    public double getInterest(){

        return this.interest;
    }
}
