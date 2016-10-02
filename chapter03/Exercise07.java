
/**
 * (Financial application: monetary units)
 * Modify Listing 2.10, ComputeChange.java, to display the nonzero denominations only,
 * using singular words for single units such as 1 dollar and 1 penny,
 * and plural words for more than one unit such as 2 dollars and 3 pennies
 *
 */

 import java.util.Scanner;

 public class Exercise07{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter an amount: ");
     double amount = input.nextDouble();

     int remainingAmount = (int)(amount * 100);

     //Find the number of one dollars
     int numberOfDollars = remainingAmount / 100;
     remainingAmount %= 100;

     // find the number of quarters in the remainingAmount
     int numberOfQuarters = remainingAmount / 25;
     remainingAmount %= 25;

     // Find the number of dimes
     int numberOfDimes = remainingAmount / 10;
     remainingAmount %= 10;

     // Find the number of nickels
     int numberOfNickels = remainingAmount / 5;
     remainingAmount %= 5;

     int numberOfPennies = remainingAmount;

     System.out.println("Your amount" + amount + " consists of " + numberOfDollars + (numberOfDollars > 1 ? " dollars " : " dollar ") +
     numberOfQuarters + (numberOfQuarters > 1 ? " quarters " : " quarter ") + numberOfDimes + (numberOfDimes > 1 ? " dimes " : " dime ") +
     numberOfNickels + (numberOfNickels > 1 ? " nickels " : " nickel ") + numberOfPennies + (numberOfNickels > 1 ? " pennies " : " penny "));
   }
 }
