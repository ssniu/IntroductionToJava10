/**
 * (Fibonacci series) Modify Listing 18.2, ComputeFibonacci.java,
 * so that the program finds the number of times the fib method is called.
 * (Hint: Use a static variable and increment it every time the method is called.)
 *
 */

 import java.util.Scanner;

 public class Exercise07{
   //Declare the static int to count the number of times that method is invoked
   public static int count = 0;

   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter a number
     System.out.print("Enter a number: ");
     int n = input.nextInt();
     //Output the result of Fibonacci and the number of times of method invoked
     System.out.println("The result of fabonacci is: " + fib(n));
     System.out.println("The fib method was called " + count
         +(count == 1 ? " time." : " times."));
   }
   //fib method
   public static int fib(int n){
      count++;//Increment count while fib method is invoked
      if(n == 0)//Base case 1
         return 0;
      else if(n == 1)//Base case 2
         return 1;
      else
         return fib(n-1) + fib(n-2);//Recursive method
   }
 }
