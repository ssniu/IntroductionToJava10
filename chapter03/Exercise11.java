
/**
 * (Find the number of days in a month)
 * Write a program that prompts the user to enter the month and year and
 * displays the number of days in the month. For example,
 * if the user entered month 2 and year 2012, the program should display
 * that February 2012 had 29 days. If the user entered month 3 and year 2015, the
 * program should display that March 2015 had 31 days.
 *
 */
 import java.util.Scanner;

 public class Exercise11{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter month and year
     System.out.print("Enter the month:");
     int month = input.nextInt();

     System.out.print("Enter the year:");
     int year = input.nextInt();
     //Find the leap year
     boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
     //Output the month, year and days of this month
     switch(month) {
       case 1: System.out.println("January " + year + " had 31 days");
               break;
       case 2: System.out.println("February " + year + (isLeapYear ? " had 28 days" : " had 29 days"));
               break;
       case 3: System.out.println("March " + year + " had 31 days");
               break;
       case 4: System.out.println("April " + year + " had 30 days");
                break;
       case 5: System.out.println("May " + year + " had 31 days");
                break;
       case 6: System.out.println("June " + year + " had 30 days");
                break;
       case 7: System.out.println("July " + year + " had 31 days");
                break;
       case 8: System.out.println("August " + year + " had 31 days");
                break;
       case 9: System.out.println("September " + year + " had 30 days");
                break;
       case 10: System.out.println("October " + year + " had 31 days");
                break;
       case 11: System.out.println("November " + year + " had 30 days");
                break;
       case 12: System.out.println("December " + year + " had 31 days");
                break;
     }
   }
 }
