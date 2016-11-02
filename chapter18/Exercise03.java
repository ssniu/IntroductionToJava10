/**
 * (Compute greatest common divisor using recursion) The gcd(m, n) can also
 * be defined recursively as follows:
 * If m % n is 0, gcd(m, n) is n.
 * Otherwise, gcd(m, n) is gcd(n, m % n).
 * Write a recursive method to find the GCD.
 * Write a test program that prompts the user to
 * enter two integers and displays their GCD.
 *
 */

 import java.util.Scanner;

 public class Exercise03{
   public static void main(String[] args){
     //Prompt the user to enter two integers
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the two integers: ");
     int i1 = input.nextInt();
     int i2 = input.nextInt();
     //Output the gcd of those two integers
     System.out.println("The gcd of " + i1 +
          " and " + i2 + " is " + gcd(i1, i2));
   }
   //Gcd method
   public static int gcd(int m, int n){
     if(m % n == 0) // Base case
         return n;
     else
         return gcd(n, m % n);//Recursively
   }
 }
