/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * This class keeps track of purchases made on a creditcard
 */
public class CreditCard extends Expense {

	/**
	 * CreditCard
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
