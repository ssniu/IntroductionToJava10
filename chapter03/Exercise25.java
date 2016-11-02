
/**
 * (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
 * y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
 * The intersecting point of the two lines can be found by solving the following
 * linear equation:
 *    (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 *    (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
 * This linear equation can be solved using Cramer’s rule (see Programming Exercise
 * 3.3). If the equation has no solutions, the two lines are parallel (Figure 3.8c).
 * Write a program that prompts the user to enter four points and displays the intersecting point.
 *
 */

import java.util.Scanner;

class Exercise25{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    // Prompt the user to enter the points
    System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double x3 = input.nextDouble();
    double y3 = input.nextDouble();
    double x4 = input.nextDouble();
    double y4 = input.nextDouble();
   // Compute the result via linear equation
    double a = y1 - y2;
    double b = x1 - x2;
    double c = y3 - y4;
    double d = x3 - x4;
    double e = a * x1 - b * y1;
    double f = c * x3 - d * y3;
    double m = a * d - b * c;
    double x = (e * d - b * f) / m;
    double y = (a * f - e * c) / m;

    // If the m == 0, the equation has no solution
    if(m == 0)
       System.out.println("The two lines are parallel");
    else
       System.out.println("The intersecting point is at ( " + x + " , " + y + " )");

  }
}
