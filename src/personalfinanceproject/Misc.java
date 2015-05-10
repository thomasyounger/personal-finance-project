package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * javadoc by christalyn
 * Misc
 * @inheritDoc Expense
 * This class keeps track of the amount of funds being used for miscellaneous purposes
 */
public class Misc extends Expense {

	/**
	 * Misc
	 * inherits the amount
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
