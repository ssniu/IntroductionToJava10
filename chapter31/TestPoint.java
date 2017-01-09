class Point{
  private double x;
  private double y;

  public Point(){
    x = 1.0;
    y = 1.0;
  }
  Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  public void setX(double x1){
     x = x1;
  }

  public void setY(double y1){
    y = y1;
  }

  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

}

public class TestPoint{
  public static void main(String[] args){
    Point p1 = new Point();
    Point p2 = new Point(25.0, 36.0);

    System.out.print("first point" + p1.getX() + p1.getY());
    System.out.println("Second point" + p2.getX() + p2.getY());
  }
}
