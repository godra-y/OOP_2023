package task4;

public class testAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
        Account account = new Account(1);
        SavingsAccount savingsAccount = new SavingsAccount(2, 5);
        CheckingAccount checkingAccount = new CheckingAccount(3);
        
        bank.openAccount(account);
        bank.openAccount(savingsAccount);
        bank.openAccount(checkingAccount);
        
        account.deposit(100.0);
        account.transfer(50, checkingAccount);
        savingsAccount.deposit(500.0);
        checkingAccount.deposit(200.0);
        checkingAccount.withdraw(100.0);
        
        
        bank.update();
        
        account.print();
        savingsAccount.print();
        checkingAccount.print();
        
        bank.closeAccount(account);
	}

}
