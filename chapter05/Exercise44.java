/**
 * (Computer architecture: bit-level operations) A short value is stored in 16 bits.
 * Write a program that prompts the user to enter a short integer and displays the 16
 * bits for the integer.
 *
 */

 import java.util.Scanner;

 class Exercise44{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     // Prompt the user to enter a short integer
     System.out.print("Enter an integer: ");
     short n = input.nextShort();
     // Define a string to keep the bits
     String bits = "";
     //Convert the short to bits
     for(int i = 0; i < 16; i++){
       bits = (n & 1) + bits;
       n >>= 1;
     }
     //Output the string bits
     System.out.println("The bits are " + bits);
   }
 }
