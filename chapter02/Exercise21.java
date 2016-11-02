
/**
 * (Financial application: calculate future investment value) Write a program that
 * reads in investment amount, annual interest rate, and number of years, and displays
 * the future investment value using the following formula:
 *         futureInvestmentValue =
 * investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)
 * For example, if you enter amount 1000, annual interest rate 3.25%, and number
 * of years 1, the future investment value is 1032.98.
 *
 */

 import java.util.Scanner;

 public class Exercise21{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter the investment amount, interest rate and number of years
     System.out.print("Enter investment amount:");
     double investment = input.nextDouble();

     System.out.print("Enter annual interest rate in percentage:");
     double rate = input.nextDouble();
     rate /= 12;

     System.out.print("Enter number of years:");
     double years = input.nextDouble();
     years *= 12;

     //Compute the total value
     double futureValue;
     futureValue = investment * Math.pow((1 + rate), years);
     //Output the total value
     System.out.println("Accumulated value is $" + futureValue);
   }
 }
