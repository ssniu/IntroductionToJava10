
/**
 * (Geometry: point in a circle?)
 * Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at (0, 0)
 * with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
 * circle, as shown in Figure 3.7a.
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
 * The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. Test your
 * program to cover all cases.)
 *
 */

 import java.util.Scanner;

 public class Exercise22{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     //Prompt user to enter two coordinates
     System.out.print("Enter a point with two coordinates: ");
     double x = input.nextDouble();
     double y = input.nextDouble();

     int radius = 10;
     double distance = Math.pow((x * x + y * y), 0.5);

     if(distance > 10)
        System.out.println("Point" + "( " + x + " , " + y + ")" + " is not in the circle");
     else
        System.out.println("Point" + "( " + x + " , " + y + ")" + " is in the circle");

   }
 }
