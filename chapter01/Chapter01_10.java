
/**
 * (Average speed in miles) Assume a runner runs 14 kilometers
 * in 45 minutes and 30 seconds. Write a program that displays
 * the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
 *
 */

 public class Chapter01_10{
  public static void main(String[] args){

   //Declare variables
   double distance = 14;
   double time, speed;

   //Convert distance to mile
   distance /= 1.6;
   time = 45 * 60 + 30;
   speed = distance / (time / (60.0 * 60));
   //Output the results
   System.out.println("The speed is " + speed + " miles per hour");
 }
}
