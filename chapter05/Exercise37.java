/**
 * (Decimal to binary)
 * Write a program that prompts the user to enter a decimal
 * integer and displays its corresponding binary value.
 * Don’t use Java’s Integer.toBinaryString(int) in this program.
 *
 */

 import java.util.Scanner;

 class Exercise37{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt user enter a decimal integer
     System.out.print("Enter a decimal integer: ");
     int i = input.nextInt();
     //Empty string to store the binary value
     String s = "";
     //Compute the binary value by dividied by 2
     for(int j = i; j > 0; j /= 2){
       s = j % 2 + s;
     }
     System.out.println("The binary value of " + i + " is " + s);
   }
 }
