/**
 * (Identical arrays)
 * The arrays list1 and list2 are identical if they have the
 * same contents. Write a method that returns true if list1 and list2
 * are identical, using the following header:
 * public static boolean equals(int[] list1, int[] list2)
 * Write a test program that prompts the user to enter two lists of integers
 * and displays whether the two are identical.
 * Here are the sample runs. Note that the first
 * number in the input indicates the number of the elements in the list.
 * This number is not part of the list.
 *
 */

 import java.util.Scanner;

 public class Exercise27{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter the numer of elements of array1 and array1 elements
     System.out.print("Enter the number of array1 elements and all array1 elments:");
     int k = input.nextInt();
     int[] arr1 = new int[k];
     for(int i = 0; i < k; i++){
       arr1[i] = input.nextInt();
     }
     System.out.println();
     //Prompt the user to enter array2 elements and the number of elements
     System.out.print("Enter the number of array1 elements and all array1 elments:");
     int m = input.nextInt();
     int[] arr2 = new int[m];
     for(int i = 0; i < m; i++){
       arr2[i] = input.nextInt();
     }
     //Invoke the equals() method
     if(equals(arr1, arr2))
        System.out.println("Two lists are identical");
     else
        System.out.println("Two lists are not identical");
   }
   //equals() method
   public static boolean equals(int[] list1, int[] list2){
     //If two arrays have different length, return false
     if(list1.length != list2.length)
        return false;
     //Sort the two arrays
     selectionSort(list1);
     selectionSort(list2);
     //Compare each element in both arrays
     for(int i = 0; i < list1.length; i++){
         if(list1[i] != list2[i])
           return false;
     }
       return true;
   }

   public static void selectionSort(int[] list){
     for(int i = 0; i < list.length; i++){
       //Set the first element to be the minimum one
       int min = list[i];
       int index = i;
       //Find the smallest one
       for(int j = i + 1; j < list.length; j++){
         if(min > list[j]){
           min = list[j];
           index = j;
         }
       }
       //Swap the smallest one with original one
       if(index != i){
         list[index] = list[i];
         list[i] = min;
       }
     }
   }
 }
