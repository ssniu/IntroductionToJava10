/**
 * (Phone key pads) The international standard letter/number
 * mapping found on the telephone is shown below:
 * Write a program that prompts the user to enter
 * a letter and displays its correspond- ing number.
 *
 */

 import java.util.Scanner;

 class Exercise15{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

    //Prompt the user to enter a letter
     System.out.print("Enter a letter: ");
     String s = input.nextLine();
     char ch = s.charAt(0);
     
     // Convert the input to uppercase letter
     char ch1 = Character.toUpperCase(ch);
     //If letter is greater than A and less than Z
     if(Character.isLetter(ch1)){
        if(ch1 >= 'W')
           System.out.println("The corresponding number is" + 9);
        else if(ch1 >= 'T')
           System.out.println("The corresponding number is " + 8);
        else if(ch1 >= 'P')
           System.out.println("The corresponding number is " + 7);
        else if(ch1 >= 'M')
           System.out.println("The corresponding number is " + 6);
        else if(ch1 >= 'J')
           System.out.println("The corresponding number is " + 5);
        else if(ch1 >= 'G')
           System.out.println("The corresponding number is " + 4);
        else if(ch1 >= 'D')
           System.out.println("The corresponding number is " + 3);
        else if(ch1 >= 'A')
           System.out.println("The corresponding number is " + 2);
     }
     //For other non-letter input, inform user that it is invalid input
     else
       System.out.println(ch + " is an invalid input");
   }
 }
