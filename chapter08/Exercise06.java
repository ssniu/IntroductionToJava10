/**
 * (Algebra: multiply two matrices)
 * Write a method to multiply two matrices. The header of the method is:
 * public static double[][]
 * multiplyMatrix(double[][] a, double[][] b)
 * To multiply matrix a by matrix b, the number of columns in a must be the same as
 * the number of rows in b, and the two matrices must have elements of the same or
 * compatible types. Let c be the result of the multiplication. Assume the column size
 * of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
 * For example, for two 3 * 3 matrices a and b, c is
 * Write a test program that prompts the user to enter two 3 * 3 matrices and displays
 * their product.
 *
 */

 import java.util.Scanner;

 public class Exercise06{
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
     //Invoke the product() method
     print(product(matrix1,matrix2));
 }
 //product() method to compute the product of two matrices
  public static double[][] product(double[][] matrix1, double[][] matrix2){
    double[][] product = new double[3][3];
    for(int i = 0; i < product.length; i++){
      for(int j = 0; j < product[0].length; j++){
        product[i][j] = matrix1[i][j] * matrix2[i][j];
      }
    }
    return product;
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
