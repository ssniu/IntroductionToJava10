/**
 * (Geometry: point on line segment) Programming Exercise 3.32 shows how to test
 * whether a point is on an unbounded line. Revise Programming Exercise 3.32 to
 * test whether a point is on a line segment. Write a program that prompts the user
 * to enter the three points for p0, p1, and p2 and displays whether p2 is on the line
 * segment from p0 to p1.
 *
 */

 import java.util.Scanner;

 public class Exercise34{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     //Prompt the user  to enter the coordinates of three points
     System.out.print("Enter three points for p0, p1, and p2: ");
     double xp0 = input.nextDouble();
     double yp0 = input.nextDouble();
     double xp1 = input.nextDouble();
     double yp1 = input.nextDouble();
     double xp2 = input.nextDouble();
     double yp2 = input.nextDouble();

     //Computet the result of equation
     double i = (xp1 - xp0) * (yp2 - yp0) - (xp2 - xp0) * (yp1 - yp0);
     
     //Two conditions to make sure whether p2 is on the line or not
    if( i == 0)
        System.out.println("( " + xp2 + " , " + yp2 + ") is on " +
        " the line segment from ( " + xp0 + "," + yp0 + ") to (" +
        xp1 + " , " + yp1 + ")");
     else
        System.out.println("( " + xp2 + " , " + yp2 + ") is not on " +
        " the line from ( " + xp0 + "," + yp0 + ") to (" +
        xp1 + " , " + yp1 + ")");

   }
 }
