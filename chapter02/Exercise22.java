
/**
 * (Financial application: monetary units) Rewrite Listing 2.10,
 * ComputeChange.java, to fix the possible loss of accuracy when
 * converting a double value to an
 * int value. Enter the input as an integer whose last two digits represent the cents.
 * For example, the input 1156 represents 11 dollars and 56 cents
 *
 */

 import java.util.Scanner;

 public class Exercise22{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter the total value
     System.out.print("Enter the value $");
     double total = input.nextDouble();
     //Convert total to dollars and cents
     double dollars = total / 100;
     double cents = total % 100;
     //Output the results in dollars and cents
     System.out.println("The " + total + " represents " + dollars +
             " dollars and " + cents + " cents");
   }
 }
