
/**
 * (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
 * which all sides are of the same length and all angles have the same degree (i.e., the
 * polygon is both equilateral and equiangular). The formula for computing the area
 * of a regular polygon is
 *    Area = n * s^2 / (4 * tan(pi / n))
 * Here, s is the length of a side. Write a program that prompts the user to enter the
 * number of sides and their length of a regular polygon and displays its area.
 *
 */

 import java.util.Scanner;

 class Exercise05{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter number of sides
     System.out.print("Enter the number of sides: ");
     double numberOfSides = input.nextDouble();

     System.out.print("Enter the side:");
     double s = input.nextDouble();
     //Compute the area
     double area;
     area = (numberOfSides * s * s) / (4 * Math.tan(Math.PI/numberOfSides));
     System.out.println("The area of the polygon is " + area);
   }
 }
