/**
 * (Geometry: point position) Given a directed line from point
 * p0(x0, y0) to p1(x1,y1), you can use the following condition
 * to decide whether a point p2(x2, y2) is on the left of the line,
 * on the right, or on the same line (see Figure 3.11):
 * (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)
 *          >0 p2 is on the left side of the line
 *          =0 p2 is on the same line
 *          <0 p2 is on the right side of the line
 * Write a program that prompts the user to enter the three points
 * for p0, p1, and p2 and displays whether p2 is on the left of
 * the line from p0 to p1, on the right, or on the same line.
 *
 */

 import java.util.Scanner;

 class Exercise32{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     // Prompt the user to enter the coordinates of three points
     System.out.print("Enter three points for p0, p1, and p2: ");
     double xp0 = input.nextDouble();
     double yp0 = input.nextDouble();
     double xp1 = input.nextDouble();
     double yp1 = input.nextDouble();
     double xp2 = input.nextDouble();
     double yp2 = input.nextDouble();

     //Computet the result of equation
     double i = (xp1 - xp0) * (yp2 - yp0) - (xp2 - xp0) * (yp1 - yp0);

     //Three conditions to figure out the relationship between p2 and line
     if(i > 0)
        System.out.println("( " + xp2 + " , " + yp2 + ") is on the left side" +
           " of the line from ( " + xp0 + "," + yp0 + ") to (" +
           xp1 + " , " + yp1 + ")");

     else if( i == 0)
        System.out.println("( " + xp2 + " , " + yp2 + ") is on " +
        " the line from ( " + xp0 + "," + yp0 + ") to (" +
        xp1 + " , " + yp1 + ")");
        
     else
        System.out.println("( " + xp2 + " , " + yp2 + ") is on the right side" +
        " of the line from ( " + xp0 + "," + yp0 + ") to (" +
        xp1 + " , " + yp1 + ")");
   }
 }
