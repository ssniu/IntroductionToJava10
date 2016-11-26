/**
 * (Sum elements column by column)
 * Write a method that returns the sum of all the
 * elements in a specified column in a matrix using the following header:
 * public static double sumColumn(double[][] m, int columnIndex)
 * Write a test program that reads a 3-by-4 matrix and
 * displays the sum of each column.
 *
 */

 import java.util.Scanner;

 public class Exercise01{
   //Main method
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a 3-by-4 matrix row by row:");
    //Prompt the user to enter the 3-by-4 matrix
    double[][] arr = new double[3][4];
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        arr[i][j] = input.nextDouble();
      }
    }
    //Output the result
    for(int i = 0; i < arr[0].length; i++){
      System.out.println("Sum of the elements at column " + i + " is "
                  + sumColumn(arr, i));
    }
  }
  //sumColumn method
  public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        //Add each column elements 
        for(int i = 0; i < m.length; i++){
          sum += m[i][columnIndex];
        }
        return sum;
      }
  }
