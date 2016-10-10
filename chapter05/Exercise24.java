/**
 * (Sum a series) Write a program to sum the following series:
 * 1/3 + 3/5 + 5/7 + 7/9 + ... + 95/97 + 97/99
 *
 */

 class Exercise24{

   public static void main(String[] args){

     double sum = 0; // Initialize the sum to 0
     // Compute the sum of all numbers
     for(int i = 1; i <= 97; i += 2){
       sum += (double)i / ( i + 2.0);
     }
     System.out.println("The sum is " + sum);
   }
 }
