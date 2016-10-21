/**
 * (The MyTriangle class)
 * Create a class named MyTriangle that contains the
 * following two methods:
 *    // Return true if the sum of any two sides is
 *     // greater than the third side.
 *    public static boolean isValid(double side1, double side2, double side3)
 *    // Return the area of the triangle.
 *     public static double area(double side1, double side2, double side3)
 * Write a test program that reads three sides for a triangle and
 * computes the area if the input is valid. Otherwise,
 * it displays that the input is invalid. The formula for computing
 * the area of a triangle is given in Programming Exercise 2.19.
 *
 */
import java.util.Scanner;

 class Exercise19{
   //Valid or invalid input method
   public static boolean isValid(double side1, double side2, double side3){
     if(((side1 + side2) > side3) && ((side1 + side3) > side2) &&
        ((side2 + side3) > side1))
        return true;
     else
        return false;
   }
   // Compute the area of triangle
   public static double area(double side1, double side2, double side3){
     double s = (side1 + side2 + side3) / 2;
     double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
     return area;
   }

   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt user enter the three sides
     System.out.print("Enter the length of three sides: ");
     double side1 = input.nextDouble();
     double side2 = input.nextDouble();
     double side3 = input.nextDouble();

     System.out.println(
     isValid(side1, side2, side3) ? "The area is: " + area(side1, side2, side3) :
     "Invalid input.");
   }
 }
