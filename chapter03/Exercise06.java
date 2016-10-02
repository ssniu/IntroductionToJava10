
/**
 * (Health application: BMI)
 * Revise Listing 3.4, ComputeAndInterpretBMI.java, to
 * let the user enter weight, feet, and inches.
 * For example, if a person is 5 feet and 10 inches,
 * you will enter 5 for feet and 10 for inches.
 *
 */

import java.util.Scanner;

public class Exercise06{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    // Ask users to input the weight, feet and inches
    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();

    System.out.print("Enter feet: ");
    double feet = input.nextDouble();

    System.out.print("Enter inches: ");
    double inches = input.nextDouble();

    // Convert feet and inches to meters, convert pounds to kilograms
    // Declare Constants
    final double KG_PER_POUND = 0.454;
    final double METERS_PER_INCE = 0.0254;
    final double METERS_PER_FOOT = 0.3048;

    //Compute the BMI
    weight *= KG_PER_POUND;
    feet *= METERS_PER_FOOT;
    inches *= METERS_PER_INCE;

    double height = feet + inches;
    double bmi = weight / (height * height);
    System.out.println("BMI is " + bmi);
    if (bmi < 18.5)
       System.out.println("underweight");
    else if (bmi < 25)
       System.out.println("Normal");
    else if (bmi < 30)
       System.out.println("Overweight");
    else
       System.out.println("Obese");
  }
}
