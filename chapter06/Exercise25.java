/**
 * (Convert milliseconds to hours, minutes, and seconds)
 * Write a method that converts milliseconds to hours, minutes, and seconds
 * using the following header:
 *           public static String convertMillis(long millis)
 * The method returns a string as hours:minutes:seconds. For example,
 * convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns
 * a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.
 *
 */
import java.util.Scanner;

 class Exercise25{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     // Prompt user enter the milliseconds
     System.out.print("Enter the milliseconds: ");
     long milliseconds = input.nextLong();
     //Output the string
     System.out.println("The time is: " + convertMillis(milliseconds));
   }

   public static String convertMillis(long millis){
     long totalSeconds = millis / 1000;
    //Convert the milliseconds to hours, minutes and seconds
     long seconds = totalSeconds % 60;
     totalSeconds /= 60;
     long minutes = totalSeconds % 60;
     long hours = totalSeconds / 60;
     //Initialize the string to empty string
     String s = "";
    //Set output format of the string
     s = hours + ":" + minutes + ":" + seconds;

     return s;
   }
 }
