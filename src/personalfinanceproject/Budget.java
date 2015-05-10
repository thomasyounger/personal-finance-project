package cis111B.personalfinanceproject;

/**
 * @author patrickowens
 * javadoc by christalyn
 * Budget
 * This class keeps track a users budget over a particular time frame
 */
public class Budget {
	
	private double amountGoal;
	private double timeFrame;
	public double netIncome;
	public double totalExpenses;
	
	/**
 	* getIdealAmount
 	* gets the budget goal for a particular time frame
 	* @return amountGoal
	*/
	public double getIdealAmount() {
		return amountGoal;
	}
	
	/**
 	* gettimetoAchieve
 	* gets the particular time frame for a budget goal
 	* @return timeFrame
	*/
	public double gettimetoAchieve(){
		return timeFrame;
	}
	
	/**
 	* getRealAmount
 	* gets the amount left available after expenses
 	* @return (amountGoal-totalExpenses)
	*/
	public double getRealAmount(){
		return (amountGoal - totalExpenses);
	}
}
