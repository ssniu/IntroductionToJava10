/**
 * (Algebra: add two matrices)
 * Write a method to add two matrices. The header of the method is as follows:
 *   public static double[][] addMatrix(double[][] a, double[][] b)
 * In order to be added, the two matrices must have the same dimensions and the
 * same or compatible types of elements. Let c be the resulting matrix. Each element
 * cij is aij + bij. For example, for two 3 * 3 matrices a and b, c is:
 * Write a test program that prompts the user to enter two 3 * 3 matrices and
 * displays their sum.
 *
 */

 import java.util.Scanner;

 public class Exercise05{
   public static void main(String[] args){
     //Prompt the user to enter two matrices
     Scanner input = new Scanner(System.in);
     System.out.print("Enter matrix1: \"3 X 3\"");
     double[][] matrix1 = new double[3][3];
     for(int i = 0; i < matrix1.length; i++){
       for(int j = 0; j < matrix1[0].length; j++){
         matrix1[i][j] = input.nextDouble();
       }
     }
     System.out.print("Enter matrix1: \"3 X 3\"");
     double[][] matrix2 = new double[3][3];
     for(int i = 0; i < matrix2.length; i++){
       for(int j = 0; j < matrix2[0].length; j++){
         matrix2[i][j] = input.nextDouble();
       }
     }
     //Invoke the print() method to print the matrices
     print(matrix1);
     System.out.print(" + ");
     print(matrix2);
     System.out.print(" = ");
     //Invoke the sum() method
     print(sum(matrix1,matrix2));
 }
 //sum() method to compute the sum of two matrices
  public static double[][] sum(double[][] matrix1, double[][] matrix2){
    double[][] sums = new double[3][3];
    for(int i = 0; i < sums.length; i++){
      for(int j = 0; j < sums[0].length; j++){
        sums[i][j] = matrix1[i][j] + matrix2[i][j];
      }
    }
    return sums;
  }
  //print() method to print the matrices
  public static void print(double[][] arr){
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
 }
