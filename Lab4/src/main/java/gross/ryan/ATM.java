package gross.ryan;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by ryangross on 1/18/17.
 */
public class ATM {
    private ArrayList<Account> allAccounts = new ArrayList<Account>();

    public ArrayList<Account> getAllAccounts() {
        return this.allAccounts;
    }


    protected void addAccount(Account anAcct) {
   // getAllAccounts().add(anAcct);
        allAccounts.add(anAcct);
    }

    protected void createAccount(String name, double amount) {
        Account newAccount = new CheckingAccount(name, amount);
        addAccount(newAccount);
    }

    protected Account getAccount(String name) {
        for(int i = 0; i < allAccounts.size(); i++) {
            System.out.println(allAccounts.get(i).getAccountBalance());
            return allAccounts.get(i);
            }
    return null;
    }

}
