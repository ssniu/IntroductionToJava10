/**
 * (Decimal to hex) Write a program that prompts the user to enter an integer
 * between 0 and 15 and displays its corresponding hex number.
 *
 */

 import java.util.Scanner;

 public class Exercise11{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //prompt user enter a number between 0 and 15
     System.out.print("enter a decimal value(0 to 15): ");
     int i = input.nextInt();
     //Convert decimal number to a hexagon character
     if(i >= 0 && i <= 9)
        System.out.println("The hex value is " + i);
     else if(i > 9 && i <= 16)
        System.out.println("The hex value is "+ (char)(i + 'A' - 10));
     else
        System.out.println(i + " is an invalid input.");
   }
 }
