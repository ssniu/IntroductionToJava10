/**
 * (Demonstrate cancellation errors)
 * A cancellation error occurs when you are manipulating a very large number
 * with a very small number. The large number maycanceloutthesmallernumber.
 * Forexample,theresultof100000000.0 + 0.000000001 is equal to 100000000.0.
 * To avoid cancellation errors and obtain more accurate results, carefully
 * select the order of computation. For example, in computing the following series,
 * you will obtain more accurate results by comput- ing from right to
 * left rather than from left to right:
 *  1 + 1/2 + 1/3 + ... + 1/n
 * Write a program that compares the results of the summation of the
 * preceding series, computing from left to right and from right to
 * left with n = 50000.
 *
 */

 class Exercise23{
   public static void main(String[] args){
     double sum = 0.0;
     //Compute the sum of those numbers from left to right
     for(int i = 1; i <= 50000; i++){
       sum =+ 1.0 / i;
     }
     System.out.println("The sum of those numbers from left to right is: " + sum);
     //Compute the sum of those numbers from right to left
     for(int i = 50000; i > 0; i--){
       sum += 1.0 / i;
     }
     System.out.println("The sum of those numbers from right to left is: " + sum);
   }
 }
