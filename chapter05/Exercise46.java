
/**
 * (Reverse a string) Write a program that prompts the user to enter a string and
 * displays the string in reverse order.
 *
 */

import java.util.Scanner;

 class Exercise46{

   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter a string
     System.out.print("Enter a string: ");
     String str = input.nextLine();
     String s = "";
     //Display the string in reverse order
     for(int i = str.length() - 1; i >= 0; i--){
       s += str.charAt(i);
   }
   System.out.print(s);
   }
 }
