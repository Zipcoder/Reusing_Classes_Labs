import org.junit.Assert;
import org.junit.Test;

/**
 * Created by prestonbattin on 1/19/17.
 */
public class TestBankAccount {

    @Test
    public void TestCheckingAccountCreation(){

        CheckingAccount test = new CheckingAccount("bob", 4500);
        CheckingAccount test1 = new CheckingAccount("Sally Sue", 3500);

        String expectedName = "Sally Sue";
        String actualName = test1.getAccountName();
        Assert.assertEquals("Testing the name", expectedName,actualName);

        double expectedStartBalance = 3500;
        double actualStartBalance = test1.getBalance();
        Assert.assertEquals("Testing start balance", expectedStartBalance,actualStartBalance,0);

        int expectedAccountNumber = 2;
        int actualAccountNumber = test1.getCheckingAccountNumber();
        Assert.assertEquals("Checking the account number", expectedAccountNumber,actualAccountNumber);

        test1.creditAccount(500);
        double expectedCreditBalance = 4000;
        double actualCreditBalance = test1.getBalance();
        Assert.assertEquals("Testing credit", expectedCreditBalance,actualCreditBalance,0);

        test1.debitAccount(1000);
        double expectedDebitBalance = 3000;
        double actualDebitBalance = test1.getBalance();
        Assert.assertEquals("Testing debit", expectedDebitBalance,actualDebitBalance,0);

    }

    @Test
    public void TestingSavingsAccountCreation(){

        SavingsAccount test = new SavingsAccount("Kevin", 10000);
        SavingsAccount test1 = new SavingsAccount("Will",4500);

        String expecteName = "Kevin";
        String actualName = test.getAccountName();
        Assert.assertEquals("Testing name", expecteName,actualName);

        double expectedStartBalance = 10000;
        double actualStartBalance = test.getBalance();
        Assert.assertEquals("Testing start balance", expectedStartBalance,actualStartBalance,0);

        int expectedAccountNumber = 2;
        int actualAccountNumber = test1.getSavingsAccountNumber();
        Assert.assertEquals("Checking the account number", expectedAccountNumber,actualAccountNumber);

        test.creditAccount(500);
        double expectedCreditBalance = 10500;
        double actualCreditBalance = test.getBalance();
        Assert.assertEquals("Testing credit", expectedCreditBalance,actualCreditBalance,0);

        test.debitAccount(1000);
        double expectedDebitBalance = 9500;
        double actualDebitBalance = test.getBalance();
        Assert.assertEquals("Testing debit", expectedDebitBalance,actualDebitBalance,0);

        double expectedInterest = 1.5;
        double actualInterest = test.getInterest();
        Assert.assertEquals("Testing Interest", expectedInterest,actualInterest,0);
    }

    @Test
    public void TestingBuisnessAccount(){

        BusinessAccount test = new BusinessAccount("Kevin", 100000);
        BusinessAccount test1 = new BusinessAccount("Will",4500);


        String expecteName = "Kevin";
        String actualName = test.getAccountName();
        Assert.assertEquals("Testing name", expecteName,actualName);

        double expectedStartBalance = 100000;
        double actualStartBalance = test.getBalance();
        Assert.assertEquals("Testing start balance", expectedStartBalance,actualStartBalance,0);

        int expectedAccountNumber = 2;
        int actualAccountNumber = test1.getBusinessAccountNumber();
        Assert.assertEquals("Checking the account number", expectedAccountNumber,actualAccountNumber);

        test.creditAccount(1000);
        double expectedCreditBalance = 101000;
        double actualCreditBalance = test.getBalance();
        Assert.assertEquals("Testing credit", expectedCreditBalance,actualCreditBalance,0);

        test.debitAccount(500);
        double expectedDebitBalance = 100500;
        double actualDebitBalance = test.getBalance();
        Assert.assertEquals("Testing debit", expectedDebitBalance,actualDebitBalance,0);

        double expectedInterest = 2.5;
        double actualInterest = test.getInterest();
        Assert.assertEquals("Testing Interest", expectedInterest,actualInterest,0);
    }
}
