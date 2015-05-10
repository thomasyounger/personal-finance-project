package personalfinanceproject;

/**
 * javadoc by christalyn
 * Savings
 * This class keeps track of any savings, deposits, and withdrawals
*/
public class Savings {
	private double balance;
	
	/**
 	* Savings
 	* sets the initial balance
 	* @parm balance
	*/
	public Savings(double balance) {
		this.balance = balance;
	}
	
	/**
 	* setSavings
 	* sets the balance
 	* @parm balance
	*/	
	public void setSavings(double balance) {
		this.balance = balance;
	}
	
	/**
 	* getSavings
 	* gets the current savings total
 	* @return balance
	*/
	public double getSavings() {
		return balance;
	}
	
	/**
 	* savingsDeposit
 	* adds a deposit into the savings balance
 	* @parm deposit
	*/
	public void savingsDeposit(double deposit) {
		balance += deposit;
	}
	
	/**
 	* savingsWithdrawal
 	* sutracts any withdrawals from the savings balance
 	* @parm withdrawal
	*/
	public void savingsWithdrawal(double withdrawal) {
		balance -= withdrawal;
	}
}
