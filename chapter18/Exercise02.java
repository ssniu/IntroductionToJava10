/**
 * (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
 * Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2)
 * and fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci
 * numbers. The current Fibonacci number would then be f0 + f1. The algorithm
 * can be described as follows:
 *   f0 = 0; // For fib(0)
 *   f1 = 1; // For fib(1)
 *   for (int i = 1; i <= n; i++) {
 *       currentFib = f0 + f1;
 *       f0 = f1;
 *       f1 = currentFib;
 *    }
 *   // After the loop, currentFib is fib(n)
 *  Write a test program that prompts the user to enter an index and displays
 * its Fibonacci number.
 *
 */
import java.util.Scanner;


 public class Exercise02{
   public static void main(String[] args){
     //Prompt user enter the number
     Scanner input = new Scanner(System.in);
     System.out.print("Enter an integer: ");
     int m = input.nextInt();
    //Output the result of fibonacci of number
     System.out.println("The factorial number of " + m + " is " + fibonacci(m));
   }
   //Fibonacci method
   public static int fibonacci(int n){
     //Initialize f0, f1 and current fib
     int f0 = 0;
     int f1 = 1;
     int currentFib = 0;
     //Compute the result by using for loop
     for(int i = 1; i < n; i++){
       currentFib = f0 + f1;
       f0 = f1;
       f1 = currentFib;
     }
     return currentFib;//Return current value
   }
 }
