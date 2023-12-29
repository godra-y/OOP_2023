package task4;

public class CheckingAccount extends Account{
	private int count;
    private static final double TRANSACTION_FEE = 0.02;
    private static final int FREE_TRANSACTIONS = 3;

    public CheckingAccount(int a) {
        super(a);
        count = 0;
    }

    public void deductFee() {
        if (count > FREE_TRANSACTIONS) {
            double fee = (count - FREE_TRANSACTIONS) * TRANSACTION_FEE;
            withdraw(fee);
        }
    }

    public void deposit(double sum) {
        super.deposit(sum);
        count++;
    }

    public void withdraw(double sum) {
        super.withdraw(sum);
        count++;
    }

    public String toString() {
        return "Checking Account number is " + getAccNumber() + ", Balance is " + getBalance() + " $";
    }
}
