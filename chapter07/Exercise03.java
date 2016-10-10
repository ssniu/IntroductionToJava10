/**
 * (Count occurrence of numbers) Write a program that reads the integers between 1
 * and 100 and counts the occurrences of each. Assume the input ends with 0.
 *
 */

 import java.util.Scanner;

 class Exercise03{
   // Counts methods to count the occurences
   public static void count(int[] counts){
     Scanner input = new Scanner(System.in);

     int num;
     do {
         num = input.nextInt();// Enter numbers
         if(num >= 1 && num <= 100)
            counts[num - 1]++;
     }while(num != 0);
   }

   public static void main(String[] args){
     int[] counts = new int[100];
     // Enter the number between 1 and 100
     System.out.print("Enter the integers between 1 and 100: ");
     // Using method count
     count(counts);
     //Output the result
     for(int i = 0; i < counts.length; i++){
       if(counts[i] > 0)
          // Adding pural word times when the number occurs more than once
           System.out.println((i + 1) + " occurs " + counts[i] + " time" + (counts[i] > 1 ? "s" : ""));
     }

   }
 }
