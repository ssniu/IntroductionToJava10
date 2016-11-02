/**
 * (Compute the perimeter of a triangle)
 * Write a program that reads three edges for a triangle and computes
 * the perimeter if the input is valid. Otherwise, display that
 * the input is invalid. The input is valid if the sum of every pair of two edges is
 * greater than the remaining edge.
 *
 */

 import java.util.Scanner;

 public class Exercise19{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     //Prompt the user to enter three sides of a triangle
     System.out.print("Enter the three sides of a triangle: ");
     double side1 = input.nextDouble();
     double side2 = input.nextDouble();
     double side3 = input.nextDouble();

     double perimeter = 0;
     //Compute the perimeter
     if((side1 + side2) > side3 &&
        (side1 + side3) > side2 &&
        (side2 + side3) > side1) {
         perimeter = side1 + side2 + side3;
         System.out.println("The perimeter of triangle is: " + perimeter);
       }
     else
       System.out.println("Invalid input");
   }
 }
