/**
 * (Use the Date class) Write a program that creates a Date object, sets its elapsed
 * time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
 * 10000000000, and 100000000000, and displays the date and time using the
 * toString() method, respectively.
 *
 */

 public class Exercise03{
   public static void main(String[] args){
     // New object of Date class
     java.util.Date date = new java.util.Date();

     System.out.println("The dates and times for elapsed time to 10000, " +
         "100000, 1000000, 10000000, \n100000000, 1000000000, 10000000000, 100000000000" +
          " respectively");
    //Output the result respectively
    for(long i = 10000; i <= 1e11; i *= 10){
        date.setTime(i);
        System.out.println(date.toString());// Convert the results to string
    }
   }
 }
