package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 *
 */
public class Expense {
	double amount;
	//Are these string data necessary??
	//String date;
	//String category;
	//String methodofPayment;
	
	/**
	 * Expense
	 * sets the amouunt
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
