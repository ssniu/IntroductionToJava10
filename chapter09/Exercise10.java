/**
 * (Algebra: quadratic equations) Design a class named QuadraticEquation for
 * a quadratic equation ax2 + bx + x = 0. The class contains:
 * ■ Private data fields a, b, and c that represent three coefficients.
 * ■ A constructor for the arguments for a, b, and c.
 * ■ Three getter methods for a, b, and c.
 * ■ A method named getDiscriminant() that returns the discriminant, which is
 * b2 - 4ac.
 * ■ The methods named getRoot1() and getRoot2() for returning two roots of
 * the equation
 *    r1 = (-b + (b^2 - 4ac)^0.5) / 2a
 *    r2 = (-b - (b^2 - 4ac)^0.5) / 2a
 * These methods are useful only if the discriminant is nonnegative. Let these methods
 * return 0 if the discriminant is negative.
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that prompts the user to enter values for a, b, and c and displays the result
 * based on the discriminant. If the discriminant is positive, display the two roots. If
 * the discriminant is 0, display the one root. Otherwise, display “The equation has
 * no roots.” See Programming Exercise 3.1 for sample runs.
 *
 */

 /*************************************
  *             UML                   *
  *         QuadraticEquation         *
  *-----------------------------------*
  *-a: double                         *
  *-b: double                         *
  *-c: double                         *
  *QuadraticEquation(a: double, b: double, c: double)*
  *+getA(): double                    *
  *+getB(): double                    *
  *+getC(): double                    *
  *+getDiscriminant(): double         *
  *+getRoot1(): double                *
  *+getRoot2(): double                *
  *************************************/
import java.util.Scanner;

  class QuadraticEquation{
    // Data fields
    private double a;
    private double b;
    private double c;
    // Constructor for the arguments for a, b and c
    QuadraticEquation(double newA, double newB, double newC){
      a = newA;
      b = newB;
      c = newC;
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
    // Compute the result methods
    public double getDiscriminant(){
      return (b * b - 4 * a * c);
    }
    public double getRoot1(){
      return getDiscriminant() < 0 ? 0 : (-b + Math.pow((b * b - 4 * a * c), 0.5) / 2 * a);
    }
    public double getRoot2(){
      return getDiscriminant() < 0 ? 0 : (-b - Math.pow((b * b - 4 * a * c), 0.5) / 2 * a);
    }

  }

  public class Exercise10{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
     // Input the values of a, b, c
      System.out.print("Enter the value of a, b, c:");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
     // Create a new object of QuadraticEquation class
      QuadraticEquation quadraticE = new QuadraticEquation(a,b,c);
      // Computet the root of equation
      if(quadraticE.getDiscriminant() < 0)
         System.out.println("The equation has no roots.");
      else if(quadraticE.getDiscriminant() == 0)
         System.out.println("The equation has one root: " + quadraticE.getRoot1());
      else
         System.out.println("The equation has two roots: " + quadraticE.getRoot1() +
             quadraticE.getRoot2());
    }
  }
