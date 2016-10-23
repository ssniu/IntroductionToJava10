/**
 * (Check SSN) Write a program that prompts the user to
 * enter a Social Security number in the format DDD-DD-DDDD,
 * where D is a digit. Your program should check whether the
 * input is valid.
 *
 */

 import java.util.Scanner;

 class Exercise21{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt user enter the ssn number
     System.out.print("Enter a SSN: ");
     String s = input.nextLine();
    // Check the ssn is valid or invalid
     if((s.length() == 11) && (Character.isDigit(s.charAt(0))
        && (Character.isDigit(s.charAt(1)))
        && (Character.isDigit(s.charAt(2)))
        && (Character.isDigit(s.charAt(4)))
        && (Character.isDigit(s.charAt(5)))
        && (Character.isDigit(s.charAt(7)))
        && (Character.isDigit(s.charAt(8)))
        && (Character.isDigit(s.charAt(9)))
        && (Character.isDigit(s.charAt(10))
        )))
        System.out.println(s + " is a valid social security number");
      else
        System.out.println(s + " is an invalid social security number");
   }
 }
