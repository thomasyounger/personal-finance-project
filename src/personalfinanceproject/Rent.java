/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author thomasyounger
 * This class keeps track of monthly rent
 */
public class Rent extends Expense {

	/**
	 * Rent
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
