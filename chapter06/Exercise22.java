/**
 * (Math: approximate the square root)
 * There are several techniques for implementing the sqrt method in the Math class.
 * One such technique is known as the Babylonian method.
 * It approximates the square root of a number, n, by repeatedly
 * performing a calculation using the following formula:
 *         nextGuess = (lastGuess + n / lastGuess) / 2
 * When nextGuess and lastGuess are almost identical, nextGuess is the
 * approximated square root. The initial guess can be any positive value (e.g., 1).
 * This value will be the starting value for lastGuess. If the difference between
 * nextGuess and lastGuess is less than a very small number, such as 0.0001,
 * you can claim that nextGuess is the approximated square root of n. If not, next-
 * Guess becomes lastGuess and the approximation process continues. Implement
 * the following method that returns the square root of n.
 *         public static double sqrt(long n)
 *
 */

 import java.util.Scanner;

 class Exercise22{
   //Main method
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter a number
     System.out.print("Enter a number: ");
     long n = input.nextLong();
     //Output the result
     System.out.println("The approximated square root of " + n + " is " + sqrt(n));
   }
   //Sqrt method to compute the square root of number n
   public static double sqrt(long n){
     //Initialize the lastGuess and nextGuess
     long lastGuess = 1;
     long nextGuess = (lastGuess + n / lastGuess) / 2;
    //Set the loop condition
     while(nextGuess - lastGuess > 0.0001){
       lastGuess = nextGuess;
       nextGuess = (lastGuess + n / lastGuess) / 2;
     }
     // Compute the nextGuess
     lastGuess = nextGuess;
     nextGuess = (lastGuess + n / lastGuess) / 2;
     return nextGuess;//Return result
   }
 }
