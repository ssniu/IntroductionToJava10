
/**
 * (The BMI class)
 * Add the following new constructor in the BMI class:
 * Construct a BMI with the specified name, age, weight,
 * feet, and inches
 *
 * public BMI(String name, int age, double weight, double feet,
 * double inches)
 *
 */

 class BMI {
   //Data fields
   private String name;
   private int age;
   private double weight; // in pounds
   private double height; // in inches
   private double inches;
   private double feet;
   public static final double KILOGRAMS_PER_POUND = 0.45359237;
   public static final double METERS_PER_INCH = 0.0254;
   public static final double METERS_PER_FEET = 0.3084;

   //constructors
   public BMI(String name, int age, double weight, double height) {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
    }

  public BMI(String name, int age, double weight, double feet, double inches){
      this(name, age, weight, 0);
      this.feet = feet;
      this.inches = inches;
  }

  public BMI(String name, double weight, double height){
    this(name, 20, weight, height);
  }
  //getBMI method
  public double getBMI(){
    double bmi = 0;
    if(height > 0){
    bmi = weight * KILOGRAMS_PER_POUND /
      ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
      return Math.round(bmi * 100) / 100.0;
   }
    else {
      bmi = weight * KILOGRAMS_PER_POUND /
        ((inches * METERS_PER_INCH + feet * METERS_PER_FEET) *
            (inches * METERS_PER_INCH + feet * METERS_PER_FEET));
        return Math.round(bmi * 100) / 100.0;
    }
  }

  public String getStatus(){
    double bmi = getBMI();
    if(bmi < 18.5) return "Underweight";
    else if(bmi < 25) return "Normal";
    else if(bmi < 30) return "Overweight";
    else return "Obese";
  }
  //Getter methods
  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public double getWeight(){
    return weight;
  }

  public double getHeight(){
    return height;
  }

  public double getInches(){
    return inches;
  }

  public double getFeet(){
    return feet;
  }
}

public class Exercise02{
  public static void main(String[] args){
    BMI bmi1 = new BMI("Kim", 18, 145, 70);
    BMI bmi2 = new BMI("Joo", 25, 140, 5, 5);

    System.out.println(bmi1.getName() + bmi1.getBMI() + bmi1.getStatus());
    System.out.println(bmi2.getName() + bmi2.getBMI() + bmi2.getStatus());
  }
}
