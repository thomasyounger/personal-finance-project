/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * This class keeps track of medical expenses
 */
public class Medical extends Expense {

	/**
	 * Medical
	 * @param amount
	 */
	public Medical(double amount) {
		super(amount);
	}

	@Override
	public String toString() {
		return "Medical [amount=" + amount + "]";
	}
}
