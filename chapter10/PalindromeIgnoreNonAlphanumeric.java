/**
 * Write a new program that ignores nonalphanumeric
 * characters in checking whether a string is a palindrome.
 *
 */

 import java.util.Scanner;

 public class PalindromeIgnoreNonAlphanumeric{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt user enter the string
     System.out.print("Enter a string: ");
     String s = input.nextLine();

     System.out.println("Ignoring nonalphanumeric characters, \nis" +
          s + " a palindrome?" + isPalindrome(s));
   }
   //Check the string is palindrome or not
   public static boolean isPalindrome(String s){
     String s1 = filter(s);//Filter method to ignore the nonalphanumeric
     String s2 = reverse(s1);//Reverse the string

     return s2.equals(s1);//Check if the reverse string equals the original string
   }
   //Ignore the nonalphanumeric in the string
   public static String filter(String s){
     StringBuilder stringBuilder = new StringBuilder();

     for(int i = 0; i < s.length(); i++){
       //If the character is letter, then add it to new stringBuilder
       if(Character.isLetterOrDigit(s.charAt(i))){
         stringBuilder.append(s.charAt(i));
       }
     }
     //Output the result in string
     return stringBuilder.toString();
   }
   //Reverse string method by using reverse() of StringBuilder class
   public static String reverse(String s){
     StringBuilder stringBuilder = new StringBuilder(s);
     stringBuilder.reverse();

     return stringBuilder.toString();
   }
 }
