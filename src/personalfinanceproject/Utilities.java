package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * javadoc by christalyn
 * Utilities
 * @inheritDoc Expense
 *  This class keeps track of any utility expenses
 */
public class Utilities extends Expense {

	/**
	 * Utilities
	 * sets the utilities expenses
	 * @param amount
	 */
	public Utilities(double amount) {
		super(amount);
	}

	@Override
	public String toString() {
		return "Utilities [amount=" + amount + "]";
	}
}
