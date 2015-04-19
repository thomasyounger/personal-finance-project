/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 *
 */
public class Misc extends Expense {

	/**
	 * @param amount
	 */
	public Misc(double amount) {
		super(amount);
	}

	@Override
	public String toString() {
		return "Misc [amount=" + amount + "]";
	}
}
