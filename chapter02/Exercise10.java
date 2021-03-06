
/**
 * (Science: calculating energy)
 * Write a program that calculates the energy needed to heat water
 * from an initial temperature to a final temperature.
 * Your program should prompt the user to enter the amount of water in kilograms
 * and the initial and final temperatures of the water.
 * The formula to compute the energy is
 *     Q = M * (finalTemperature – initialTemperature) * 4184
 * where M is the weight of water in kilograms,
 * temperatures are in degrees Celsius, and energy Q is measured in joules.
 *
 */

 import java.util.Scanner;

 public class Exercise10{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter the amout water
     System.out.print("Enter the amount of water in kilograms: ");
     double water = input.nextDouble();
     //Prompt the user to enter the initial temperature
     System.out.print("Enter the initial temperature: ");
     double initialT = input.nextDouble();
    //Prompt the user to enter the final temperature
     System.out.print("Enter the final temperature: ");
     double finalT = input.nextDouble();
     //Compute the energy
     double energy = water * (finalT - initialT) * 4184;
     //Output the energy value
     System.out.println("The energy needed is " + energy);
   }
 }
