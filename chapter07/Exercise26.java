/**
 * (Strictly identical arrays)
 * The arrays list1 and list2 are strictly identical
 * if their corresponding elements are equal.
 * Write a method that returns true if list1 and list2 are strictly
 * identical, using the following header:
 * public static boolean equals(int[] list1, int[] list2)
 * Write a test program that prompts the user to enter
 * two lists of integers and displays whether the two are strictly
 * identical. Here are the sample runs. Note that the first number
 * in the input indicates the number of the elements in the list.
 * This number is not part of the list.
 *
 */
 import java.util.Scanner;

 public class Exercise26{
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
        System.out.println("Two lists are strictly identical");
     else
        System.out.println("Two lists are not strictly identical");
   }
   //equals() method
   public static boolean equals(int[] list1, int[] list2){
     //If two arrays have different length, return false
     if(list1.length != list2.length)
        return false;
     //Compare each element in both arrays
     for(int i = 0; i < list1.length; i++){
         if(list1[i] != list2[i])
           return false;
       }
       return true;
   }
 }
