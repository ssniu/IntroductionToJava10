
/**
 * (Sum the digits in an integer) Write a program that reads an integer
 * between 0 and 1000 and adds all the digits in the integer. For example,
 * if an integer is 932, the sum of all its digits is 14.
 * Hint: Use the % operator to extract digits, and use the / operator to
 * remove the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 *
 */

import java.util.Scanner;

public class Exercise06{
 public static void main(String[] args){

 Scanner input = new Scanner(System.in);
 //Prompt the user to enter a number between 0 and 1000
 System.out.print("Enter a number between 0 and 1000: ");
 int number = input.nextInt();
 int total;

 //Calculate all digits and sum them
 total = number % 10; // Compute the ones
 number = number / 10;
 total = total + number % 10;//Compute the tens
 number = number / 10;
 total = total + number;//Sum all digits
 //Output the summation of all those numbers
 System.out.println("The sum of the digits is " + total);
 }
}
