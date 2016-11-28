/**
 * (Algebra: solve quadratic equations)
 * Rewrite Programming Exercise 3.1 to obtain imaginary roots
 * if the determinant is less than 0 using the Complex class in
 * Programming Exercise 13.17.
 *
 */

 import java.util.Scanner;

 public class Exercise20{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter a b and c
     System.out.print("Enter a, b, c");
     double a = input.nextDouble();
     double b = input.nextDouble();
     double c = input.nextDouble();
     //Compute the value of d
     double d = b * b - 4 * a * c;
     //Set the condition for the number of root
     if (d > 0)
		{
			double r1 = (-b + Math.sqrt(d)) / (2 * a);
			double r2 = (-b - Math.sqrt(d)) / (2 * a);
			System.out.println("The roots are " + r1 + " and " + r2);
		}
		else if (d == 0)
		{
			System.out.println("The root is " +
				(-b + Math.sqrt(d)) / (2 * a));
		}
		else { // Display imaginary roots by using two Complex objects.
			System.out.print("The roots are ");
			Complex r1 = new Complex(-b / (2 * a), Math.sqrt(2 * a));
			Complex r2 = new Complex(-b / (2 * a), -Math.sqrt(2 * a));
			System.out.println(r1 + " and " + r2);
		}
   }
 }
