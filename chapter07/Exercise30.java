/**
 * (Pattern recognition: consecutive four equal numbers)
 * Write the following method that tests whether the array
 * has four consecutive numbers with the same value.
 * public static boolean isConsecutiveFour(int[] values)
 * Write a test program that prompts the user to enter a series of integers
 * and displays if the series contains four consecutive numbers with
 * the same value. Your program should first prompt the user to
 * enter the input size—i.e., the number of values in the series.
 *
 */

 import java.util.Scanner;

 public class Exercise30{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter array elements
     System.out.print("Enter the number of array element: ");
     int k = input.nextInt();
     System.out.println("Enter the values:");
     int[] array1 = new int[k];
     for(int i = 0; i < array1.length; i++)
        array1[i] = input.nextInt();

      System.out.println("The list has " + (isConsecutiveFour(array1) ? "" : "no")
          + "consecutive fours");
   }
   //isConsecutiveFour() method
   public static boolean isConsecutiveFour(int[] values){
     int count = 1;
     for(int i = 0; i < values.length - 1; i++){
       if(values[i] == values[i + 1])
            count++;
       else
           count = 1;
     if(count >= 4)
        return true;
   }
   return false;
 }
 }
