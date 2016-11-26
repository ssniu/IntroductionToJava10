/**
 * (Financial application: monetary units) Rewrite Listing 2.10,
 * ComputeChange. java, to fix the possible loss of accuracy when
 * converting a float value to an int value. Read the input as a
 * string such as "11.56". Your program should extract the dollar
 * amount before the decimal point and the
 * cents after the decimal amount using the indexOf and substring methods.
 *
 */
import java.util.Scanner;

 public class Exercise26 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount, for example 11.56: ");
		String amount = input.nextLine();
    int k = amount.indexOf('.');
		// Extract number of dollars
		int numberOfOneDollars = Integer.parseInt(amount.substring(0, k));

		// Extract cents
		int cents = Integer.parseInt(amount.substring(k + 1));

		// Find the number of quarters
		int numberOfQuarters = cents / 25;
		cents %= 25;

		// Find the number of dimes
		int numberOfDimes = cents / 10;
		cents %= 10;

		// Find the number of nickels
		int numberOfNickels = cents / 5;
		cents %= 5;

		// Display results
		System.out.println("Your amount " + amount + " consists of\n "
			+ numberOfOneDollars + (numberOfOneDollars > 1 ? " dollars\n" : " dollar\n")
			+ numberOfQuarters + (numberOfQuarters > 1 ? " quarters\n" : " quarter\n")
			+ numberOfDimes + (numberOfDimes > 1 ? " dimes\n" : " dime\n")
			+ numberOfNickels + (numberOfNickels > 1 ? " nickels\n" : " nickel\n")
			+ cents + (cents > 1 ? " pennies" : " penny\n")
			);
	}
}
