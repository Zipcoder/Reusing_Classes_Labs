/**
 * Created by prestonbattin on 1/18/17.
 */
public abstract class Account {

    protected String accountName;
    protected double balance;


    Account(String accountName, double balance){

        this.accountName = accountName;
        this.balance = balance;
    }

    protected abstract void creditAccount(double amount);
    protected abstract void debitAccount(double amount);

    protected String getAccountName(){

        return this.accountName;
    }

    protected double getBalance(){

        return this.balance;
    }


}
