/**
 * (Sorted?) Write the following method that returns true
 * if the list is already sorted in increasing order.
 *        public static boolean isSorted(int[] list)
 * Write a test program that prompts the user to enter
 * a list and displays whether the list is sorted or not.
 * Here is a sample run. Note that the first number in the
 * input indicates the number of the elements in the list.
 * This number is not part of the list.
 *
 */

 public class Exercise19{
   //isSorted() method
   public static boolean isSorted(int[] list){
     for(int i = 0; i < list.length; i++){
       for(int j = i + 1; j < list.length; j++){
         if(list[i] > list[j])
            return false;
       }
     }
     return true;
   }
   //Main method
   public static void main(String[] args){
     int[] arr = {2, 3, 4, 5, 1, 6};
     int[] arr1 = {1, 3, 5, 7, 9};
    //Output the result
     System.out.println(isSorted(arr) + " " + isSorted(arr1));
   }
 }
