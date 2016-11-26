/**
 * (The Fan class) Design a class named Fan to represent a fan. The class contains:
 * ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
 * denote the fan speed.
 * ■ A private int data field named speed that specifies the speed of the fan (the
 * default is SLOW).
 * ■ A private boolean data field named on that specifies whether the fan is on (the
 * default is false).
 * ■ A private double data field named radius that specifies the radius of the fan
 * (the default is 5).
 * ■ A string data field named color that specifies the color of the fan (the default
 * is blue).
 * ■ The accessor and mutator methods for all four data fields.
 * ■ A no-arg constructor that creates a default fan.
 * ■ A method named toString() that returns a string description for the fan. If
 * the fan is on, the method returns the fan speed, color, and radius in one combined
 * string. If the fan is not on, the method returns the fan color and radius
 * along with the string “fan is off” in one combined string.
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that creates two Fan objects. Assign maximum speed, radius 10, color
 * yellow, and turn it on to the first object. Assign medium speed, radius 5, color
 * blue, and turn it off to the second object. Display the objects by invoking their
 * toString method.
 *
 */

 /********************************************
  *           UML                            *
  *                Fan                       *
  *------------------------------------------*
  *+SLOW: int                                *
  *+MEDIUM: int                              *
  *+FAST: int                                *
  *-speed: int                               *
  *-on: boolean                              *
  *-radius: double                           *
  *+color: String                            *
  *+Fan()                                    *
  *+setSpeed(int)                            *
  *+setOn()                                  *
  *+setRadius(double)                        *
  *+setColor(String)                         *
  *+getRadius():double                       *
  *+getSpeed(): double                       *
  *+getOn(): boolean                         *
  *+getColor(): String                       *
  *+toString(): String                       *
  ********************************************/

  class Fan{
    // Data fields
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    String color;
    // No-arg constructor that creates a default fan
    Fan(){
      speed = SLOW;
      on = false;
      radius = 5;
      color = "blue";
    }

    //Mutators
    public void setSpeed(int newSpeed){
      speed = newSpeed;
    }
    public void setOn(){
      on = true;
    }
    public void setOff(){// For false value
      on = false;
    }
    public void setColor(String newColor){
      color = newColor;
    }
    public void setRadius(double newRadius){
      radius = newRadius;
    }

   //Accessors
   public String getSpeed(){
     String s = "";
     switch(speed){
       case SLOW: s = "SLOW"; break;
       case MEDIUM: s = "MEDIUM"; break;
       case FAST: s = "FAST"; break;
     }
     return s;
   }

   public boolean getOn(){
     return on;
   }

   public double getRadius(){
     return radius;
   }
   public String getColor(){
     return color;
   }

   public String toString(){
     if(on == true){
       return (" Fan speed:" + getSpeed() + " color: " + color + " radius: "+ radius);
     }
     else
       return ("Fan color is: " + color + " radius: " + radius + " fan is off");
     }
   }

  public class Exercise08{
    public static void main(String[] args){
      // Declares the data
      //final int SLOW = 1;
      //final int MEDIUM = 2;
      //final int FAST = 3;
      // Create two objects
      Fan fan1 = new Fan();
      Fan fan2 = new Fan();
      //Assigning values to first object
      fan1.setSpeed(fan1.FAST);
      fan1.setRadius(10);
      fan1.setColor("yellow");
      fan1.setOn();
      // Output the result of toString method
      System.out.println(fan1.toString());
      // Assigning values to second object
      fan2.setSpeed(fan2.MEDIUM);
      fan2.setRadius(5);
      fan2.setColor("blue");
      fan2.setOff();
      // Output the result of toString method
      System.out.println(fan2.toString());
    }
  }
