
/**
 * (Financial application: calculate tips) Write a program that reads the 
 * subtotal and the gratuity rate, then computes the gratuity and total. 
 * For example, if the user enters 10 for subtotal and 15% for gratuity 
 * rate, the program displays $1.5 as gratuity and $11.5 as total.
 *
 */

import java.util.Scanner;

public class Exercise05{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
 
  System.out.print("Enter the gratuity rate and subtotal:");
  double gratuityRate = input.nextDouble();
  double subtotal = input.nextDouble();
  double gratuity,total;
  
  gratuity = subtotal * (gratuityRate / 100.0);
  total = subtotal + gratuity;
  
  System.out.println("The gratuity is " + gratuity + " and total is $" + total);
 }
}

  
   
