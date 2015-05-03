/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 *
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
