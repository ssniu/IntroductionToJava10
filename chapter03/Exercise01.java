/**
 * (Algebra: solve quadratic equations) The two roots of a quadratic equation
 * ax^2 + bx + c = 0 can be obtained using the following formula:
 * r1 = (-b + (b^2 - 4ac)^0.5)/2*a
 * and r2 = (-b - (b^2 - 4ac)^0.5)/2*a
 * b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 * equation has two real roots. If it is zero, the equation has one root. If it is negative,
 * the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 * has no real roots”.
 * Note that you can use Math.pow(x, 0.5) to compute 2x.
 *
 */

 import java.util.Scanner;

 public class Exercise01{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter a, b, c:");
     double a = input.nextDouble();
     double b = input.nextDouble();
     double c = input.nextDouble();

     double d;
     d = b * b - 4 * a * c;
     double r1, r2;

     if(d > 0) {
       r1 = (-b + Math.pow(d, 0.5)) / (2 * a);
       r2 = (-b - Math.pow(d, 0.5)) / (2 * a);
       System.out.println("The equation has two rootes" + r1 + " and " + r2);
     }
     else {
       System.out.println("The equation has one root -1");
     }
   }
 }
