/**
 * (Sum the major diagonal in a matrix)
 * Write a method that sums all the numbers in the major diagonal
 * in an n * n matrix of double values using the following header:
 * public static double sumMajorDiagonal(double[][] m)
 * Write a test program that reads a 4-by-4 matrix and
 * displays the sum of all its elements on the major diagonal.
 *
 */

 import java.util.Scanner;

 public class Exercise02{
   //Main method
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a 4-by-4 matrix row by:");
     //Prompt the user to enter 4-by-4 matrix
     double[][] arr = new double[4][4];
     for(int i = 0; i < arr.length; i++){
       for(int j = 0; j < arr[0].length; j++){
         arr[i][j] = input.nextDouble();
       }
     }
     //Output the result
     System.out.println("Sum of the elements in the major diagonal is " +
              sumMajorDiagonal(arr));
   }
   //sumMajorDiagonal method
   public static double sumMajorDiagonal(double[][] m){
     double sum = 0;
     for(int i = 0; i < m.length; i++)
      {
         sum += m[i][i];
       }
     return sum;
   }
 }
