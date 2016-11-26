
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
     System.out.printf("%-10s%10s%8s%12s%13s","Feet","Meters","|","Meters","Feet");
     System.out.println("\n-------------------------------------------------------");
     //Print the result table
     for(double foot = 1.0, meters = 20.0; foot <= 10.0; foot++, meters += 5){
       //Invoke footToMeter methods
       System.out.printf("\n%-15.1f%-7.3f%6s", foot,footToMeter(foot), "|");
       System.out.printf("%6s%-5.1f%16.3f\n", " ",meters,meterToFoot(meters));
     }
   }
 }
