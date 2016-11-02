/**
 * (Eliminate duplicates)
 * Write a method that returns a new array by eliminating
 * the duplicate values in the array using the following method header:
 *         public static int[] eliminateDuplicates(int[] list)
 * Write a test program that reads in ten integers, invokes the method,
 * and displays the result.
 *
 */

import java.util.Scanner;

 class Exercise15{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     //Prompt the user to enter all 10 numbers
     System.out.print("Enter 10 numbers: ");
     int[] nums = new int[10];
     for(int i = 0; i < nums.length; i++)
       nums[i] = input.nextInt();

     //Create a new array to store the distinct numbers
     int[] distinctListNumber = eliminateDuplicates(nums);

     System.out.print("The distinct numbers are: ");
     //Output the distinct numbe array
     for(int e: distinctListNumber){
       if(e > 0)
          System.out.print(" " + e);
     }
     System.out.println();
   }

   //Eliminate duplicated numbers in an array
   public static int[] eliminateDuplicates(int[] list){
     int[] distinctList = new int[list.length];
     int i = 0;
     //Linear search numbers one by one to delete the duplicated numbers
     for(int e: list){
       if(linearSearch(distinctList, e) == -1){
         distinctList[i] = e;
         i++;
       }
     }
     return distinctList;
   }
   
   //Linear search method to find each element
   public static int linearSearch(int[] array, int key){
     for(int i = 0; i < array.length; i++){
       if(key == array[i])
         return i;
     }
     return -1;
   }
 }
