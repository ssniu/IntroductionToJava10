/**
 * (Days of a month) Write a program that prompts the user
 * to enter a year and the first three letters of
 * a month name (with the first letter in uppercase)
 * and displays the number of days in the month.
 *
 */

 import java.util.Scanner;

 class Exercise17{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt user enter the year and month
     System.out.print("Enter a year: ");
     int i = input.nextInt();
     System.out.print("\nEnter a month (The first lette in uppercase): ");
     String s = input.next();
     //Check the year is leap year or not
     boolean isLeap = (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0));
     //Compare the month string to each month to decide the days of each month
    if(s.equals("Jan") || s.equals("Mar") || s.equals("May") || s.equals("Jul")
    ||s.equals("Aug") || s.equals("Oct") || s.equals("Dec"))
          System.out.println(s + i + " has 31 days");
    else if(s.equals("Apr") || s.equals("Jun") || s.equals("Sep") || s.equals("Nov"))
             System.out.println(s + i + " has 30 days");
    else
           System.out.println(s + i + " has " + ((isLeap) ? 29 : 28) + " days");
   }
 }
