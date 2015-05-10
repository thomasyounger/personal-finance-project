package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * javadoc by christalyn
 * Groceries
 * @inheritDoc Expense
 * This class keeps track of groceries/food expenses
 */
public class Groceries extends Expense {

	/**
	 * Groceries
	 * inherits the amount
	 * @param amount
	 */
	public Groceries(double amount) {
		super(amount);
	}

	@Override
	public String toString() {
		return "Groceries [amount=" + amount + "]";
	}
}
