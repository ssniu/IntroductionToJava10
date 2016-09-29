
/**
 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, 
 * and 35 seconds. Write a program that displays the average speed in kilometers 
 * per hour. (Note that 1 mile is 1.6 kilometers.)
 * 
 */

 public class Chapter01_12{
  public static void main(String[] args){
   
  double distance = 24;
  double time, speed;
  
  time = 1.0 + 40 / 60.0 + 35 / (60.0 * 60.0);
  speed = distance * 1.6 / time;
  
  System.out.println("The average speed is " + speed);
 }
}
 

