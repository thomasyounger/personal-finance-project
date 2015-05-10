package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * javadoc by christalyn
 * Medical
 * @inheritDoc Expense
 * This class keeps track of medical expenses
 */
public class Medical extends Expense {

	/**
	 * Medical
	 * inherits the amount
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
