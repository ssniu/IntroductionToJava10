/**
 * (Corner point coordinates) Suppose a pentagon is
 * centered at (0, 0) with one point
 * at the 0 o’clock position, as shown in Figure 4.7c.
 * Write a program that prompts
 * the user to enter the radius of the bounding circle of
 * a pentagon and displays the
 * coordinates of the five corner points on the pentagon.
 *
 */

 import java.util.Scanner;

 class Exercise07{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter radius
     System.out.print("Enter the radius of the bounding circle: ");
     double radius = input.nextDouble();

     double a1 = Math.PI / 10;
     double a2 = Math.PI / 2;
     double a3 = Math.PI / 2 + 2 * Math.PI / 5;
     double a4 = Math.PI / 2 + 4 * Math.PI / 5;
     double a5 = Math.PI / 2 + 6 * Math.PI / 5;
     //Get this formula from a website, the formula is confusion
     double x1 = radius * Math.cos(a1);
     double y1 = radius * Math.sin(a1);
     double x2 = radius * Math.cos(a2);
     double y2 = radius * Math.sin(a2);
     double x3 = radius * Math.cos(a3);
     double y3 = radius * Math.sin(a3);
     double x4 = radius * Math.cos(a4);
     double y4 = radius * Math.sin(a4);
     double x5 = radius * Math.cos(a5);
     double y5 = radius * Math.sin(a5);
     //Output the points coordinates
     System.out.printf("(%10.4f, %10.4f)\n",x1, y1);
     System.out.printf("(%10.4f, %10.4f)\n",x2, y2);
     System.out.printf("(%10.4f, %10.4f)\n",x3, y3);
     System.out.printf("(%10.4f, %10.4f)\n",x4, y4);
     System.out.printf("(%10.4f, %10.4f)\n",x5, y5);

   }
 }
