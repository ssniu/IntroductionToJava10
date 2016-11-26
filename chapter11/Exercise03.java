/**
 * (Subclasses of Account)
 * In Programming Exercise 9.7, the Account class was
 * defined to model a bank account.
 * An account has the properties account number, balance, annual interest rate,
 * and date created, and methods to deposit and withdraw funds.
 * Create two subclasses for checking and saving accounts.
 * A checking account has an overdraft limit,
 * but a savings account cannot be overdrawn.
 * Draw the UML diagram for the classes and then implement them.
 * Write a test program that creates objects of Account, SavingsAccount, and
 * CheckingAccount and invokes their toString() methods.
 *
 */
 /*************************************
 *          SavingsAccount            *
 *------------------------------------*
 * +SavingsAccount()
 * +withdraw(a: double): boolean
 **************************************/

class SavingsAccount extends Account {
//non-args constructor
	public SavingsAccount() {
		super();
	}
//Constructor with id and balance
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println(
				"Error! Savings account overdrawn transtaction rejected");
	}
}

/***************************************************************************
*                              CheckingAccount                             *
*--------------------------------------------------------------------------*
* -overdraftLimit: double
* +CheckingAccount()
* +CheckingAccount(Id: int, balance: double, oLimit: double)
* +setOverdraftLimit(oLimit: double): void
* +getOverdraftLimit(): double
* +withdraw(a: double): boolean
* +toString(): String
****************************************************************************/

class CheckingAccount
		extends Account {
	// Data fields
	private double overdraftLimit;
//no-args constructor and constructor with args
	public CheckingAccount() {
		super();
		overdraftLimit = -20;
	}

	public CheckingAccount(int id, double balance, double oLimit) {
		super(id, balance);
		overdraftLimit = oLimit;
	}
//Setter and getter methods
	public void setOverdraftLimit(double oLimit) {
		overdraftLimit = oLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void withdraw(double amount) {
		if (getBalance() - amount > overdraftLimit) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error! Amount exceeds overdraft limit.");
	}

	public String toString() {
		return super.toString() + "\nOverdraft limit: $" +
		String.format("%.2f", overdraftLimit);
	}
}

public class Exercise03{
  public static void main(String[] args){
  //Create an object of each class
  Account account = new Account(1122, 20000);
  SavingsAccount savings = new SavingsAccount(1001, 20000);
  CheckingAccount checking = new CheckingAccount(1004, 20000, -20);

  //Set the annual interest rate for all 3 classes
  account.setAnnualInterestRate(4.5);
  savings.setAnnualInterestRate(4.5);
  checking.setAnnualInterestRate(4.5);

  //Set the amount of withdraw
  account.withdraw(2500);
  savings.withdraw(2500);
  checking.withdraw(2500);

  // Set the amount of deposit
  account.deposit(3000);
  savings.deposit(3000);
  checking.deposit(3000);

  // Output the results in string
  System.out.println(account.toString());
  System.out.println(savings.toString());
  System.out.println(checking.toString());
  }
}
