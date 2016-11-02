
/**
 * (Compute the volume of a cylinder) Write a program that reads
 * in the radius and length of a cylinder and computes the area and
 * volume using the following formulas:
 *        area = radius * radius * p volume = area * length
 *
 */

import java.util.Scanner;

public class Exercise02{
  public static void main(String[] args){

   Scanner input = new Scanner(System.in);
   //Prompt the user to enter the radius and length of a cylinder
   System.out.print("Enter the radius and length of a cylinder: ");
   double radius = input.nextDouble();
   double length = input.nextDouble();
  //Compute the area and volume
   double area, volume;
   area = radius * radius * 3.1415;
   volume = area * length;
   //Output the area and volume
   System.out.println("The area is " + area);
   System.out.println("The volume is " + volume);
  }
}
