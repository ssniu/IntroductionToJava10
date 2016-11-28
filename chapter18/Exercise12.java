/**
 * (Print the characters in a string reversely)
 * Rewrite Programming Exercise 18.9 using a helper method to
 * pass the substring high index to the method.
 * The helper method header is:
 * public static void reverseDisplay(String value, int high)
 *
 */

 import java.util.Scanner;

 public class Exercise12{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter a string
     System.out.println("Enter the string: ");
     String s = input.next();
     //Invoke the reverseString() method
     reverseString(s);
     System.out.println();
   }
   //reverseString() method
   public static void reverseString(String s){
     reverseString(s, s.length() - 1);
   }
   //Helper method
   private static void reverseString(String value, int high){
     if(high >= 0){
        System.out.print(value.charAt(high));
        reverseString(value, high - 1);
      }
   }
 }
