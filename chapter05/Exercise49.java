
/**
 * (Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels.
 * Write a program that prompts the user to enter a string and displays the number
 * of vowels and consonants in the string.
 *
 */

 import java.util.Scanner;

 class Exercise49{

   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter a string: ");
     String str = input.nextLine();
     //Define the variables to store the number of vowels and consonants
     int count1 = 0;
     int count2 = 0;
     for(int i = 0; i < str.length(); i++){
       //Ignore the blank space
       if(str.charAt(i) != ' '){

       if(str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
          str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
          str.charAt(i) == 'u')
          count1++;
       else
          count2++;
     }
}
     System.out.println("The number of vowels is " + count1);
     System.out.println("The number of consonants is " + count2);
   }
 }
