/**
 * (Factorial) Using the BigInteger class introduced in Section 10.9,
 * you can find the factorial for a large number (e.g., 100!).
 * Implement the factorial method using recursion.
 * Write a program that prompts the user to enter an integer and
 * displays its factorial.
 *
 */

 import java.util.Scanner;
 import java.math.*;

 public class Exercise01{
   public static void main(String[] args){
     //Prompt the user to enter a BigInteger
     Scanner input = new Scanner(System.in);
     System.out.print("Enter a number: ");
     String n = input.nextLine();
     //Output the factorial result of BigInteger
     System.out.println("Factorial of " + n + " is "
            + factorial(new BigInteger(n)));
   }
   //Factorial method
   public static BigInteger factorial(BigInteger n){
     if(n.equals(BigInteger.ZERO))//Base case
         return BigInteger.ONE;
     else
       return n.multiply(factorial(n.subtract(BigInteger.ONE)));
   }
 }
