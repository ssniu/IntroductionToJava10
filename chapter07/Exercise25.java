/**
 * (Algebra: solve quadratic equations)
 * Write a method for solving a quadratic equation using the following header:
 * public static int solveQuadratic(double[] eqn, double[] roots)
 * The coefficients of a quadratic equation ax2 + bx + c = 0
 * are passed to the array eqn and the real roots are stored in roots.
 * The method returns the number of real roots. See Programming
 * Exercise 3.1 on how to solve a quadratic equation.
 * Write a program that prompts the user to enter values for a, b, and c
 * and displays the number of real roots and all real roots.
 *
 */

 import java.util.Scanner;

 public class Exercise25{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter a, b, and c
     System.out.println("Please enter the a, b and c:");
     double[] eqn = new double[3];
     for(int i = 0; i < eqn.length; i++)
        eqn[i] = input.nextDouble();
     double[] roots = new double[2];
     System.out.println(solveQuadratic(eqn, roots));
   }
   //solveQuadratic() method
   public static int solveQuadratic(double[] eqn, double[] roots){
     double m = eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2];
     int count = 0;
     //Compute m and the number of roots 
     if(m == 0) {
        count = 1;
        roots[0] = -eqn[1] / ( 2 * eqn[0]);
   }
    else if(m < 0){
      count = 0;
    }
    else {
      count = 2;
      roots[0] = (-eqn[1] + Math.sqrt(m)) / ( 2 * eqn[0]);
      roots[1] = (-eqn[1] - Math.sqrt(m)) / ( 2 * eqn[0]);
    }
    return count;
  }
 }
