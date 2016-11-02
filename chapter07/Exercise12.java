/**
 * (Reverse an array)
 * The reverse method in Section 7.7 reverses an array by
 * copying it to a new array. Rewrite the method that reverses
 * the array passed in the argument and returns this array.
 * Write a test program that prompts the user to enter ten numbers,
 * invokes the method to reverse the numbers, and displays the numbers.
 *
 */

 import java.util.Scanner;

 class Exercise12{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter the 10 numbers
     System.out.print("Enter the ten numbers: ");
     double[] arr = new double[10];
     for(int i = 0; i < 10; i++){
       arr[i] = input.nextDouble();
     }
     reverse(arr);//Invoke reverse method
   }

   //Reverse method to reverse the array
   public static void reverse(double[] array){
     //Reverse the array
     for(int i = array.length - 1; i >= 0; i--)
        System.out.print(array[i] + " ");
   }
 }
