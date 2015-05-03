package personalfinanceproject;

/**
 * This class keeps track of the checking account
*/
public class Checking {
	private double balance;
	
	/**
	 * Checking
	 * sets the balance
	 * @param balance
	 */
	public Checking(double balance) {
		this.balance = balance;
	}
	
	/**
	 * setChecking
	 * sets the balance
	 * @param balance
	 */	
	public void setChecking(double balance) {
		this.balance = balance;
	}
	
	/**
	 * getChecking
	 * returns the balance
	 * @return balance
	 */
	public double getChecking() {
		return balance;
	}
	
	/**
	 * checkingDeposit
	 * adds a deposit to the balance
	 * @param deposit
	 */
	public void checkingDeposit(double deposit) {
		balance += deposit;
	}
	
	/**
	 * checkingWithdrawal
	 * sets the new balance after a withdrawal
	 * @param withdrawal
	 */
	public void checkingWithdrawal(double withdrawal) {
		balance -= withdrawal;
	}
}

