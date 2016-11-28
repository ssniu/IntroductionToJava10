/**
 * (IllegalArgumentException)
 * Modify the Loan class in Listing 10.2 to throw IllegalArgumentException
 * if the loan amount, interest rate, or number of years is
 * less than or equal to zero.
 *
 */

 import java.util.*;

 public class Exercise04{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     boolean continueInput = true;

     do{
       //Exception
       try{
       System.out.print("Enter the loan amount, number of years" +
       " and annual rate:");

       double loanAmount = input.nextDouble();
       int numberOfYears = input.nextInt();
       double annualRate = input.nextDouble();

       Loan loan1 = new Loan(annualRate, numberOfYears, loanAmount);
       continueInput = false;//Exit the loop if numbers are valid
       System.out.println("The monthly payment is" + loan1.getMonthlyPayment()
                + " total payment is " + loan1.getTotalPayment());
     }
     catch(IllegalArgumentException ex){
       System.out.println("Should enter positive numbers");
     }
   }while(continueInput);
   }
 }
