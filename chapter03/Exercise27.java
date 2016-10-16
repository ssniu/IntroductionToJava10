/**
 * (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
 * shown below. The right-angle point is placed at (0, 0), and the other two points
 * are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
 * a point with x- and y-coordinates and determines whether the point is inside the
 * triangle.
 *
 */

 import java.util.Scanner;

 class Exercise27{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     // Prompt the user enter the point with x and y coordinates
     System.out.print("Enter a point's x- and y- coordinates: ");
     double x1 = input.nextDouble();
     double y1 = input.nextDouble();
     // Compute the intersection point
     double x2 = (-x1 * (200 * 100)) / (-y1 * 200 - x1 * 100);
     double y2 = (-y1 * (200 * 100)) / (-y1 * 200 - x1 * 100);
     // If the point coordinates smaller than intersection point
     System.out.println("The point is" + ((x1 > x2 || y1 > y2) ? " not " : " ")
                + " in the triangle");

   }
 }
