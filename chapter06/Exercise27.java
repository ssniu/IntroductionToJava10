/**
 * (Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
 * whose reversal is also a prime. For example, 17 is a prime and 71 is a prime,
 * so 17 and 71 are emirps. Write a program that displays the first 100 emirps.
 * Display 10 numbers per line, separated by exactly one space, as follows:
 * 13 17 31 37 71 73 79 97 107 113
 * 149 157 167 179 199 311 337 347 359 389
 *
 */

 class Exercise27{
   public static boolean isPrime(int n){
     for(int i = 2; i < n / 2; i++){
       if( n % i == 0)
         return false;
     }
     return true;
   }

   public static int reverse(int n){
     String s = "";
     s = n + "";
     String reverse = "";
     for(int i = s.length() - 1; i >= 0; i--){
       reverse += s.charAt(i);

     }
     return Integer.parseInt(reverse);
   }

   public static boolean isPalindromic(int n){
     return (n != reverse(n)) ? true : false;
   }

   public static void main(String[] args){
     final int NUMBER_PER_LINE = 10;
     final int TOTAL_NUMBER = 100;

     int count = 0;
     int n = 10;

     while(count < TOTAL_NUMBER){
       if(isPrime(n) && isPrime(reverse(n)) && isPalindromic(n)){
         count++;
         System.out.print((count % NUMBER_PER_LINE == 0) ? n + " " + "\n" : n + " ");
       }
       n++;
     }
   }
 }
