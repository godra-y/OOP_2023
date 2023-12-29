package task4;

import java.util.Vector;

public class Bank {
	Vector<Account> accounts = new Vector<>();

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            } 
            else if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).deductFee();
            }
        }
    }
}
