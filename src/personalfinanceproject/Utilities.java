/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 *
 */
public class Utilities extends Expense {

	/**
	 * @param amount
	 */
	public Utilities(double amount) {
		super(amount);
	}

	@Override
	public String toString() {
		return "Utilities [amount=" + amount + "]";
	}
}
