package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * javadoc by christalyn
 * Cash
 * @inheritDoc Expense
 * This class keeps track of the amount of cash on a person at any given time
 */
public class Cash extends Expense {

	/**
	 * Cash
	 * inheriting amount
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
