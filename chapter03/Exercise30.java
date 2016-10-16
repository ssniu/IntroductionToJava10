/**
 * (Current time) Revise Programming Exercise 2.8 to display the hour using a
 * 12-hour clock.
 *
 */

 import java.util.Scanner;

 class Exercise30{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     // Enter the number of offset
     System.out.print("Enter the time zone offset to GMT: ");
     int i = input.nextInt();

     long totalMilliseconds = System.currentTimeMillis();
     //Compute the hours, minutes and seconds
     long totalSeconds = totalMilliseconds / 1000;

     long currentSecond = totalSeconds % 60;

     long totalMinutes = totalSeconds / 60;

     long currentMinutes = totalMinutes % 60;

     long totalHours = totalMinutes / 60;

     long currentHours = totalHours % 24;
     // Comptue the hours with offset
     currentHours = currentHours + i;

     System.out.println("Current time is " + ((currentHours > 12) ? (currentHours - 12) : currentHours) +
         " : " + currentMinutes + " : " + currentSecond + ((currentHours > 12) ? " PM " : " AM "));

   }
 }
