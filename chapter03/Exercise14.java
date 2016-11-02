
/**
 * (Game: heads or tails)
 * Write a program that lets the user guess whether the flip of
 * a coin results in heads or tails. The program randomly generates an integer 0 or 1,
 * which represents head or tail. The program prompts the user to enter a guess and
 * reports whether the guess is correct or incorrect.
 *
 */

 import java.util.Scanner;
 import java.util.Random;

 public class Exercise14{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Genearate a random boolean value
     Random rand = new Random();
     boolean coin = rand.nextBoolean();
     int i;

     if(coin)
        i = 1;
     else
        i = 0;

     System.out.print("Enter your guess: ");
     int guess = input.nextInt();
     //If the guess equals the random boolean value, the guess is correct
     if (i == guess)
       System.out.println("Your guess is correct.");
     else
       System.out.println("Your guess is incorrect.");
   }
 }
