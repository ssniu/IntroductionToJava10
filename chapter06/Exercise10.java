
/**
 * (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
 * isPrime(int number) method for testing whether a number is prime. Use this
 * method to find the number of prime numbers less than 10000.
 *
 */

 class Exercise10{
   // isPrime method
   public static boolean isPrime(int number){
     for(int divisor = 2; divisor <= number / 2; divisor++){
       if(number % divisor == 0)// if number is not prime, return false
           return false;
     }
     return true;// return true if it is prime
   }

   public static void main(String[] args){
     int numberOfPrime = 0;//Initialize the numberOfPrime to 0
     for(int i = 2; i < 10000; i++){
       if(isPrime(i))
         numberOfPrime++;// Count the numberOfPrime
     }
     System.out.println("The number of prime less than 10000 is: " + numberOfPrime);
   }
 }
