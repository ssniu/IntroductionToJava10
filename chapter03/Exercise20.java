
/**
 * (Science: wind-chill temperature)
 * Programming Exercise 2.17 gives a formula
 * to compute the wind-chill temperature. The formula is valid for temperatures in
 * the range between −58ºF and 41ºF and wind speed greater than or equal to 2.
 * Write a program that prompts the user to enter a temperature and a wind speed.
 * The program displays the wind-chill temperature if the input is valid; otherwise,
 * it displays a message indicating whether the temperature and/or wind speed is invalid.
 *
 */

 import java.util.Scanner;

 public class Exercise20{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     //Prompt the user to enter temperature and wind speed
     System.out.print("Enter the temperature: ");
     double temperature = input.nextDouble();

     System.out.print("Enter the wind speed: ");
     double windSpeed = input.nextDouble();

     double index = 0;
     //Set the valid input conditions
     if (temperature > 41 || temperature < -58 || windSpeed < 2)
        System.out.println("Invalid input");
     else {
     index = 35.74 + 0.6215 * temperature - 35.74 * Math.pow(windSpeed, 0.16) +
            0.4275 * temperature * Math.pow(windSpeed, 0.16);

    System.out.println("The wind-chill temperature is " + index);
      }
   }
 }
