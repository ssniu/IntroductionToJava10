/**
 * (The Triangle class)
 * Design a class named Triangle that extends GeometricObject.
 * The class contains:
 * ■ Three double data fields named side1, side2, and side3 with default
 * values 1.0 to denote three sides of the triangle.
 * ■ A no-arg constructor that creates a default triangle.
 * ■ A constructor that creates a triangle with the specified
 * side1, side2, and side3.
 * ■ The accessor methods for all three data fields.
 * ■ A method named getArea() that returns the area of this triangle.
 * ■ A method named getPerimeter() that returns the perimeter of this triangle.
 * ■ A method named toString() that returns a string description for the triangle.
 * For the formula to compute the area of a triangle, see Programming Exercise 2.19.
 * The toString() method is implemented as follows:
 * return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
 * Draw the UML diagrams for the classes Triangle and GeometricObject and
 * implement the classes. Write a test program that prompts the user
 * to enter three sides of the triangle, a color, and a Boolean value to
 * indicate whether the triangle is filled.
 * The program should create a Triangle object with these sides and set
 * the color and filled properties using the input.
 * The program should display the area, perimeter, color,
 * and true or false to indicate whether it is filled or not.
 *
 */

 /****************************************************
  *               UML                              *
  *                Triangle                        *
  *------------------------------------------------*
  * -side1:double
  * -side2: double
  * -side3: double
  * +Triangle():side1 1.0, side2 1.0, side2 1.0
  * +Triangle(side1:double,side2:double,side3:double)
  * +getSide1():
  * +getSide2()
  * +getSide3()
  * +getArea():
  * +getPerimeter();
  * +toString()
  *
  *************************************************/

  /******************************************
   *   GeometricObject              *
   *--------------------------------*
   * -color:String
   * -filled: boolean
   * -dateCreated: java.util.Date
   * +GeometricObject()
   * +GeometricObject(color:String, filled: boolean)
   * +getColor(): String
   * +setColor(Color:String): void
   * +isFilled(): boolean
   * +setFilled(filled: boolean): void
   * +getDateCreated(): java.util.Date
   * +toString(): String
   *
   *********************************************/
   import java.util.Scanner;
   //GeometricObject class
   class GeometricObject{
     //Date fields
     private String color = "white";
     private boolean filled;
     private java.util.Date dateCreated;

   //Construct a default geometric object
      public GeometricObject() {
        dateCreated = new java.util.Date();
      }
      public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
      }
      //Getter methods and setter methods
      public String getColor(){
        return color;
      }
      public void setColor(String color){
        this.color = color;
      }

      public boolean isFilled(){
        return filled;
      }
      public void setFilled(boolean filled){
        this.filled = filled;
      }
      public java.util.Date getDateCreated(){
        return dateCreated;
      }
      //toString methods
      @Override
      public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color
          + " and filled: " + filled;
      }
    }

  class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
      side1 = 1.0;
      side2 = 1.0;
      side3 = 1.0;
    }
    //Triangle class
    public Triangle(double s1, double s2, double s3){
      //Date fields
      side1 = s1;
      side2 = s2;
      side3 = s3;
    }
    //Getter and setter methods
    public double getSide1(){
      return side1;
    }
    public double getSide2(){
      return side2;
    }
    public double getSide3(){
      return side3;
    }

    public double getArea(){
      double s = (side1 + side2 + side3) / 2;
      return Math.sqrt(s * (s - side1) * ( s - side2) * (s - side3));
    }

    public double getPerimeter(){
      return side1 + side2 + side3;
    }
    @Override
    public String toString(){
      return "Triangle: side1 = " + side1 + " side2 = " + side2
         + " side3 = " + side3;
    }
  }
  //Test class
  public class Exercise01{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      //Prompt the user to enter all sides and color and boolean value of filled
      System.out.print("Enter three sides: ");
      double side1 = input.nextDouble();
      double side2 = input.nextDouble();
      double side3 = input.nextDouble();
      System.out.print("Enter the color:");
      String color = input.next();

      System.out.print("Is the triangle filled or not (true or false):");
      boolean filled = input.nextBoolean();

      //Create an Triangle object
      Triangle tri = new Triangle(side1, side2, side3);
      tri.setColor(color);
      tri.setFilled(filled);
      //Output the results
      System.out.println(tri.toString());
      System.out.println("Area is " + tri.getArea());
      System.out.println("Perimeter is " + tri.getPerimeter());
      System.out.println("color is " + tri.getColor());
      System.out.println("Triangle is " + (tri.isFilled() ? " ":" not ") + "filled.");
    }
  }
