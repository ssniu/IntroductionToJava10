
/**
 * (Number of days in a year) Write a method that returns the number of days in a
 * year using the following header:
 *     public static int numberOfDaysInAYear(int year)
 * Write a test program that displays the number of days in year from 2000 to 2020.
 *
 */

 class Exercise16{

   public static int numberOfDaysInAYear(int year){
     // Find the leap year, the leap year has 366 days
     if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        return 366;
     else
        return 365;// Common year has 365 days
   }

   public static void main(String[] args){
     for(int i = 2000; i <= 2020; i++)
        System.out.print(numberOfDaysInAYear(i) + " ");
   }
 }
