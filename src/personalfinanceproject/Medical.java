/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 *
 */
public class Medical extends Expense {

	/**
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
