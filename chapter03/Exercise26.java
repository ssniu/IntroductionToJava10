/**
 * (Use the &&, || and ^ operators) Write a program that prompts the user to enter
 * an integer and determines whether it is divisible by 5 and 6, whether it is divisible
 * by 5 or 6, and whether it is divisible by 5 or 6, but not both.
 *
 */

 import java.util.Scanner;

 class Exercise26{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     // Enter the number
     System.out.print("Enter an integer: ");
     int x = input.nextInt();

     //Output the result of &&, || and ^
     System.out.println("Is " + x + " divisible by 5 and 6?"
            + (x % 5 == 0 && x % 6 == 0));

     System.out.println("Is " + x + " divisible by 5 or 6?"
            + (x % 5 == 0 || x % 6 == 0));

     System.out.println("Is " + x + " divisible by 5 or 6, but not both?"
                  + ((x % 5 == 0) ^ (x % 6 == 0)));
   }
 }
