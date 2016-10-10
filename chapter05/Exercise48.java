/**
 * (Process string) Write a program that prompts the user to enter a string and displays
 * the characters at odd positions.
 *
 */

import java.util.Scanner;

 class Exercise48{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter a string: ");
     String str = input.nextLine();

     for(int i = 0; i <= str.length() - 1; i += 2){
       char ch = str.charAt(i);
      System.out.print(ch);
     }
   }
 }
