/**
 * (Computing gcd) Write a method that returns the gcd of an
 * unspecified number of integers.
 * The method header is specified as follows:
 *       public static int gcd(int... numbers)
 *  Write a test program that prompts the user to enter five numbers,
 *  invokes the method to find the gcd of these numbers, and displays the gcd.
 *
 */

 import java.util.Scanner;

 class Exercise14{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter 5 numbers: ");
     int[] nums = new int[5];
     for(int i = 0; i < 5; i++)
        nums[i] = input.nextInt();

     System.out.println("The result is " + gcd(nums));
   }

   public static int gcd(int... numbers){
     int gcd = 1;

     for(int i = 2; i < minimun(numbers); i++){
       boolean isDivisor = true;
       for(int e: numbers){
         if(e % i != 0)
            isDivisor = false;
       }
       if(isDivisor)
         gcd = i;
     }
     return gcd;
   }

   public static int minimun(int... numbers){
     int min = numbers[0];
     for(int e: numbers){
       if(e < min)
         min = e;
     }
     return min;
   }
 }
