/**
 * (Average an array)
 * Write two overloaded methods that return the average of an array
 * with the following headers:
 *         public static int average(int[] array)
 *         public static double average(double[] array)
 * Write a test program that prompts the user to enter ten double values,
 * invokes this method, and displays the average value.
 *
 */

import java.util.Scanner;

class Exercise08{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Prompt user enter the 10 numbers
    System.out.print("Enter tem double values: ");
    double[] arr = new double[10];
    // Input 10 numbers
    for(int i = 0; i < 10; i++){
      arr[i] = input.nextDouble();
    }
    //Output the result of average value
    System.out.println("The average of this array is: " + average(arr));

  }
  //Average method for integer array
  public static int average(int[] array){
    int total = 0;
    int average = 0;
    //Compute the average of integer array
    for(int i = 0; i < 10; i++){
      total += array[i];
      average = total / 10;
    }
    return average;
  }
  //Average method for double array
  public static double average(double[] array){
    double total = 0;
    double average = 0;
    //Compute the average value
    for(int i = 0; i < 10; i++){
      total += array[i];
      average = total / 10;
    }
    return average;

  }
}
