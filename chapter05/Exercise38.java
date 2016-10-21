/**
 * (Decimal to octal)
 * Write a program that prompts the user to enter a decimal
 * integer and displays its corresponding octal value.
 * Don’t use Java’s Integer.toOctalString(int) in this program.
 *
 */

 import java.util.Scanner;

 class Exercise38{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt user enter the decimal integer
     System.out.print("Enter a decimal integer: ");
     int i = input.nextInt();
     // Empty string to store the octal of decimal integer
     String oct = "";
     for(int j = i; j > 0; j /= 8){
       oct = j % 8 + oct;
     }
     System.out.println("The octal of " + i + " is " + oct);
   }
 }
