/**
 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
 * 2 * 2 system of linear equations:
 *     ax + by = e
 *     cx + dy = f
 *      x = (ed - bf)/(ad - bc)
 *      y = (af - ec)/(ad - bc)
 * The class contains:
 * ■ Private data fields a, b, c, d, e, and f.
 * ■ A constructor with the arguments for a, b, c, d, e, and f.
 * ■ Six getter methods for a, b, c, d, e, and f.
 * ■ A method named isSolvable() that returns true if ad - bc is not 0.
 * ■ Methods getX() and getY() that return the solution for the equation.
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that prompts the user to enter a, b, c, d, e, and f and displays the result.
 * If ad - bc is 0, report that “The equation has no solution.” See Programming
 *
 */

 /***********************************
  *             UML                 *
  *      LinearEquation             *
  *---------------------------------*
  *-a: double                       *
  *-b: double                       *
  *-c: double                       *
  *-d: double                       *
  *-e: double                       *
  *-f: double                       *
  *+LinearEquation(a: double, b: double, c: double, d:double, e:double, f:double)*
  *+getA(): double                  *
  *+getB(): double                  *
  *+getC(): double                  *
  *+getD(): double                  *
  *+getE(): double                  *
  *+getF(): double                  *
  *+isSolvable(): boolean           *
  *+getX(): double                  *
  *+getY(): double                  *
  ***********************************/

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

  public class Exercise11{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      // Enter the values of a, b, c, d, e, f
      System.out.print("Enter the value of a, b, c, d, e, f: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      double d = input.nextDouble();
      double e = input.nextDouble();
      double f = input.nextDouble();
      // Create a new object of LinearEquation class
      LinearEquation newLinear = new LinearEquation(a, b, c, d, e, f);

      // If isSolvable is true there are two solutions
      if(newLinear.isSolvable())
          System.out.println("The euqation has two solutions: " + newLinear.getX() + newLinear.getY());
      else
          System.out.println("The euqation has no solution.");
    }
  }
