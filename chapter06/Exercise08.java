
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
     System.out.println("Celsius       Fahrenheit      |           Fahrenheit        Celsius");
     System.out.println("--------------------------------------------------------------");

     //Print the table content
     for(double celsius = 40.0, fahrenheit = 120.0; celsius >= 31.0; celsius--, fahrenheit -= 10){
       System.out.printf("%4.1f%15.1f", celsius, celsiusToFahrenheit(celsius));
       System.out.print("             |          ");
       System.out.printf("%5.1f%15.2f\n", fahrenheit, fahrenheitToCelsius(fahrenheit));
     }
   }
 }
