
/**
 * (Conversions between feet and meters) Write a class that contains the following
 * two methods:
 * Convert from feet to meters
 *      public static double footToMeter(double foot)
 * Convert from meters to feet
 *      public static double meterToFoot(double meter)
 * The formula for the conversion is:
 *      meter = 0.305 * foot
 *      foot = 3.279 * meter
 *
 */

 class Exercise09{
   public static double footToMeter(double foot){
     return 0.305 * foot;
   }

   public static double meterToFoot(double meter){
     return 3.279 * meter;
   }

   public static void main(String[] args){
     //The table header
     System.out.println("Feet         Meters        |       Meters          Feet");
     System.out.println("-------------------------------------------------------");

     for(double foot = 1.0, meters = 20.0; foot <= 10.0; foot++, meters += 5){
       System.out.printf("%-4.1f", foot);
       //Invoke footToMeter methods
       System.out.printf("%12.3f", footToMeter(foot));
       System.out.print("        |          ");
       System.out.printf("%4.1f", meters);
       //Invoke meterToFoot method
       System.out.printf("%12.3f\n", meterToFoot(meters));
     }
   }
 }
