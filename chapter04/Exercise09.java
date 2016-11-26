/**
 * (Find the Unicode of a character)
 * Write a program that receives a character and
 * displays its Unicode.
 *
 */

 import java.util.Scanner;

 class Exercise09{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

      //Prompt the user to enter the character
       System.out.print("Enter a character: ");
       String str = input.nextLine();
       char ch = str.charAt(0);
       
       //Casting character to integer
       int i = (int)ch;
       System.out.println("The Unicode for the character " +
            ch + " is " + i);
  }
 }
