package armstrong.alexandra;

/**
 * Created by alexandraarmstrong on 1/18/17.
 */
public class Reusing_Classes_4 {
    public static void main(String[] args){
        CheckingAccount ca = new CheckingAccount();
        SavingsAccount sa = new SavingsAccount();
        BusinessAccount ba = new BusinessAccount();

        ca.credit(126);
        ca.debit(43);

        ba.credit(65);
        ba.debit(10);

        sa.credit(9384);
        sa.debit(45);

        System.out.println("Business Account balance " + ba.getBalance());
        System.out.println("Savings Account balance " + sa.getBalance());
        System.out.println("Checking Account balance " + ca.getBalance());

    }
}

abstract class BankAccount{
    double balance;

    public double getBalance() {
        return balance;
    }

    public void debit(double amount) {
        balance -= amount;
    }

    public void credit(double amount) {
        balance += amount;
    }
}

class CheckingAccount extends BankAccount{

}

class SavingsAccount extends BankAccount{

}

class BusinessAccount extends BankAccount{

}