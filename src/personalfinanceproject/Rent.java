/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 *
 */
public class Rent extends Expense {

	/**
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
