public class House implements Cloneable, Comparable<House>{
  private int id;
  private double area;
  private java.util.Date whenBuilt;

  public House(int id, double area){
    this.id = id;
    this.area = area;
    whenBuilt = new java.util.Date();
  }

  public int getId(){
    return id;
  }
  public double getArea() {
    return area;
  }

  public java.util.Date getWhenBuilt() {
    return whenBuilt;
  }

  @Override
  public Object clone() throws CloneNotSupportedException{
    return super.clone();
  }

  @Override
  public int compareTo(House o){
    if (area > o.area)
    return 1;
    else if (area < o.area)
    return -1;
    else
    return 0;
  }
}

/* deep copy
public Object clone() throws CloneNotSupportedException {
// Perform a shallow copy
House houseClone = (House)super.clone();
// Deep copy on whenBuilt
houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone());
return houseClone;
}
or
public Object clone() {
try {
// Perform a shallow copy
House houseClone = (House)super.clone();
// Deep copy on whenBuilt
houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone());
return houseClone;
}
catch (CloneNotSupportedException ex) {
return null;
}
*/
