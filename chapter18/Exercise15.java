/**
 * (Occurrences of a specified character in a string)
 * Rewrite Programming Exercise 18.10 using a helper method to pass
 * the substring high index to the method.
 * The helper method header is:
 * public static int count(String str, char a, int high)
 *
 */

 import java.util.Scanner;

 public class Exercise15{
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
     return count(str, a, str.length() - 1);
   }
   //Helper method
   public static int count(String str, char a, int high){
     if(high < 0)
         return 0;
     else if(str.charAt(high) == a)
        return 1 + count(str, a, high - 1);//Recursive call
     else
         return count(str, a, high - 1);//Recursive call
   }
 }
