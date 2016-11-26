/**
 * (The MyPoint class)
 * Design a class named MyPoint to represent a point with
 * x- and y-coordinates. The class contains:
 * ■ The data fields x and y that represent the coordinates with getter
 * methods.
 * ■ A no-arg constructor that creates a point (0, 0).
 * ■ A constructor that constructs a point with specified coordinates.
 * ■ A method named distance that returns the distance from this point to a
 * specified point of the MyPoint type.
 * ■ A method named distance that returns the distance from this point to
 * another point with specified x- and y-coordinates.
 * Draw the UML diagram for the class and then implement the class.
 * Write a test program that creates the two points (0, 0) and (10, 30.5)
 * and displays the distance between them.
 *
 */

 /*****************************
  *           UML             *
  *       MyPoint             *
  *---------------------------*
  * -x: double
  * -y: double
  * +Point(0,0)
  * +Point(x:double, y:double)
  * +getX():double
  * +getY():double
  * +distance(): double
  *
  *******************************/

  class MyPoint{
    private double x;
    private double y;
    //Constructor for (0,0)
    public MyPoint(){
      this(0, 0);
    }
    public MyPoint(double x, double y){
      this.x = x;
      this.y = y;
    }
    //Getter methods 
    public double getX(){
      return x;
    }
    public double getY(){
      return y;
    }
    //The distance from one point to a MyPoint object
    public double distance(MyPoint p){
      return Math.sqrt((x - p.getX()) * (x - p.getX()) +
            (y - p.getY()) * (y - p.getY()));
    }
    //The distance from one point to another point
    public double distance(double x, double y){
      return distance(new MyPoint(x,y));
    }
  }

  public class Exercise04{
    public static void main(String[] args){
      //Use the first Constructor for (0,0)
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
    System.out.println("The distance between ("
        			+ p1.getX() + ", " + p1.getY() + ") and ("
        			+ p2.getX() + ", " + p2.getY() + ") is: " +
        			p1.distance(p2));
    }
  }
