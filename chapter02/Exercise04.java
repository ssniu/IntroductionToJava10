
/**
 * (Convert pounds into kilograms) Write a program that converts pounds
 * into kilograms. The program prompts the user to enter a number
 * in pounds, converts it to kilograms, and displays the result.
 * One pound is 0.454 kilograms.
 *
 */

import java.util.Scanner;

public class Exercise04{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  //Prompt the user to enter the weight in pounds
  System.out.print("Enter a number in pounds: " );
  double pound = input.nextDouble();

  //Convert pounds to kg
  double kg;
  kg = pound * 0.454;
  //Output the weight in kilograms
  System.out.println(pound + " pounds is " + kg + " kilograms");
 }
}
