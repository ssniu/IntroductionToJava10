/**
 * (Revise selection sort)
 * In Section 7.11, you used selection sort to sort an array.
 * The selection-sort method repeatedly finds the smallest number
 * in the current array and swaps it with the first.
 * Rewrite this program by finding the largest number
 * and swapping it with the last. Write a test program
 * that reads in ten double numbers, invokes the method,
 * and displays the sorted numbers.
 *
 */

 import java.util.Scanner;

 public class Exercise20{
   //Selectionsort() method
   public static void selectionSort(double[] list){
     for(int i = 0; i < list.length; i++){
       double max = list[i];
       int index = i;
       //Find the largest element in the array
       for(int j = i + 1; j < list.length; j++){
         if(max < list[j]){
           max = list[j];
           index = j;
         }
       }
      //Swap the largest element in array[i]
       if(index != i){
         list[index] = list[i];
         list[i] = max;
       }
     }
   }
  //Main method
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     double[] num = new double[10];
     for(int i = 0; i < 10; i++){
       num[i] = input.nextDouble();
     }
     selectionSort(num);
     //Output the result
     for(double j: num)
     System.out.print(j + " ");
   }
 }
