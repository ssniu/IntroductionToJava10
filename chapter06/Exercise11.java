
/**
 * (Financial application: compute commissions) Write a method that computes the
 * commission, using the scheme in Programming Exercise 5.39. The header of the
 * method is as follows:
 *     public static double computeCommission(double salesAmount)
 * Write a test program that displays the following table:
 *      Sales Amount          Commission
 *   --------------------------------------
 *      10000                   900.0
 *      15000                  1500.0
 *       ...
 *      95000                 11100.0
 *      100000                11700.0
 *
 */

 class Exercise11{
   // Method to compute the commission
   public static double computeCommission(double salesAmount){
     // Compute three conditions
     if(salesAmount <= 5000)
         return salesAmount * 0.08;
     else if(salesAmount <= 10000)
         return (5000 * 0.08 + (salesAmount - 5000) * 0.10);
     else
        return (5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12);
   }

   public static void main(String[] args){
     //Print the table header
     System.out.println("salesAmount        Commmission");
     System.out.println("------------------------------");
     // Print the table content
     for(double i = 10000; i <= 100000; i += 5000){
       System.out.printf("%8.0f%17.1f\n", i, computeCommission(i));
     }
   }
 }
