/**
 * (Vowel or consonant?) Write a program that prompts
 * the user to enter a letter and check whether the letter
 * is a vowel or consonant.
 *
 */

 import java.util.Scanner;

 class Exercise13{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt user enter a character
     System.out.print("Enter a letter: ");
     String s = input.nextLine();
     char ch = s.charAt(0);
     //Check the character is a letter or not
     if(Character.isLetter(ch)){
       //Check the letter is vowel or not
       if((Character.toUpperCase(ch) == 'A') || (Character.toUpperCase(ch) == 'E') ||
     (Character.toUpperCase(ch) == 'I') || (Character.toUpperCase(ch) == 'O') || (Character.toUpperCase(ch) == 'U'))
        System.out.println(ch + " is a vowel");
       else
        System.out.println(ch + " is a vowel");
      }
    else
      System.out.println(ch + " is invalid input");
   }
 }
