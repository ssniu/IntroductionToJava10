
/**
 * (Geometry: area of a hexagon) The area of a hexagon can be computed using the
 * following formula (s is the length of a side):
 * Area = (6 * s2) / (4 * tan(pi/6))
 * Write a program that prompts the user to enter the side of a hexagon and displays
 * its area.
 *
 */

 import java.util.Scanner;

 class Exercise04{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter the side
     System.out.print("Enter the side:");
     double s = input.nextDouble();
     //Computet the area
     double area;
     area = (6 * s * s) / ( 4 * Math.tan(Math.PI/6));

     System.out.println("The area of the hexagon is " + area);

   }
 }
