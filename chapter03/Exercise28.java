/**
 * (Geometry: two rectangles) Write a program that prompts the user to enter the
 * center x-, y-coordinates, width, and height of two rectangles and determines
 * whether the second rectangle is inside the first or overlaps with the first, as shown
 * in Figure 3.9.
 *
 */

 import java.util.Scanner;

 class Exercise28{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

    // Create a rectangle 1
     System.out.print("Enter r1's center x-, y-coordinates, width, and height:");
     double r1x = input.nextDouble();
     double r1y = input.nextDouble();
     double r1width = input.nextDouble();
     double r1height = input.nextDouble();

     // Create a rectangle 2
     System.out.print("Enter r2's center x-, y-coordinates, width, and height:");
     double r2x = input.nextDouble();
     double r2y = input.nextDouble();
     double r2width = input.nextDouble();
     double r2height = input.nextDouble();

     // List all conditions: overlapping, inside and outside
     if((Math.pow(Math.pow((r2y - r1y), 2), 0.5) + r2height / 2 <= r1height / 2 ) &&
        (Math.pow(Math.pow((r2x - r1x), 2), 0.5) + r2width / 2 <= r1width / 2) &&
        (r1height / 2 + r2height / 2 <= r1height) &&
        (r1width / 2 + r2width / 2 <= r1width))

        System.out.println("r2 is inside r1");

    else if((r1x + r1width / 2 > r2x - r2width) || (r1y + r1height / 2 > r2y - r2height))
       System.out.println("r2 overlaps r1");
       
    else
       System.out.println("r2 does not overlap r1");

   }
 }
