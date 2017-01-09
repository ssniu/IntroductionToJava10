
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
     //Output the results of changes

     System.out.println("Your amount" + amount + " consists of " +
           (numberOfDollars == 0 ? " " : (numberOfDollars + (numberOfDollars > 1 ? " dollars and " : " dollar and "))) +
           (numberOfQuarters == 0 ? " " : (numberOfQuarters + (numberOfQuarters > 1 ? " quarters and " : " quarter and "))) +
           (numberOfDimes == 0 ? " " : (numberOfDimes + (numberOfDimes > 1 ? " dimes and " : " dime and "))) +
           (numberOfNickels == 0 ? " " : (numberOfNickels + (numberOfNickels > 1 ? " nickels and " : " nickel and "))) +
           (numberOfPennies == 0 ? " " : (numberOfPennies + (numberOfPennies > 1 ? " pennies" : " penny"))));
   }

 }
