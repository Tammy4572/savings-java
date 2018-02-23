/*FILE: MainClass.java
 *PROG: Tammy Castro
 *PURP: Simulate a bank savings account allowing deposits and withdrawals using the class SavingsAccount
 */
package edu.tridenttech.cpt187.castro.program2;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		SavingsAccount myAccount = new SavingsAccount("A78945A", 5000.0, 0.003);
		
		String currentfirstName;
		String currentAcctNum;
		double rate = 0.0;
		double currentDeposit;
		double currentWithdrawal;
		double interestEarned = 0.0;
		System.out.println("Welcome to Trident National Bank");
		/**
	    * Asks for users first name
	    * @param none
	    */
		System.out.println("Enter your first name:");
		currentfirstName = input.nextLine();
		myAccount.setFirstName(currentfirstName); //Assigns newFirstName to currentfirstName
		currentAcctNum = myAccount.getaccountNumber();
		rate = myAccount.getRate();
		System.out.printf("Account Number " + currentAcctNum + " Account Balance $" + myAccount.getBalance()+" Interest Rate: "+ rate+"?");

		/**
	    * Ask for amount to start account with
	    * @param amount
	    */
		System.out.println("\nHow much would you like to deposit today ,"+ currentfirstName + "?");
		currentDeposit = input.nextDouble();
		myAccount.addToBalance(currentDeposit);

		/**
	    * Asks user for the amount of cash back from deposit
	    * @param none
	    */
		System.out.println("Would you like any cashback today, "+ currentfirstName + "?");
		currentWithdrawal = input.nextDouble();
		myAccount.withdrawFromBalance(currentWithdrawal);
		System.out.printf("%n");
		System.out.println(currentfirstName + ", this is what your account would look like after one year");	
		System.out.printf("%13s%13s%16s%12s\n", "Month", "Starting", "Interest", "Ending");
		System.out.printf("%10s%15s%15s%15s\n", "#","Balance", "Earned", "Balance");
		
		double originalBalance = 0.0;
		
		for(int i=1;i<=12;i++)
		{
			originalBalance = myAccount.getBalance();
			applyInterest(myAccount);
			interestEarned += myAccount.getInterestEarned();
			System.out.printf("%10s%15.2f%15.2f%15.2f\n", i ,originalBalance, interestEarned, myAccount.getBalance());
		}

	}//END void main

	private static void applyInterest(SavingsAccount myAccount) {
		// TODO Auto-generated method stub
		double myCurrentBalance = myAccount.getBalance();
		double myCurrentRate = myAccount.getRate();
		double myInterestEarned = myCurrentBalance * myCurrentRate;
		myAccount.addToBalance(myInterestEarned);
	}//END main

}//END MainClass
