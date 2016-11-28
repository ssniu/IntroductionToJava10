/**
 * (Find the largest number in an array)
 * Write a recursive method that returns the largest integer in an array.
 * Write a test program that prompts the user to enter
 * a list of eight integers and displays the largest element.
 *
 */

 import java.util.Scanner;

 public class Exercise13{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter 8 numbers in the array
     System.out.print("Enter 8 numbers:");
     int[] arr = new int[8];
     for(int i = 0; i < 8; i++){
       arr[i] = input.nextInt();
     }
     //Output the result
     System.out.println("The largest number in the array is: " +
            largestNumber(arr));
   }
   //largestNumber() method
   public static int largestNumber(int[] array){
     int max = array[array.length - 1];
     int maxIndex = array.length - 1;
     return largestNumber(array, maxIndex, max);
   }
   //Helper method
   private static int largestNumber(int[] arr, int index, int max){
     if(index < 0)
         return max;
      else if(arr[index] > max){
          return largestNumber(arr, index - 1, arr[index]);
      }
      else
          return largestNumber(arr, index - 1, max);
   }
 }
