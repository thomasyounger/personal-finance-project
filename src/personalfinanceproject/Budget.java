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
	private double income;
	private double expenses;
	
	public Budget(double incomeAmt, double expenseAmt, double goalAmt,
	double time) {
		incomeAmt = income;
		expenseAmt = expenses;
		goalAmt = amountGoal;
		time = timeFrame;
	}
	
	/**
 	* getIdealAmount
 	* gets the budget goal for a particular time frame in months
 	* @return amountGoal
	*/
	public double getIdealAmount() {
		return this.amountGoal;
	}
	
	/**
 	* gettimetoAchieve
 	* gets the particular time frame for a budget goal
 	* @return timeFrame
	*/
	public double gettimetoAchieve(){
		return this.timeFrame;
	}
	/**
 	* getMonthlyAmount()
 	* calculates the amount to save by month
 	* @return amountGoal divided by timeFrame in months
	*/
	public double getMonthlyAmount()
	{
		return amountGoal%timeFrame;
	}
	/**
 	* getincome()
 	* gets income amount
 	* @return income
	*/
	public double getincome()
	{
		return this.income;
	}
	
	/**
 	* getexpense()
 	* gets expense amount
 	* @return expense
	*/
	public double getexpense()
	{
		return this.expenses;
	}
	/**
 	* getmoneySaved()
 	* calculates amount left after expenses to save
 	* @return income minus expense
	*/
	public double getmoneySaved()
	{
		return this.getincome()-this.getexpense();
	}
	
	/**
 	* getmoneyremaningtoSave()
 	* calculates amount left to save to reach goal amount
 	* @return getIdealAmount minus moneySaved
	*/
	public double getmoneyremainingtoSave()
	{
		return this.getIdealAmount()-this.moneySaved();
	}
	
	/**
 	* getrealamounttoSavemonthly()
 	* calculates updated amount to save monthly to reach goal
 	* @return getmoneyremainingtoSave divided by gettimetoAchieve
	*/
	public double getrealamounttoSavemonthly()
	{
		return this.moneyremainingtoSave()%this.gettimetoAchieve();
	}
	
}
