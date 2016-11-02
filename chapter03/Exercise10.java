
/**
 * (Game: addition quiz)
 * Listing 3.3, SubtractionQuiz.java, randomly generates a
 * subtraction question. Revise the program to randomly generate an addition question
 * with two integers less than 100.
 *
 */

 import java.util.Scanner;

 public class Exercise10{
   public static void main(String[] args){
     int number1 = (int)(Math.random() * 100);
     int number2 = (int)(Math.random() * 100);

     //Prompt the addtion question, and ask user to enter the answer of this question
     System.out.println("What is " + number1 + " + " + number2 + " ? ");

     Scanner input = new Scanner(System.in);
     int answer = input.nextInt();
     //Output the answer
     System.out.println("The answer " + answer + " is " + (number1 + number2 == answer));
   }
 }
