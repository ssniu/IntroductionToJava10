
/**
 * (Geometry: area of a triangle) Write a program that prompts the user to enter
 * three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 * The formula for computing the area of a triangle is
 *           s = (side1 + side2 + side3)/2;
 *       area = (s(s - side1)(s - side2)(s - side3))^0.5
 *
 */
 import java.util.Scanner;

 public class Exercise19{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter three points for a triangle:");
     double x1 = input.nextDouble();
     double y1 = input.nextDouble();
     double x2 = input.nextDouble();
     double y2 = input.nextDouble();
     double x3 = input.nextDouble();
     double y3 = input.nextDouble();

     double s1 = Math.pow((x2 - x1), 2);
     double s2 = Math.pow((y2 - y1), 2);
     double s3 = Math.pow((x3 - x1), 2);
     double s4 = Math.pow((y3 - y1), 2);
     double s5 = Math.pow((x3 - x2), 2);
     double s6 = Math.pow((y3 - y2), 2);

     double side1 = Math.pow((s1 + s2), 0.5);
     double side2 = Math.pow((s3 + s4), 0.5);
     double side3 = Math.pow((s5 + s6), 0.5);

     double s = (side1 + side2 + side3) / 2;
     double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);

     System.out.println("The area of the triangle is " + area);

   }
 }
