
/**
 * (Physics: finding runway length)
 * Given an airplane’s acceleration a and take-off speed v,
 * you can compute the minimum runway length needed for an
 * airplane to take off using the following formula:
 *               length = v*v/2a
 * Write a program that prompts the user to enter v in meters/second (m/s)
 * and the acceleration a in meters/second squared (m/s2),
 * and displays the minimum run- way length.
 *
 */

 import java.util.Scanner;

 public class Exercise12{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   //Prompt the user to enter the speed and acceleration values
   System.out.print("Enter speed and acceleration: ");

   double v = input.nextDouble();
   double a = input.nextDouble();
   //Compute the length
   double length = v * v / ( 2 * a);
   System.out.println("The minimum runway length for this airplane is: "
           + length);
   }
 }
