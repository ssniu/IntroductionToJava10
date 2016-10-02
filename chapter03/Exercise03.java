
/**
 * (Algebra: solve 2 * 2 linear equations)
 * A linear equation can be solved using
 * Cramer’s rule given in Programming Exercise 1.13.
 * Write a program that prompts the user to enter a, b, c, d, e, and f
 * and displays the result. If ad - bc is 0, report that “The equation has no solution.”
 *
 */
import java.util.Scanner;

public class Exercise03{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a, b, c, d, e, f:");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();
    double e = input.nextDouble();
    double f = input.nextDouble();

    double m, x, y;
    m = a * d - b * c;
    if(m == 0)
       System.out.println("The equation has no solution");
    else {
      x = (e * d - b * f) / m;
      y = (a * f - e * c) / m;
      System.out.println("x is " + x + " and y is " + y);
    }

  }
}
