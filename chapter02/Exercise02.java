
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
   
   System.out.print("Enter the radius and length of a cylinder: ");
   double radius = input.nextDouble();
   double length = input.nextDouble();
  
   double area, volume;
   area = radius * radius * 3.1415;
   volume = area * length;
   
   System.out.println("The area is " + area);
   System.out.println("The volume is " + volume);
  }
}

