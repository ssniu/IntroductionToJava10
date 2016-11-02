/**
 * (Process a string)
 * Write a program that prompts the user
 * to enter a string and displays its length and
 * its first character.
 *
 */

 import java.util.Scanner;

 class Exercise20{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter a string
     System.out.print("Enter a string: ");
     String s = input.nextLine();
     //Display the length of string and its first character
     System.out.println("The first letter of " + s + " is " + s.charAt(0) +
       ", and the length of the string is " + s.length());
   }
 }
