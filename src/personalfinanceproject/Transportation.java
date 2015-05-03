/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * Transportation
 * This class keeps track of transportation costs
 */
public class Transportation extends Expense {

	/**
	 * Transportation
	 * sets the transportation amount used
	 * @param amount
	 */
	public Transportation(double amount) {
		super(amount);
	}

	@Override
	public String toString() {
		return "Transportation [amount=" + amount + "]";
	}
}
