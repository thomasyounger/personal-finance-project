/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 *
 */
public class Donation extends Expense {

	/**
	 * Donation
	 * @param amount
	 */
	public Donation(double amount) {
		super(amount);
	}

	@Override
	public String toString() {
		return "Donation [amount=" + amount + "]";
	}
}
