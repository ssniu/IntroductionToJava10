/**
 * (Convert letter grade to number) Write a program that prompts
 * the user to enter a letter grade A, B, C, D,
 * or F and displays its corresponding numeric value 4, 3, 2, 1, or 0.
 *
 */

import java.util.Scanner;

class Exercise14{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Prompt user enter the letter
    System.out.print("Enter a letter grade: ");
    String s = input.nextLine();
    char ch = s.charAt(0);
    ch = Character.toUpperCase(ch);//Convert all letters to uppercase
    //Convert letter to a number
      switch(ch){
        case 'A': System.out.println("The numeric value for grade " + ch + " is " + 4);break;
        case 'B': System.out.println("The numeric value for grade " + ch + " is " + 3);break;
        case 'C': System.out.println("The numeric value for grade " + ch + " is " + 2);break;
        case 'D': System.out.println("The numeric value for grade " + ch + " is " + 1); break;
        case 'F': System.out.println("The numeric value for grade " + ch + " is " + 0); break;
        default : System.out.println(ch + " is an invalid grade");
      }
  }
}
