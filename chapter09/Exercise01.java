/**
 * (The Rectangle class) Following the example of the Circle class in Section 9.2,
 * design a class named Rectangle to represent a rectangle. The class contains:
 * ■ Two double data fields named width and height that specify the width and
 * height of the rectangle. The default values are 1 for both width and height.
 * ■ A no-arg constructor that creates a default rectangle.
 * ■ A constructor that creates a rectangle with the specified width and height.
 * ■ A method named getArea() that returns the area of this rectangle.
 * ■ A method named getPerimeter() that returns the perimeter.
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates two Rectangle objects—one with width 4 and height 40
 * and the other with width 3.5 and height 35.9. Display the width, height, area,
 * and perimeter of each rectangle in this order.
 *
 */

/**   UML
 *           Rectangle                     *
 *-----------------------------------------*
 * width: double                           *
 * height: double                          *
 * Rectangle()                             *
 * Rectangle(width: double, height: double)*
 * getArea(): double                       *
 * getPerimeter(): double                  *
 *******************************************/


 public class Exercise01{
   public static void main(String[] args){
     //create a rectangle with width 4 and height 40
     Rectangle rectangle1 = new Rectangle(4, 40);
     //Output the area and perimeter of this rectangle
     System.out.println("The area of the rectangle1 is " + rectangle1.getArea() + "and the perimeter is "
           + rectangle1.getPerimeter());
    //Create a rectangle with width 3.5 and height 35.9
     Rectangle rectangle2 = new Rectangle(3.5, 35.9);
     // Output the area and perimeter
     System.out.println("The area of rectangle2 is " + rectangle2.getArea() + " perimeter is " +
           rectangle2.getPerimeter());
   }
 }
// Rectangle class
 class Rectangle{
   double width ;//Width of rectangle
   double height;// Height of rectangle
   // No-arg constructor that create a default rectangle, the default values for twm variables
   Rectangle(){
      width = 1;
      height = 1;
   }
  // The constructor that creates a rectangle with specified width and height
   Rectangle(double width, double height){
     this.width = width;
     this.height = height;
   }
   // Return the area of this rectangle
   double getArea(){
     return width * height;
   }
   // Return the perimeter of this rectangle
   double getPerimeter(){
     return 2 * width * height;
   }
 }
