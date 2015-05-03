/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * This class keeps track of groceries/food expenses
 */
public class Groceries extends Expense {

	/**
	 * Groceries
	 * @param amount
	 */
	public Groceries(double amount) {
		super(amount);
	}

	@Override
	public String toString() {
		return "Groceries [amount=" + amount + "]";
	}
}
