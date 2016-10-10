
/**
 * (Sum series) Write a method to compute the following series:
 * m(i) = 1 / 2 + 2 / 3 + ... + i / ( i + 1)
 * Write a test program that displays the following table:
 *      i             m(i)
 *     ---------------------
 *      1             0.5000
 *      2             1.1667
 *      ...
 *      19           16.4023
 *      20           17.3546
 *
 */

 class Exercise13{
   // Method for return sum value
   public static double sumSeries(int i){
       double sum = 0;// Initialize sum to 0
       // Compute the sum from 1 to i
       for(int j = 1; j <= i; j++){
           sum += j / ( j + 1.0);
    }
    return sum;// Return sum value
  }

 public static void main(String[] args){
   // Print the table header
   System.out.println("i          m(i)");
   System.out.println("---------------");
   // Print the table content
   for(int i = 0; i <= 20; i++)
      System.out.printf("%2d%11.4f\n", i, sumSeries(i));
 }
}
