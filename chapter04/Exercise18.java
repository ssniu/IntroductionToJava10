/**
 * (Student major and status)
 * Write a program that prompts the user to
 * enter two characters and displays the major and status
 * represented in the characters. The first character indicates
 * the major and the second is number character 1, 2, 3, 4,
 * which indicates whether a student is a freshman, sophomore, junior, or senior.
 * Suppose the following chracters are used to denote the majors:
 * M: Mathematics
 * C: Computer Science
 * I: Information Technology
 *
 */

 import java.util.Scanner;

 class Exercise18{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

    //Prompt the user to enter the two characters: letter and number characters
     System.out.print("Enter two characters: ");
     String s = input.nextLine();
     char ch1 = s.charAt(0);

     //Convert the first letter to uppercase
     char ch1Up = Character.toUpperCase(ch1);
     char ch2 = s.charAt(1);
     
     //Check the input is invalid or not
     if((Character.isLetter(ch1)) && (Character.isDigit(ch2))){
       //Ouput the result
       switch(ch1Up){
         case 'M': System.out.print("Mathematics ");break;
         case 'C': System.out.print("Computer Science "); break;
         case 'I': System.out.print("Information Technology "); break;
         default : System.out.print("Invalid input");
       }
       switch(ch2){
         case '1': System.out.print("Freshman \n"); break;
         case '2': System.out.print("Sophomore \n"); break;
         case '3': System.out.print("Junior \n"); break;
         case '4': System.out.print("Senior \n"); break;
         default: System.out.print("Ivalid number character");
       }
     }
     else
       System.out.println("Invalid input, please enter the correct one.");
   }
 }
