
/**
 * (Palindrome number)
 * Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome number. A number is palindrome
 * if it reads the same from right to left and from left to right.
 *
 */
 import java.util.Scanner;

 public class Exercise12{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter a 3 digtis integer
     System.out.print("Enter a three-digit integer: ");
     int number = input.nextInt();
     //Copmpute and find the first and second digits
     int digit1, digit3;
     digit1 = number / 100;
     digit3 = number % 10;
     //If the first digit equals second digit, it is palindrom
     if(digit1 == digit3)
         System.out.println(number + " is a palindrome.");
     else
         System.out.println(number + " is not a palindrome.");
   }
 }
