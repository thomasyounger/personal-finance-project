package personalfinanceproject;

public class Checking {
	private double balance;
	
	public Checking(double balance) {
		this.balance = balance;
	}
		
	public void setChecking(double balance) {
		this.balance = balance;
	}
	
	public double getChecking() {
		return balance;
	}
	
	public void checkingDeposit(double deposit) {
		balance += deposit;
	}
	
	public void checkingWithdrawal(double withdrawal) {
		balance -= withdrawal;
	}
}

