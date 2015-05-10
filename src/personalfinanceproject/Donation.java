package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * javadoc by christalyn
 * Donation
 * @inheritDoc Expense
 * This class keeps track of donations made
 */
public class Donation extends Expense {

	/**
	 * Donation
	 * inherits the amount
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
