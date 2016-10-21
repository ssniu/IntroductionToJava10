/**
 * (Summation) Write a program to compute the following summation.
 *  1/(1 + 2^0.5) + 1 / (2^0.5 + 3^0.5) + ... + 1/(624^0.5 + 625^0.5)
 *
 */

 class Exercise35{
   public static void main(String[] args){
     double total = 0;//Initialize the sum is 0
     //compute the sum of 624
     for(int i = 1; i < 624; i++){
       total += 1 / (Math.pow(i,0.5) + Math.pow((i + 1), 0.5));
     }
     System.out.println("The result is " + total);
   }
 }
