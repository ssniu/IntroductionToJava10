/**
 * (Perfect number)
 * A positive integer is called a perfect number if it is equal to
 * the sum of all of its positive divisors, excluding itself.
 * For example, 6 is the first perfect number because 6 = 3 + 2 + 1.
 * The next is 28 = 14 + 7 + 4 + 2 + 1.
 * There are four perfect numbers less than 10,000.
 * Write a program to find all these four numbers.
 *
 */

 class Exercise33{
   public static void main(String[] args){

     System.out.print("The four perfect numbers less than 10000: ");
     //Increment the number by 1 to 10000
     for(int i = 1; i <= 10000; i++){
       // Set the summation of positive divisors to 0
       int total = 0;
       //Find all positive divisors
       for(int j = 1; j < i ; j++){
         if(i % j == 0)
            total += j;
       }
       // Find the perfect number if it equals the summation of its positive divisors
       if(i == total)
         System.out.print(i + " ");
     }
   }
 }
