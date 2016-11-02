
/**
 * (Physics: acceleration) Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as shown in the following formula:
 *        a = (v1 -v0) / t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/ second,
 * the ending velocity v1 in meters/second, and the time span t in seconds,
 * and displays the average acceleration.
 *
 */

 import java.util.Scanner;

 public class Exercise09{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    //Prompt the user to enter two speed value, and time
    System.out.print("Enter v0, v1, and t: ");
    double v0 = input.nextDouble();
    double v1 = input.nextDouble();
    double time = input.nextDouble();

    //Compute the average acceleration a
    double a = (v1 - v0) / time;
    
    //Output the result of average acceleration
    System.out.println("The average acceleration is : " + a);
  }
 }
