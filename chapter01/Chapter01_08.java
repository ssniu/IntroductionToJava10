
/**
 * (Area and perimeter of a circle) Write a program that displays the area and perimeter of
 * of a circle that has a radius of 5.5 using the following formula:
 * perimeter = 2 * radius * pi
 * area = radius * radius * pi
 *
 */

public class Chapter01_08{
   public static void main(String[] args){

    // Define the radius, pi, perimeter and area
    double radius = 5.5;
    double perimeter, area;
    double pi = 3.14159;
    //compute the perimeter and area of a circle
    perimeter = 2 * radius * pi;
    area = radius * radius * pi;
    //Output the perimeter and area
    System.out.println("The perimeter is : " +
          perimeter + " and the area is : " + area);
   }
}
