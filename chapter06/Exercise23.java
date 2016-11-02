/**
 * (Occurrences of a specified character) Write a method that finds the number of
 * occurrences of a specified character in a string using the following header:
 *          public static int count(String str, char a)
 * For example, count("Welcome", 'e') returns 2. Write a test program that
 * prompts the user to enter a string followed by a character and displays the number
 * of occurrences of the character in the string.
 *
 */

 import java.util.Scanner;

 class Exercise23{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter a string and a character
     System.out.print("Enter a string and a character (\"welcome\", \'e\'): ");
     String s = input.nextLine();
     //Find the index of comma to seperate the string ans character
     int k = s.indexOf(", ");
     String str = s.substring(0, k);//Find the string
     char ch = s.charAt(k + 2);//Find the character
     //Output the result of occurences of characters in a string
     System.out.println("The number of occurrences of \" " + ch + "\" in \'" +
        str + "\" is:" + count(str, ch));
   }
   // Count occurrences method
   public static int count(String str, char a){
     int count = 0;
     //Find the same character, count increment by 1
     for(int i = 0; i < str.length(); i++){
       if(a == str.charAt(i))
          count++;
     }
     return count;
   }
 }
