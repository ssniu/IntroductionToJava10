
/**
 * (Conversions between Celsius and Fahrenheit) Write a class that contains the following
 * two methods:
 *  Convert from Celsius to Fahrenheit
 * public static double celsiusToFahrenheit(double celsius)
 *  Convert from Fahrenheit to Celsius
 * public static double fahrenheitToCelsius(double fahrenheit)
 * The formula for the conversion is:
 * fahrenheit = (9.0 / 5) * celsius + 32
 * celsius = (5.0 / 9) * (fahrenheit – 32)
 *
 */

 class Exercise08{
   // Method converts celsius to fahrenheit
   public static double celsiusToFahrenheit(double celsius){
       return  (9.0 / 5) * celsius + 32;
   }
   //Method converts fahrenheit to celsius
   public static double fahrenheitToCelsius(double fahrenheit){
       return (5.0 / 9) * (fahrenheit - 32);
   }

   public static void main(String[] args){
     // Print the table header
     System.out.printf("%-10s%15s%6s%15s%15s","Celsius","Fahrenheit", "|","Fahrenheit","Celsius");
     System.out.println("\n--------------------------------------------------------------");

     //Print the table content
     for(double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit -= 10){
       System.out.printf("\n%-15.1f%-10.1f%6s", celsius, celsiusToFahrenheit(celsius),"|");
       System.out.printf("%6s%-5.1f%17.2f\n", " ",fahrenheit, fahrenheitToCelsius(fahrenheit));
     }
   }
 }
