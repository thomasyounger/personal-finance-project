/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 *
 */
public class Transportation extends Expense {

	/**
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
