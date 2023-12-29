package task4;

public class Account {
	private double balance;
	private int accNumber;
	
	public Account(int a) {
		balance = 0.0;   //The current balance
		accNumber = a;	 //The account number
	}
	
	public void deposit(double sum) {
		balance += sum;
	}
	
	public void withdraw(double sum) {
		balance -= sum;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getAccNumber() {
		return accNumber;
	}
	
	public void transfer(double amount, Account other) {
		withdraw(amount);
		other.deposit(amount);
	}
	
	public String toString() {
		 return "Account number is " + accNumber + ", Balance is " + balance + " $";
	}
	
	public final void print() {
		System.out.println(toString());
	}
}
