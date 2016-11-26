/*
 * (Twin primes)
 * Twin primes are a pair of prime numbers that differ by 2.
 * For example, 3 and 5 are twin primes, 5 and 7 are twin primes,
 * and 11 and 13 are twin primes.
 * Write a program to find all twin primes less than 1,000.
 * Display the output as follows:
 * (3, 5)
 * (5, 7)
 * ...
 *
 */

 public class Exercise29{
   //isPrime method
   public static boolean isPrime(int n){
     for(int divisor = 2; divisor <= n / 2; divisor++){
       if(n % divisor == 0) return false;
     }
     return true;
   }
   //isTwinPrime method
   public static boolean isTwinPrime(int i){
     if(isPrime(i) && isPrime(i + 2))
       return true;
    return false;
   }

   public static void main(String[] args){
     //Increment by 1 to find the twin prime pair
     for(int m = 2; m < 1000; m++){
       if(isTwinPrime(m))
          System.out.println("(" + m + "," + (m + 2) + ")");
   }
  }
 }
