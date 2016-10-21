/**
 * (Find the smallest element)
 * Write a method that finds the smallest element in an
 * array of double values using the following header:
 *               public static double min(double[] array)
 * Write a test program that prompts the user to enter ten numbers,
 * invokes this method to return the minimum value,
 * and displays the minimum value.
 *
 */

 import java.util.Scanner;

 class Exercise09{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt user enter the double array elements
     System.out.print("Enter ten numbers: ");
     double[] arr = new double[10];
     //Input each element
     for(int i = 0; i < 10; i++){
       arr[i] = input.nextDouble();
     }
     //Output the minimum elements in this array
     System.out.println("The minimum number is: " + min(arr));
   }
   //Find the minimum element in the array
   public static double min(double[] array){
     double min = array[0];
     for(int i = 1; i < array.length; i++){
       if(array[i] <= min) // if the elements smaller than min, swap them
         min = array[i];
     }
     return min;
   }
 }
