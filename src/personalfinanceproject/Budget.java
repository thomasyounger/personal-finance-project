/**
 * 
 */
package cis111B.personalfinanceproject;

/**
 * @author patrickowens
 *
 */
public class Budget {
	
	private double amountGoal;
	private double timeFrame;
	//Do we use these two variables?
	//private double gains;
	//private double amount;
	
	public double netIncome;
	public double totalExpenses;
	
	public double getIdealAmount() {
		return amountGoal;
	}
	
	public double gettimetoAchieve(){
		return timeFrame;
	}
	
	public double getRealAmount(){
		return (amountGoal - totalExpenses);
	}
}
