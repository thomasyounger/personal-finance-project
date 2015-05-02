/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 *
 */
public class Cash extends Expense {

	/**
	 * Cash
	 * @param amount
	 */
	public Cash(double amount) {
		super(amount);
	}

	@Override
	public String toString() {
		return "Cash [amount=" + amount + "]";
	}
}
