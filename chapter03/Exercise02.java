
/**
 * (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java,
 * generates two integers and prompts the user to enter the sum of these two integers.
 * Revise the program to generate three single-digit integers and prompt the user to
 * enter the sum of these three integers
 *
 */
 import java.util.Scanner;

 public class Exercise02{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Generate 3 numbers by using System.currentTimeMillis()
     int number1 = (int)(System.currentTimeMillis() % 10);
     int number2 = (int)(System.currentTimeMillis() / 7 % 10);
     int number3 = (int)(System.currentTimeMillis() % 5);

     //Prompt question and ask user enter the summation of 3 numbers
     System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "?");
     int sum = input.nextInt();
     //Output the 3 numbers and their summation
     System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + sum );
   }
 }
