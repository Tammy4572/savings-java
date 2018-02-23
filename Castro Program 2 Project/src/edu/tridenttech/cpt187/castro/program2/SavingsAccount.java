/*FILE: SavingsAccount.java
 *PROG: Tammy Castro
 *PURP: Simulate a bank savings account allowing deposits and withdrawls
 */
package edu.tridenttech.cpt187.castro.program2;

public class SavingsAccount 
{
	private String firstName;
	private String accountNumber;
	private double balance;
	private double rate;
	double depAmount = 0.0;
	double interestEarned = 0.0;
	/**
    * Constructor
    */
	public SavingsAccount(String acctNo, double startingBalance, double startingRate)
	{
		firstName = "";
		accountNumber = acctNo;
		balance = startingBalance;
		rate = startingRate;

	}//END SavingsAccount constructor
	
	public String getFirstName()
	{
		return firstName;
	}//END getFirstName
	
	public String getaccountNumber()
	{
		return accountNumber;
	}//END getAcctNum
	
	public double getBalance()
	{
		return balance;
	}//END getBalance
	
	public double getRate()
	{
		return rate;
	}//END getRate
	public double getInterestEarned()
	{
		return interestEarned;
	}
	public void setFirstName(String newFirstName)
	{
		this.firstName = newFirstName;
	}
	public void setAccountNumber(String newAcctNum)
	{
		this.accountNumber = newAcctNum;
	}
	public void setRate(double newIntRate)
	{
		this.rate = newIntRate;
	}
	public void addToBalance(double amount)
	{
		this.balance += amount;
		this.interestEarned = amount;
	}//END addToBalance
	
	public void withdrawFromBalance(double amount)
	{
		this.balance -= amount;
	}//END withdrawFromBalance
	
}//END class SavingsAccount
