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
	 * @param amount
	 */
	public Expense(double amount) {
		this.amount = amount;
	}
	
	/**
	 * @param amount
	 */
	public void setExpense(double amount) {
		this.amount = amount;
	}
	
	/**
	 * @return
	 */
	public double getExpense() {
		return amount;
	}
}
