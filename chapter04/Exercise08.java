/**
 * (Find the character of an ASCII code) Write a program that
 * receives an ASCII code (an integer between 0 and 127) and
 * displays its character.
 *
 */
 import java.util.Scanner;

 class Exercise08{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     //Prompt the user to enter the ASCII code
     System.out.print("Enter an ASCII code: ");
     int i = input.nextInt();
     
     //Casting ASCII to character
     char ch = (char)i;
     System.out.println("The character for ASCII code " + i
            + " is " + ch);
   }
 }
