
/**
 * (Estimate p) p can be computed using the following series:
 * m(i) = 4(1 - 1/3 + 1/5 - 1/7 +... +(-1)^(i+1)/(2i-1)
 * Write a method that returns m(i) for a given i and write a test program that displays
 * the following table:
 * i          m(i)
 * ----------------
 * 1          4.0000
 * 101        3.1515
 * ...
 * 901        3.1427
 *
 */

 class Exercise14{

   //Method to compute the sum
   public static double m(int i){
     double result = 0;
     // Compute the sum value
       for(int j = 1; j <= i; j++){
         result += 4.0 * (Math.pow((-1), (j + 1)) / ( 2 * j - 1.0));
       }
     return result;// Return result value
   }

   public static void main(String[] args){
     // Print the header
     System.out.printf("%-10s%10s","i","m(i)");
     System.out.println("\n-------------------------");
     // Print the first line
     System.out.printf("%-10d%12.4f\n", 1, m(1));
     // Print the content of table
     for(int i = 101; i <= 901; i += 100){
       System.out.printf("%-10d%12.4f\n", i, m(i));
     }
   }
 }
