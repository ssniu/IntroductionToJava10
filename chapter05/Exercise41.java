/**
 * (Occurrence of max numbers)
 * Write a program that reads integers, finds the largest
 * of them, and counts its occurrences. Assume that the input
 * ends with number 0. Suppose that you entered 3 5 2 5 5 5 0;
 * the program finds that the largest is 5 and the occurrence count
 * for 5 is 4.
 *
 */

 import java.util.Scanner;

 class Exercise41{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter the numbers
     System.out.print("Enter numbers: ");

     int count = 0;//Initialize the amount of max to 0
     //Initialize the max value to 1
     int max = 1;
     //Enter the first number
     int i = input.nextInt();
     
     while(i != 0){
       //If the next value larger than max value, set it to be max value
        if(i > max){
          max = i;
          count = 1;
        }
        //If the next input equals to max, the number of occurences incrrment by 1
        else if(i == max)
          count++;

        i = input.nextInt();
     }
     //Output the max value and occurences of max value
     System.out.println("The largest number is " + max);
     System.out.println("The occurence count of the largest number is " + count);
   }
 }
