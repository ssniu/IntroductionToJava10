
/**
 * (Count uppercase letters) Write a program that prompts the user to enter a string
 * and displays the number of the uppercase letters in the string.
 *
 */

 import java.util.Scanner;

 class Exercise50{

   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter a string: ");
     String str = input.nextLine();
     //Initialize the number of uppercase letters
     int count = 0;
     for(int i = 0; i < str.length(); i++){
       //If the letter is uppercase, count increment by 1
       if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
         count++;
     }
    System.out.println("The number of uppercase letters is " + count);
   }
 }
