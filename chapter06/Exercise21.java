/**
 * (Phone keypads) The international standard letter/number mapping for telephones
 * is shown in Programming Exercise 4.15. Write a method that returns a number,
 * given an uppercase letter, as follows:
 *         int getNumber(char uppercaseLetter)
 * Write a test program that prompts the user to enter a phone number as a string.
 * The input number may contain letters. The program translates a letter (uppercase
 * or lowercase) to a digit and leaves all other characters intact.
 *
 */

 import java.util.Scanner;

 class Exercise21{
   //Main method
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter the string
     System.out.print("Enter a string: ");
     String s = input.nextLine();
     //Check if the character in the string is letter, convert it to uppercase
     //Using getNumber method to convert the uppercase letter to digit
     for(int i = 0; i < s.length(); i++){
       if(Character.isLetter(s.charAt(i)))
          System.out.print(getNumber(Character.toUpperCase(s.charAt(i))));
       else
          System.out.print(s.charAt(i));
     }
   }
   //getNumber method
   public static int getNumber(char uppercaseLetter){
     // Convert the uppercase letter to digit
     if(uppercaseLetter >= 'W')   return 9;
     else if(uppercaseLetter >= 'T')   return 8;
     else if(uppercaseLetter >= 'P')   return 7;
     else if(uppercaseLetter >= 'M')   return 6;
     else if(uppercaseLetter >= 'J')   return 5;
     else if(uppercaseLetter >= 'G')   return 4;
     else if(uppercaseLetter >= 'D')   return 3;
     else return 2;
   }
 }
