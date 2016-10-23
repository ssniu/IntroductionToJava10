/**
 * (Check substring) Write a program that prompts the user
 * to enter two strings and reports
 * whether the second string is a substring of the first string.
 *
 */

import java.util.Scanner;

class Exercise22{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Prompt user enter two strings
    System.out.print("Enter string s1: ");
    String s1 = input.nextLine();

    System.out.print("Enter string s2: ");
    String s2 = input.next();
    //Using s.contains(s2) method to check the substring
    System.out.println(s2 + ((s1.contains(s2)) ? " is " : " is not") +
       "a substring of " + s1);
  }
}
