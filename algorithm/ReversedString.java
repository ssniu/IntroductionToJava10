/*
 * 344 Reverse String
 * Write a function that takes a string as input and
 * returns the string reversed.
 * Example:
 * Given s = "hello", return "olleh".
 *
 */

 import java.util.Scanner;

 public class ReversedString{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter a word:");
     String str = input.nextLine();

     System.out.println("The reversed string is: " + reversedString(str));
   }
   //reversedString() method to return the result
   public static String reversedString(String s){
     //Create a new char[] to store the characters of string
     char[] ch = s.toCharArray();
      int i = 0;
      int j = s.length() -1;
      //Swap the elements of char[]
      while(i < j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        i++;
        j--;
      }
      //Return the result as a string
       return new String(ch);
     }
   }
