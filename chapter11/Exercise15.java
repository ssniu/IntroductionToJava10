/**
 * (Area of a convex polygon) A polygon is convex if it contains any line segments
 * that connects two points of the polygon. Write a program that prompts the user to
 * enter the number of points in a convex polygon, then enter the points clockwise,
 * and display the area of the polygon.
 *
 */

 import java.util.*;

 public class Exercise15{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter the number of the pointers:");
     int n = input.nextInt();

     System.out.println("Enter the coordinates of the points:");
     ArrayList<Double> list1 = new ArrayList<>();
     ArrayList<Double> list2 = new ArrayList<>();
     //Enter the coordinates of points
     for(int i = 0; i < n; i++){
       list1.add(input.nextDouble());

       list2.add(input.nextDouble());
     }
     //Output the coordinates of the points
     for(int i = 0; i < n; i++){
      System.out.print(list1.get(i) + "  " + list2.get(i));
   }

   System.out.println("The total area is " + area(list1, list2));
 }
//Compute the area of polygon
 public static double area(ArrayList<Double> list1, ArrayList<Double> list2){
   double totalArea = 0;
   for(int i = 0; i < list1.size() - 1; i++){
     totalArea += (list1.get(i) * list2.get(i+1) - list2.get(i) * list1.get(i+1)) / 2;
   }
   totalArea += (list1.get(list1.size() - 1) * list2.get(0) - list2.get(list2.size() - 1) * list1.get(0)) / 2;
   return totalArea;
 }
 }
