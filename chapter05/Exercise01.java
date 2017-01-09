
/**
 * (Count positive and negative numbers and compute the average of numbers)
 * Write a program that reads an unspecified number of integers, determines how many
 * positive and negative values have been read, and computes the total and average of
 * the input values (not counting zeros). Your program ends with the input 0. Display
 * the average as a floating-point number.
 *
 */

 import java.util.Scanner;

 public class Exercise01{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter an integer, the input ends if it is 0: ");
     int number= input.nextInt();

     //Keep reading number until the input is 0
     double total = 0;
     int positiveCount = 0; // Count the number of positive numbers
     int negativeCount = 0; // Count the number of negative numbers
     int count = 0; // Total numbers including both positive and negative
     double average = 0;

     // If number = 0, users terminate the process
     if(number == 0){
       System.out.println("No numbers are entered except 0");
       System.exit(1);
     }

     // If number != 0, it counts the negative and positive numbers and compute the sum
     while(number != 0) {

       if(number > 0)
            positiveCount++;
       if(number < 0)
            negativeCount++;
        total += number;
        count++;
        number = input.nextInt();
       }

     average = total / count; // Compute the average

     System.out.println("The number of positives is " + positiveCount);
     System.out.println("the number of negatives is " + negativeCount);
     System.out.println("The total is " + total);
     System.out.println("The average is " + average);

   }
 }
