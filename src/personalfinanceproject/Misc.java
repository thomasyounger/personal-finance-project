/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * This class keeps track of the amount of funds being used for miscellaneous purposes
 */
public class Misc extends Expense {

	/**
	 * Misc
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
