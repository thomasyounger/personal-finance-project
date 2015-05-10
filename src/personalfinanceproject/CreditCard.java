package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * javadoc by christalyn
 * CreditCard
 * @inheritDoc Expense
 * This class keeps track of purchases made on a creditcard
 */
public class CreditCard extends Expense {

	/**
	 * CreditCard
	 * inherits the amount
	 * @param amount
	 */
	public CreditCard(double amount) {
		super(amount);
	}

	@Override
	public String toString() {
		return "CreditCard [amount=" + amount + "]";
	}
}
