/**
 * (Find the index of the smallest element)
 * Write a method that returns the index of
 * the smallest element in an array of integers.
 * If the number of such elements is greater than 1,
 * return the smallest index. Use the following header:
 *        public static int indexOfSmallestElement(double[] array)
 * Write a test program that prompts the user to enter ten numbers,
 * invokes this method to return the index of the smallest element,
 * and displays the index.
 *
 */

 import java.util.Scanner;

 class Exercise10{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter 10 numbers
     System.out.print("Enter ten numbers: ");
     double[] arr = new double[10];
     for(int i = 0; i < 10; i++){
       arr[i] = input.nextDouble();
     }

     //Output the result of minimum number's index
     System.out.println("The smallest element's index is: " +
              indexOfSmallestElement(arr));
   }
   
  //Find the index of minimum number in the array method
   public static int indexOfSmallestElement(double[] array){
     if(array.length <= 1)//If the array length is less than 1, return 0
         return 0;
    //Initialize minimum value to the first element of the array
     double min = array[0];
     int minIndex = 0;//Initialize the index to 0
     for(int i = 0; i < array.length; i++){
       //Find the index of minimum element in the array
       if(array[i] < min){
         min = array[i];
         minIndex = i;
       }
     }return minIndex;
   }
 }
