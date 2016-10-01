
/**
 * (Population projection)
 * Rewrite Programming Exercise 1.11 to prompt the user to enter
 * the number of years and displays the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program.
 * The population should be cast into an integer.
 *
 */
import java.util.Scanner;

public class Exercise11{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.print("Enter the number of years: ");
  int years = input.nextInt();

  double total = 312032486;
   double numberOfBirth, numberOfDeath, numberOfIm, numberOfEach, time;

   // Convert year to second
   time = 365 * 24 * 60 * 60;
   numberOfBirth = time / 7.0;
   numberOfDeath = time / 13.0;
   numberOfIm = time / 45.0;

   numberOfEach = numberOfBirth + numberOfIm - numberOfDeath;
   total += numberOfEach * years;

   System.out.println("The population in " + years + " years is " + total);
  }
 }
    
