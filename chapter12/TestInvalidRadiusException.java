class CircleWithException{
  private double radius;
  private static int numberOfObjects = 0;

  public CircleWithException() throws InvalidRadiusException{
    this(1.0);
  }

  public CircleWithException(double newRadius) throws InvalidRadiusException{
    setRadius(newRadius);
    numberOfObjects++;
  }

  public double getRadius(){
    return radius;
  }

  public void setRadius(double i) throws InvalidRadiusException{
    if(i >= 0) radius = i;
    else
       throw new InvalidRadiusException(i);
  }

  public static int getNumberOfObjects(){
    return numberOfObjects;
  }

  public double findArea(){
    return radius * radius * 3.14159;
  }

}

class InvalidRadiusException extends Exception{
  private double radius;

  public InvalidRadiusException(double radius){
    super("Invalid radius " + radius);
    this.radius = radius;
  }

  public double getRadius(){
    return radius;
  }
}

public class TestInvalidRadiusException{
  public static void main(String[] args){
    try{
      CircleWithException c1 = new CircleWithException(5);
      CircleWithException c2 = new CircleWithException(-5);
      CircleWithException c3 = new CircleWithException(0);
    }
    catch(InvalidRadiusException ex){
      System.out.println(ex);
    }
    System.out.println("Number of objects created: " +
            CircleWithException.getNumberOfObjects());
  }
}
