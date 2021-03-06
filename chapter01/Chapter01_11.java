
/**
 * (Population projection) The U.S. Census Bureau projects population based on
 * the following assumptions:
 * ■ One birth every 7 seconds
 * ■ One death every 13 seconds
 * ■ One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years.
 * Assume the current population is 312,032,486 and one year has 365 days.
 * Hint: In Java, if two integers perform division, the result is an integer.
 * The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25)
 * and 10 / 4 is 2 (not 2.5). To get an accurate result with the fractional
 * part, one of the values involved in the division must be a number
 * with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 *
 */

 public class Chapter01_11{
  public static void main(String[] args){
  //Define all variables
  double total = 312032486;
  double numberOfBirth, numberOfDeath, numberOfIm, numberOfEach, time;
  double year1, year2,year3, year4, year5;
  // Convert year to second
  time = 365 * 24 * 60 * 60;
  numberOfBirth = time / 7.0;
  numberOfDeath = time / 13.0;
  numberOfIm = time / 45.0;
  //Compute the number of people each year
  numberOfEach = numberOfBirth + numberOfIm - numberOfDeath;
  year1 = total + numberOfEach;
  year2 = year1 + numberOfEach;
  year3 = year2 + numberOfEach;
  year4 = year3 + numberOfEach;
  year5 = year4 + numberOfEach;
  //Output the result
  System.out.println("The population for each of the next five years are : "
      + year1 + year2 + year3 + year4 + year5);
 }
}
