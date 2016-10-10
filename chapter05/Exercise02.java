
/**
 * (Repeat additions) Listing 5.4, SubtractionQuizLoop.java,
 * generates five random subtraction questions.
 * Revise the program to generate ten random addition questions
 * for two integers between 1 and 15. Display the correct count and test time.
 *
 */

 import java.util.Scanner;

 public class Exercise02{
   public static void main(String[] args){

     final int NUMBER_OF_QUESTIONS = 10;
     int correctCount = 0; // Count the correct answer
     int count = 0; // count the questions
     long startTime = System.currentTimeMillis();
     String output = " "; // Output string is initially empty
     Scanner input = new Scanner(System.in);

     while(count < NUMBER_OF_QUESTIONS){
       //Generate two random single-digit integers
       int number1 = (int)(Math.random() * 15 + 1);
       int number2 = (int)(Math.random() * 15 + 1);

       //Prompt the users to answer question of additions
       System.out.print("What is " + number1 + " + " + number2 + "? ");
       int answer = input.nextInt();

       // Count the correct answer
       if(number1 + number2 == answer) {
         System.out.println("You are correct!");
         correctCount++;
       }
       else
         System.out.println("The correct answer should be" + number1 + " + " + number2 + " = " + (number1 + number2));

       count++;
       output += "\n" + number1 + " + " + number2 + "=" + answer + ((number1 + number2 == answer) ? " correct" : " wrong");
     }

     long endTime = System.currentTimeMillis();
     long testTime = endTime - startTime;

     System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " second\n" + output);

   }
 }
