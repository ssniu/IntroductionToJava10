
/**
 * (Find the number of years) Write a program that prompts the user to
 * enter the minutes (e.g., 1 billion), and displays the number of years
 * and days for the min- utes. For simplicity, assume a year has 365 days.
 *
 */

 import java.util.Scanner;
 public class Exercise07{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //Prompt the user to enter the minute value
      System.out.print("Enter the number of minutes: ");
      int minutes = input.nextInt();

      //Compute the year and days
      int year, days;
      year = (int) minutes / (365 * 24 * 60);
      days = (minutes % (365 * 24 * 60)) / (24 * 60);
      
      //Output the years and days
      System.out.println(minutes + " minutes is approximately " +
         year + " years " + days + " days");
   }
 }
