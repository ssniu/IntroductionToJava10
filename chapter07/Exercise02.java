/**
 * (Reverse the numbers entered) Write a program that reads ten integers and displays
 * them in the reverse of the order in which they were read.
 *
 */

 class Exercise02{
   public static void main(String[] args){
     int[] numbers = {12, 25, 36, 40, 58, 24, 16, 8, 3, 27};
     //For loop to display the reverse array
     for(int j = 9; j >= 0; j--){
         System.out.print(numbers[j] + " ");
       }
   }
 }
