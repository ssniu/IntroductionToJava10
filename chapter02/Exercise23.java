
/**
 * (Cost of driving) Write a program that prompts the user
 * to enter the distance to
 * drive, the fuel efficiency of the car in miles per gallon,
 * and the price per gallon, and displays the cost of the trip.
 *
 */

 import java.util.Scanner;

 public class Exercise23{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter the driving distance: ");
     double distance = input.nextDouble();

     System.out.print("Enter miles per gallon: ");
     double milesPerGal = input.nextDouble();

     System.out.print("Enter price per gallon: ");
     double pricePerGal = input.nextDouble();

     double price;
     price = distance / milesPerGal * pricePerGal;

     System.out.println("The cost of driving is $ " + price);
   }
 }
