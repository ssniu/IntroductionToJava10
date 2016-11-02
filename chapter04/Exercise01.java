
/**
 * (Geometry: area of a pentagon)
 * Write a program that prompts the user to enter
 * the length from the center of a pentagon to a vertex and computes the area of the
 * pentagon, as shown in the following figure.The formula for computing the area of a pentagon is
 *           Area = 5 * s^2 / 4 * tan(pi / 5)
 * where s is the length of a side. The side can be computed using the formula s = 2r sin
 * pi/5, where r is the length from the center of a pentagon to a vertex. Round up two digits
 * after the decimal point.
 *
 */

 import java.util.Scanner;

 public class Exercise01{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     //Prompt the user to enter the length from the center to a vertex
     System.out.print("Enter the length from the center to a vertex: ");
     double r = input.nextDouble();
     //Compute the area
     double s = 2 * r * Math.sin(Math.PI / 5);
     double area = 5 * s * s / ( 4 * Math.tan(Math.PI / 5));

     System.out.println("The area of the pentagon is " + area);
   }
 }
