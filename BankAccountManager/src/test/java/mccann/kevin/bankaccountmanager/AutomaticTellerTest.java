package mccann.kevin.bankaccountmanager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinmccann on 1/18/17.
 */
public class AutomaticTellerTest {

    AutomaticTeller atm;
    CheckingAccount check;
    SavingsAccount save;
    BusinessAccount business;

    @Before
    public void setUp() {
        atm = new AutomaticTeller();
        check = new CheckingAccount("1111", 120, "John Doe", 1);
        save = new SavingsAccount("2222", 420, "Jane Dough", 5);
        business = new BusinessAccount("3333", 1000, "John Doe", 2);
    }

    @Test
    public void debitTest() {
        atm.debitAccount(check, 100);
        double actual = atm.checkAcctBalance(check);
        double expected = 20.0;
        assertEquals("20 expected",expected,actual,0);
    }

    @Test
    public void creditTest() {
        atm.creditAccount(check, 100);
        double actual = atm.checkAcctBalance(check);
        double expected = 220.0;
        assertEquals("220 expected",expected,actual,0);
    }

    @Test
    public void transferToAcctTest() {
        atm.transferToAccount(check, save, 100);
        double actual = atm.checkAcctBalance(save);
        double expected = 520.0;
        assertEquals("520 expected",expected,actual,0);
    }

    @Test
    public void transferFromAcctTest() {
        atm.transferFromAccount(check, save, 100);
        double actual = atm.checkAcctBalance(save);
        double expected = 320.0;
        assertEquals("320 expected",expected,actual,0);
    }
}