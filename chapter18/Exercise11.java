/**
 * (Sum the digits in an integer using recursion)
 * Write a recursive method that computes the sum of the digits
 * in an integer. Use the following method header:
 *     public static int sumDigits(long n)
 * For example, sumDigits(234) returns 2 + 3 + 4 = 9.
 * Write a test program that prompts the user to enter an integer
 * and displays its sum.
 *
 */

 import java.util.Scanner;

 public class Exercise11{
   //main() method
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a number: ");
    long n = input.nextLong();

   System.out.println("The sum of all digits in the number " + n
       + " is " + sumDigits(n));
 }
  //sumDigits() method
   public static int sumDigits(long n){
      return sumDigits(n, 0);
    }
    //sumDigits() helper method
   public static int sumDigits(long n, int sum){
     if(n == 0)
        return sum;
     else
        return sumDigits(n / 10, sum + (int)(n % 10));
   }
 }
