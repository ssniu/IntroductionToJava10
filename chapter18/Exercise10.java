/**
 * (Occurrences of a specified character in a string)
 * Write a recursive method that finds the number of
 * occurrences of a specified letter in a string using the following
 * method header:
 *        public static int count(String str, char a)
 * For example, count("Welcome", 'e') returns 2.
 * Write a test program that prompts the user to enter a string
 * and a character, and displays the number of occurrences
 * for the character in the string.
 *
 */

 import java.util.Scanner;

 public class Exercise10{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter a string and a character: ");
     //Split the input string
     String[] str = input.nextLine().split("[ ]");
     //Output the result
     System.out.println("The occurrences of character " + str[1].charAt(0)
         + " is " + count(str[0], str[1].charAt(0)));
   }
   //count method 1
   public static int count(String str, char a){
     int index = 0;
     int count = 0;
     return count(str, a, index, count);
   }
   //count method 2
   public static int count(String str, char a, int n, int count){
     if(n == str.length())
         return count;
     else if(str.charAt(n) == a)
        return count(str, a, ++n, ++count);//Recursive call
     else
         return count(str, a, ++n, count);//Recursive call
   }
 }
