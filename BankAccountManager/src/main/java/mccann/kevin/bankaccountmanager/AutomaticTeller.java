package mccann.kevin.bankaccountmanager;

import java.util.ArrayList;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class AutomaticTeller {
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private ApprovalStatus approvalStatus = ApprovalStatus.APPROVED;

    public CheckingAccount createCheckAccount(String acctNumber, double acctBalance, String acctHolderName, double interestRate) {
        return new CheckingAccount(acctNumber, acctBalance, acctHolderName, interestRate);
    }

    public SavingsAccount createSavingsAccount(String acctNumber, double acctBalance, String acctHolderName, double interestRate) {
        return new SavingsAccount(acctNumber, acctBalance, acctHolderName, interestRate);
    }

    public BusinessAccount createBusinessAccount(String acctNumber, double acctBalance, String acctHolderName, double interestRate) {
        return new BusinessAccount(acctNumber, acctBalance, acctHolderName, interestRate);
    }

    public void creditAccount(Account account, double amount) {
        account.addToAcctBalance(amount);
    }

    public void debitAccount(Account account, double amount) {
        if (!(checkDebit(account, amount)))
            approvalStatus = ApprovalStatus.NOTAPPROVED;
        else
            account.addToAcctBalance(-amount);
    }

    private boolean checkDebit(Account account, double amount) {
        return account.getAcctBalance() > amount;
    }

    double checkAcctBalance(Account account) {
        return account.getAcctBalance();
    }

    public void transferToAccount(Account acct1, Account acct2, double amount) {
        debitAccount(acct1, amount);
        creditAccount(acct2, amount);
    }

    public void transferFromAccount(Account acct1, Account acct2, double amount) {
        creditAccount(acct1, amount);
        debitAccount(acct2, amount);
    }
}