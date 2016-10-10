/**
 * (Sum the digits in an integer) Write a method that computes
 * the sum of the digits in an integer. Use the following method header:
 * public static int sumDigits(long n)
 * For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator
 * to extract digits, and the / operator to remove the extracted digit. For instance,
 * to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10
 * (= 23). Use a loop to repeatedly extract and remove the digit until all the digits
 * are extracted. Write a test program that prompts the user to enter an integer and
 * displays the sum of all its digits.
 *
 */

 import java.util.Scanner;

 class Exercise02{
   public static int sumDigits(long n){
     int sum = 0;//Initialize sum of digits to 0
     int i = 0;
     // if n < 10, the sum is n
     if( n < 10)
       return (int)n;
     else {//if n > 10, compute the sum of all digits
     do {
       i = (int)n % 10;// Get the last digit
       n /= 10;
       sum += i;//Adding the digits from last digit to the second digit
     } while(n / 10 != 0);
     sum += n;// Adding the first digit
     return sum;
    }
   }

   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Ask user to enter a number
     System.out.print("Enter a number: ");
     long number = input.nextLong();
     //Output the sum of all digits
     System.out.println("The sum of the digits is: " + sumDigits(number));
   }
 }
