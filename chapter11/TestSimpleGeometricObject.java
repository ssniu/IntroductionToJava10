//A simple demo for super class and subclass
class SimpleGeometricObject{
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  //Default constructor
  public SimpleGeometricObject(){
    dateCreated = new java.util.Date();
  }

  public SimpleGeometricObject(String color, boolean filled){
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

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

  public String toString(){
    return "created on " + dateCreated + "\ncolor: " + color +
       " and filled: " + filled;
  }
}

class CircleSimpleGeometricObject extends SimpleGeometricObject{
  private double radius;

  public CircleSimpleGeometricObject(){

  }

  public CircleSimpleGeometricObject(double radius){
    this.radius = radius;
  }

  public CircleSimpleGeometricObject(double radius, String color, boolean filled){
    this.radius = radius;
    setColor(color);
    setFilled(filled);
  }

  public double getRadius(){
    return radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }

  public double getArea(){
    return radius * radius * Math.PI;
  }

  public double getDiameter(){
    return 2 * radius;
  }

  public double getPerimeter(){
    return 2 * radius * Math.PI;
  }

  public void printCircle(){
    System.out.println("The circle is created " + getDateCreated() +
    " and the radius is " + radius);
  }

}

class Rectangle extends SimpleGeometricObject{
  private double width;
  private double height;

  public Rectangle(){

  }
  public Rectangle(double width, double height){
    this.width = width;
    this.height = height;
  }
  public Rectangle(double width, double height, String color, boolean filled){
    this.width = width;
    this.height = height;
    setColor(color);
    setFilled(filled);
  }

  public double getWidth(){
    return width;
  }
  public void setWidth(double width){
    this.width = width;
  }

  public double getHeight(){
    return height;
  }

  public void setHeight(double height){
    this.height = height;
  }
  public double getArea(){
    return width * height;
  }
  public double getPerimeter(){
    return 2 * (width + height);
  }
}

public class TestSimpleGeometricObject{
  public static void main(String[] args){
    CircleSimpleGeometricObject circle = new CircleSimpleGeometricObject(1);
    System.out.println("A circle " + circle.toString());
    System.out.println("The color is " + circle.getColor());
    System.out.println("The radius is " + circle.getRadius());
    System.out.println("The area is " + circle.getArea());
    System.out.println("The diameter is " + circle.getDiameter());

    Rectangle rectangle = new Rectangle(2, 4);
    System.out.println("A circle " + rectangle.toString());
    System.out.println("The area is " + rectangle.getArea());
    System.out.println("The diameter is " + rectangle.getPerimeter());
  }
}
