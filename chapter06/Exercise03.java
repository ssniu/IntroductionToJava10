
/**
 * (Palindrome integer) Write the methods with the following headers
 * // Return the reversal of an integer, i.e., reverse(456) returns 654
 * public static int reverse(int number)
 * // Return true if number is a palindrome
 * public static boolean isPalindrome(int number)
 * Use the reverse method to implement isPalindrome. A number is a palindrome
 * if its reversal is the same as itself. Write a test program that prompts the
 * user to enter an integer and reports whether the integer is a palindrome.
 *
 */

 import java.util.Scanner;

 class Exercise03{
   public static int reverse(int number){
     String reverse = "";//Empyt string
     String n = number + "";//Convert number to string
     // Reverse String
     for(int i = n.length() -1; i >= 0; i--){
       reverse += n.charAt(i);
     }
     return Integer.parseInt(reverse);// Return reversed integer
   }
   // isPalindrome method returns true if the number is palindrome
   public static boolean isPalindrome(int number){
     return number == reverse(number) ? true : false;
   }

   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     // Ask user to enter a number
     System.out.print("Enter the number: ");
     int number = input.nextInt();

     System.out.println(number + ((isPalindrome(number)? " is ":" is not ") + " a palindrome."));
     /*if(isPalindrome(number))
       System.out.println("The number " + number + " is palindrome");
     else
       System.out.println("The number " + number + " is not palindrome");
       */
   }
 }
