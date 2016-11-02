/**
 * (Count the letters in a string)
 * Write a method that counts the number of letters in a string using
 * the following header:
 *          public static int countLetters(String s)
 * Write a test program that prompts the user to enter a string and
 * displays the number of letters in the string.
 *
 */

 import java.util.Scanner;

 class Exercise20{
   //Main method
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter a string
     System.out.print("Enter a string: ");
      String s = input.nextLine();
    //Output the number of letters in the string
    System.out.println("The number of letters in the string " + s + " is " +
         countLetters(s));

   }
   //Count the number of letters in a string method
   public static int countLetters(String s){
     int numberOfLetters = 0;//Initialize the number of letters to 0
     //Count the number of letters from the first letter of the string
     for(int i = 0; i < s.length(); i++){
        if(Character.isLetter(s.charAt(i)))
           numberOfLetters++;
   }
   return numberOfLetters;
   }

 }
