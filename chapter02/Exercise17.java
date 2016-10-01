
/**
 * (Science: wind-chill temperature) How cold is it outside? The temperature alone
 * is not enough to provide the answer. Other factors including wind speed, relative
 * humidity, and sunshine play important roles in determining coldness outside.
 * In 2001, the National Weather Service (NWS) implemented the new wind-chill
 * temperature to measure the coldness using temperature and wind speed. The
 * formula is
 * twc = 35.74 + 0.6215ta - 35.75v^0.16 + 0.4275tav^0.16
 * where ta is the outside temperature measured in degrees Fahrenheit and v is the
 * speed measured in miles per hour. twc is the wind-chill temperature. The formula
 * cannot be used for wind speeds below 2 mph or temperatures below -58 ºF or
 * above 41ºF.
 * Write a program that prompts the user to enter a temperature between -58 ºF and
 * 41ºF and a wind speed greater than or equal to 2 and displays the wind-chill temperature.
 * Use Math.pow(a, b) to compute v^0.16.
 *
 */

 import java.util.Scanner;

 public class Exercise17{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter the temperature in Fahrenheit between -58F and 41F:");
     double tempe = input.nextDouble();

     System.out.print("Enter the wind speed (>=2) in miles per hour:");
     double windSpeed = input.nextDouble();

     double index;
     index = 35.74 + 0.6215 * tempe - 35.74 * Math.pow(windSpeed, 0.16) + 0.4275 * tempe
* Math.pow(windSpeed, 0.16);

     System.out.println("The wind chill index is " + index);
   }
 }
