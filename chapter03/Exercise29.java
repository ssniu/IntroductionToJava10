/**
 * (Geometry: two circles) Write a program that prompts the user to enter the center
 * coordinates and radii of two circles and determines whether the second circle is
 * inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2 is
 * inside circle1 if the distance between the two centers 6 = |r1 - r2| and circle2
 * overlaps circle1 if the distance between the two centers <= r1 + r2. Test your
 * program to cover all cases.)
 *
 */

 import java.util.Scanner;

 class Exercise29{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     // Input the values of circle1
     System.out.print("Enter circle1's center x-, y-coordinates, and radius:");
     double x1 = input.nextDouble();
     double y1 = input.nextDouble();
     double r1 = input.nextDouble();

    //Input the values of circle2
     System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
     double x2 = input.nextDouble();
     double y2 = input.nextDouble();
     double r2 = input.nextDouble();

     // Compare the circle1 and circle2 to find out the positions of two circles
     if(Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= Math.abs(r1 - r2))
        System.out.println("circle2 is inside circle1");

     else if(Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5) <= r1 + r2)
        System.out.println("circle2 overlaps circle1");
        
     else
        System.out.println("circle2 does not overlap circle1");
   }
 }
