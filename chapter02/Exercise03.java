
/**
 * (Convert feet into meters) Write a program that reads a number in feet,
 *  converts it to meters, and displays the result. One foot is 0.305 meter.
 *
 */

import java.util.Scanner;

public class Exercise03{
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  //Prompt the user to enter the feet value
  System.out.print("Enter a value for feet: ");
  double feet = input.nextDouble();

  //Calculate meter
  meter = feet * 0.305;
  //Output the result of meter
  System.out.println(feet + "feet is " + meter + " meters");
 }
}
