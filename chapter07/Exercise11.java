/**
 * (Statistics: compute deviation)
 * Programming Exercise 5.45 computes the standard
 * deviation of numbers. This exercise uses a different
 * but equivalent formula to compute the standard deviation of n numbers.
 *        mean = (x1 + x2 + ... + xn) / n
 *     deviation = ((xi - mean)^2 / (n-1))^0.5
 * To compute the standard deviation with this formula,
 * you have to store the individual numbers using an array,
 * so that they can be used after the mean is obtained.
 * Your program should contain the following methods:
 *    Compute the deviation of double values
 *         public static double deviation(double[] x)
 *    Compute the mean of an array of double values
 *         public static double mean(double[] x)
 *  Write a test program that prompts the user to enter ten numbers
 * and displays the mean and standard deviation,
 *
 */
import java.util.Scanner;

class Exercise11{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //Prompt the user to enter the ten numbers
    System.out.print("Enter ten numbers: ");
    double[] arr = new double[10];
    //Store the ten numbers in arr
    for(int i = 0; i < 10; i++){
      arr[i] = input.nextDouble();
    }
    //Output the results of mean and deviation for arr
    System.out.println("The mean is " + mean(arr));
    System.out.println("The standard deviation is " + deviation(arr));
  }

  //Deviation method
  public static double deviation(double[] x){
    double total2 = 0;
    double devia = 0;
    for(int i = 0; i < x.length; i++){
      total2 += Math.pow((x[i] - mean(x)), 2);

    }
    //Compute the deviation of arr
    devia = Math.pow((total2 / (x.length - 1)), 0.5);
    return devia;
  }

  //Mean method
  public static double mean(double[] x){
    double total = 0;
    double mean = 0;

    for(int i = 0; i < x.length; i++){
      total += x[i];
      mean = total / x.length;
    }
    return mean;
  }
}
