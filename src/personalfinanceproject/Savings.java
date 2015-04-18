package personalfinanceproject;

public class Savings {
	private double balance;
	
	public Savings(double balance) {
		this.balance = balance;
	}
		
	public void setSavings(double balance) {
		this.balance = balance;
	}
	
	public double getSavings() {
		return balance;
	}
	
	public void savingsDeposit(double deposit) {
		balance += deposit;
	}
	
	public void savingsWithdrawal(double withdrawal) {
		balance -= withdrawal;
	}
}
