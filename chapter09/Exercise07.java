/**
 * (The Account class) Design a class named Account that contains:
 * ■ A private int data field named id for the account (default 0).
 * ■ A private double data field named balance for the account (default 0).
 * ■ A private double data field named annualInterestRate that stores the current
 * interest rate (default 0). Assume all accounts have the same interest rate.
 * ■ A private Date data field named dateCreated that stores the date when the
 * account was created.
 * ■ A no-arg constructor that creates a default account.
 * ■ A constructor that creates an account with the specified id and initial balance.
 * ■ The accessor and mutator methods for id, balance, and annualInterestRate.
 * ■ The accessor method for dateCreated.
 * ■ A method named getMonthlyInterestRate() that returns the monthly interest rate.
 * ■ A method named getMonthlyInterest() that returns the monthly interest.
 * ■ A method named withdraw that withdraws a specified amount from the account.
 * ■ A method named deposit that deposits a specified amount to the account.
 * Draw the UML diagram for the class and then implement the class. (Hint: The
 * method getMonthlyInterest() is to return monthly interest, not the interest rate.
 * Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
 * is annualInterestRate / 12. Note that annualInterestRate is a percentage,
 * e.g., like 4.5%. You need to divide it by 100.)
 * Write a test program that creates an Account object with an account ID of 1122,
 * a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
 * method to withdraw $2,500, use the deposit method to deposit $3,000, and print
 * the balance, the monthly interest, and the date when this account was created.
 *
 */

 /**
  *     UML                               *
  *      Account                          *
  *---------------------------------------*
  *-id: int                               *
  *-balance: double                       *
  *-annualInterestRate: double            *
  *-dateCreated: Date                     *
  *+Account()                             *
  *+Account(newId:int, newBalance: double)*
  *+setId(newId:int)                      *
  *+setBalance(newBalance: double)        *
  *+setAnnualInterestRate(newAnnual: double*
  *+getId(): int                          *
  *+getBalance(): double                  *
  *+getAnnualInterestRate():double        *
  *+setDateCreated(): String              *
  *+getMonthluInterestRate(): double      *
  *+getMonthluInterest(): double          *
  *+withdraw(): double                    *
  *+deposit(): double                     *
  *****************************************/
import java.util.*;

public class Exercise07{
  public static void main(String[] args){
    Account accounts = new Account(1122, 20000);

    accounts.setAnnualInterestRate(4.5);

    accounts.withdraw(2500);

    accounts.deposit(3000);

    System.out.println("Account Id: " + accounts.getId() + "\nDate created: " +
       accounts.getDateCreated() + "\nBalance: " + accounts.getBalance() + "\nMonthly interest: " +
          accounts.getMonthlyInterest());
    }
  }






  class Account{
    // Date fields
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
   // No-args constructor that creates a default account
    Account(){
      id = 0;
      balance = 0;
      annualInterestRate = 0;
      dateCreated = new Date();
    }
    // Contructor creates an account with specified id and initial balance
    Account(int id2, double balance2){
      id = id2;
      balance = balance2;
    }
    // Mutator methods
    public void setId(int newId){
      id = newId;
    }

    public void setBalance(double newBalance){
      balance = newBalance;
    }

    public void setAnnualInterestRate(double newAnnual){
      annualInterestRate = newAnnual;
    }


    //Accessor methods
    public int getId(){
      return id;
    }

    public double getBalance(){
      return balance;
    }

    public double getAnnualInterestRate(){
      return annualInterestRate;
    }

    public String getDateCreated(){
      return dateCreated.toString();
    }
    // Methods
    public double getMonthlyInterestRate(){
      return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
      return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount){
      balance -= amount;
    }

    public void deposit(double amount){
      balance += amount;
    }
  }
