/**
 * (Current time) Listing 2.7, ShowCurrentTime.java,
 * gives a program that displays the current time in GMT.
 * Revise the program so that it prompts the user to enter the
 * time zone offset to GMT and displays the time in the specified time zone.
 *
 */

 import java.util.Scanner;

 public class Exercise08{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the time zone offset to GMT: ");
     int gmt = input.nextInt();

     //Obtain the total milliseconds since mignight, Jan 1, 1970
     long currentTime = System.currentTimeMillis();

     // Compute and get the total seconds
     long totalSecond = currentTime / 1000;

     //Compute the current seconds after convert it to the minutes
     long currentSecond = totalSecond % 60;

     //Convert the totalSecond to totalMinute
     long totalMinute = totalSecond / 60;

     // Compute the current minutes after convert it to the hour
     long currentMinute = totalMinute % 60;

     // Compute the total hour
     long totalHour = totalMinute / 60;

     // Compute the current hour with GMT
     long currentHour = (totalHour + gmt) % 24;

     System.out.println("The currect time is " + currentHour + ":" + currentMinute + ":"
     + currentSecond);
   }
 }
