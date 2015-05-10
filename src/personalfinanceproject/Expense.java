package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * javadoc by christalyn
 * Expense
 * This class keeps track of overall expenses
 */
public class Expense {
	private double amount;
	
	/**
	 * Expense
	 *sets the initial amouunt
	 * @param amount
	 */
	public Expense(double amount) {
		this.amount = amount;
	}
	
	/**
	 * setExpense
	 * sets the amount
	 * @param amount
	 */
	public void setExpense(double amount) {
		this.amount = amount;
	}
	
	/**
	 * getExpense
	 * gets the expense amount
	 * @return amount
	 */
	public double getExpense() {
		return amount;
	}
}
