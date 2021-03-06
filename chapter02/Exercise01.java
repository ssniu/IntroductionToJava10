
/**
 * Convert Celsius to Fahrenheit) Write a program that reads a Celsius
 * degree in a double value from the console, then converts it to Fahrenheit
 * and displays the result. The formula for the conversion is as follows:
 *        fahrenheit = (9 / 5) * celsius + 32
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 *
 */

 import java.util.Scanner;

 public class Exercise01{
  public static void main(String[] args){

  Scanner input = new Scanner(System.in);
  //Prompt the user to enter the celsius degree
  System.out.print(" Enter a degree in Celsius: " );
  double celsius = input.nextDouble();
  //Define and convert celsius to fahrenheit
  double fahrenheit;
  fahrenheit = (9 / 5.0) * celsius + 32;
  //Output the result
  System.out.println( celsius + " Celsius is " +
      fahrenheit + " Fahrenheit");
 }
}
