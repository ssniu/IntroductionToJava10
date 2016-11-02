
/**
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 * side of a hexagon and displays its area. The formula for computing the area of a
 * hexagon is
 *     Area = 3*(3^0.5)/2 * s^2
 * Where s is the length of a side.
 *
 */
 import java.util.Scanner;

 public class Exercise16{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter the side of a hexagon
     System.out.print("Enter the side: ");
     double side = input.nextDouble();
     double area;
     //Compute the area of a hexagon
     area = 3 * Math.pow(3, 0.5) / 2 * Math.pow(side, 2);
     //Output the area
     System.out.println("The area of the hexagon is " + area);
   }
 }
