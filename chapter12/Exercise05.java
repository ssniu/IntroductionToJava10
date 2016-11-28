/**
 * (IllegalTriangleException)
 * Programming Exercise 11.1 defined the Triangle class with three sides.
 * In a triangle, the sum of any two sides is greater than the other side.
 * The Triangle class must adhere to this rule.
 * Create the IllegalTriangleException class, and modify the constructor
 * of the Triangle class to throw an IllegalTriangleException object if a
 * triangle is created with sides that violate the rule, as follows:
 * /** Construct a triangle with the specified sides */
/*    public Triangle(double side1, double side2, double side3)
 *        throws IllegalTriangleException {// Implement it }
 *
 */

import java.util.*;

//IllegalTriangleException
 class IllegalTriangleException extends Exception{
    private double s1;
    private double s2;
    private double s3;
    private boolean isvalid;

    public IllegalTriangleException(double s1, double s2, double s3){
      super("Invalid triangle: " + s1 + " " + s2 + " " + s2);
      this.s1 = s1;
      this.s2 = s2;
      this.s3 = s3;
    }
    //Setter methods
    public double getS1(){
      return s1;
    }
    public double getS2(){
      return s2;
    }
    public double getS3(){
      return s3;
    }

 }

public class Exercise05{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;
    do{
      //Prompt the user to enter 3 sides
      System.out.println("Enter 3 sides: ");
      double s1 = input.nextDouble();
      double s2 = input.nextDouble();
      double s3 = input.nextDouble();
      //Exception
      try{
        Triangle tri = new Triangle(s1, s2, s3);
        System.out.println("The area is " + tri.getArea());
        continueInput = false;
      }
      catch(IllegalTriangleException ex){
        System.out.println(ex.getMessage());
      }
    }while(continueInput);
  }
}
