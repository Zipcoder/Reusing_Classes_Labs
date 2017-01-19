package mccann.kevin.bankaccountmanager;

import javax.security.auth.login.AccountNotFoundException;

/**
 * Created by kevinmccann on 1/18/17.
 */
public abstract class Account {

    private String acctNumber;
    private double acctBalance;
    private String acctHolderName;
    private double interestRate;

    Account(String acctNumber, double acctBalance, String acctHolderName, double interestRate) {
        this.acctNumber = acctNumber;
        this.acctBalance = acctBalance;
        this.acctHolderName = acctHolderName;
        this.interestRate = interestRate;
    }

    private String getAcctNumber() {
        return acctNumber;
    }

    double getAcctBalance() {
        return acctBalance;
    }

    void addToAcctBalance(double amount) {
        acctBalance += amount;
    }

    private String getAcctHolderName() {
        return acctHolderName;
    }

    private double getInterestRate() {
        return interestRate;
    }

    private void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}
