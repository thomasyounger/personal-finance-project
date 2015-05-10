package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * javadoc by christalyn
 * Rent
 * @inheritDoc Expense
 * This class keeps track of monthly rent
 */
public class Rent extends Expense {

	/**
	 * Rent
	 * inherits the amount
	 * @param amount
	 */
	public Rent(double amount) {
		super(amount);
	}

	@Override
	public String toString() {
		return "Rent [amount=" + amount + "]";
	}
}
