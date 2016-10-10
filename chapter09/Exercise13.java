/**
 * (The Location class) Design a class named Location for locating a maximal
 * value and its location in a two-dimensional array. The class contains public data
 * fields row, column, and maxValue that store the maximal value and its indices
 * in a two-dimensional array with row and column as int types and maxValue as
 * a double type.
 * Write the following method that returns the location of the largest element in a
 * two-dimensional array:
 * public static Location locateLargest(double[][] a)
 * The return value is an instance of Location. Write a test program that prompts
 * the user to enter a two-dimensional array and displays the location of the largest
 * element in the array.
 *
 */
import java.util.Scanner;

 class Location{
   // Data fields
    public int row;
    public int column;
    public double maxValue;
    // Constructor
    Location(double[][] a){
      maxValue = a[0][0];
      row = 0;
      column = 0;
      for(int i = 0; i < a.length; i++){
        for(int j = 0; j < a[i].length; j++){
          if(a[i][j] > maxValue){
            maxValue = a[i][j];
            row = i;
            column = j;
          }
        }
      }
    }
 }

 public class Exercise13{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     // Enter the values of rows and columns
     System.out.print("Enter the number of rows and columns: ");
     int row = input.nextInt();
     int column = input.nextInt();
     // Input the values of matrix
     double[][] array = new double[row][column];
     System.out.print("Enter the array:");
     for(int i = 0; i < array.length; i++){
       for(int j = 0; j < array[i].length; j++){
         array[i][j] = input.nextDouble();
       }
     }
     // New object of Location class
     Location maximum = new Location(array);

     System.out.println("The location of the largest element is" + maximum.maxValue +
        " at (" + maximum.row + + " , " + maximum.column + ")");
   }
   // Methods that return the location of the largest element in two-dimensional array
   public static Location locationLargest(double[][] a){
     return new Location(a);
   }
 }
