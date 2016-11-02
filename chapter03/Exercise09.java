
/**
 * (Business: check ISBN-10)
 * An ISBN-10 (International Standard Book Number)
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10.
 * The last digit, d10, is a checksum,
 * which is calculated from the other nine digits using the following formula:
 *   (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 * convention. Write a program that prompts the user to enter the first 9 digits and
 * displays the 10-digit ISBN (including leading zeros). Your program should read
 * the input as an integer.
 *
 */

 import java.util.Scanner;

 public class Exercise09{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter an ISBN number
     System.out.print("Enter the first 9 digits of an ISBN as integer: ");
     int digits2 = input.nextInt();
     int digits = digits2;
     //Compute and get 9 digits
     int d1, d2, d3, d4, d5, d6, d7, d8, d9;
     d1 = digits / 100000000;
     digits %= 100000000;
     d2 = digits / 10000000;
     digits %= 10000000;
     d3 = digits / 1000000;
     digits %= 1000000;
     d4 = digits / 100000;
     digits %= 100000;
     d5 = digits / 10000;
     digits %= 10000;
     d6 = digits / 1000;
     digits %= 1000;
     d7 = digits / 100;
     digits %= 100;
     d8 = digits / 10;
     d9 = digits % 10;
     //Compute the 10th character
     int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
              d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
     //If 10th character is 10, use X instead of 10, otherwise, using the 10th character
     if(d10 == 10)
       System.out.println("The ISBN-10 numbers is " + digits2 + "X");
     else
       System.out.println("The ISBN-10 numbers is " + digits2 + d10);
   }
 }
