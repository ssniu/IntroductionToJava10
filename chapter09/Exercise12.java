/**
 * (Geometry: intersecting point) Suppose two line segments intersect. The two endpoints
 * for the first line segment are (x1, y1) and (x2, y2) and for the second line
 * segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
 * these four endpoints and displays the intersecting point. As discussed in Programming
 * Exercise 3.25, the intersecting point can be found by solving a linear equation.
 * Use the LinearEquation class in Programming Exercise 9.11 to solve this equation.
 *
 */
import java.util.Scanner;

 import java.util.Scanner;

 class LinearEquation{
   // Data fields
   private double a;
   private double b;
   private double c;
   private double d;
   private double e;
   private double f;
   // Constructor with arguments for a, b, c, d, e, and f
   LinearEquation(double newA, double newB, double newC, double newD, double newE,
       double newF){
         a = newA;
         b = newB;
         c = newC;
         d = newD;
         e = newE;
         f = newF;
       }
   // Getter methods
   public double getA(){
     return a;
   }
   public double getB(){
     return b;
   }
   public double getC(){
     return c;
   }
   public double getD(){
     return d;
   }
   public double getE(){
     return e;
   }
   public double getF(){
     return f;
   }
   // If ad - bc = 0, no solution
   public boolean isSolvable(){
     if((a * d - b * c) != 0)
        return true;
     else
        return false;
   }
   // Get the results of x and y
   public double getX(){
     return (e * d - b * f) / (a * d - b * c);
   }
   public double getY(){
     return (a * f - e * c) / (a * d - b * c);
   }
 }

 public class Exercise12{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Enter the 4 endpoints
     System.out.print("Enter the 4 endpoints: ");
     double x1 = input.nextDouble();
     double y1 = input.nextDouble();
     double x2 = input.nextDouble();
     double y2 = input.nextDouble();
     double x3 = input.nextDouble();
     double y3 = input.nextDouble();
     double x4 = input.nextDouble();
     double y4 = input.nextDouble();
     // Compute the value of a, b, c, d, e, f
     double a = y1 - y1;
     double b = x2 - x1;
     double c = y3 - y4;
     double d = x4 - x3;
     double e = x1 * (y1 - y2) - y1 * (x1 - x2);
     double f = x3 * (y3 - y4) - y3 * (x3 - x4);
     // Create a new object of LinearEquation class
     LinearEquation newLinear = new LinearEquation(a, b, c, d, e, f);

     // If isSolvable is true there are two solutions
     if(newLinear.isSolvable())
         System.out.println("The intersection point is at " + "(" + newLinear.getX() +
             "," + newLinear.getY() + ")");
     else
         System.out.println("The two lines are parallel.");

   }
 }
