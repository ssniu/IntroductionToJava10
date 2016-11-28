/**
 * (Find the number of uppercase letters in a string)
 * Write a recursive method to return the number of uppercase letters
 * in a string. Write a test program that prompts the user to enter
 * a string and displays the number of uppercase letters in the string.
 *
 */

 import java.util.Scanner;

 public class Exercise14{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter a string
     System.out.print("Enter a string: ");
     String s = input.nextLine();
     //Output the result
     System.out.println(s + " has " + countUppercase(s) + " uppercase letters");
   }
   //countUppercase() method
   public static int countUppercase(String s){
     int count = 0;
     int index = s.length() - 1;
     return countUppercase(s, index, count);
   }
   //Helper method
   private static int countUppercase(String s, int index, int count){
     if(index < 0)
        return count;
     else if(Character.isUpperCase(s.charAt(index)))
        return countUppercase(s, index - 1, count + 1);
     else
        return countUppercase(s, index - 1, count);
   }
 }
