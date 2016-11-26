
/**
 * (Mersenne prime)
 * A prime number is called a Mersenne prime if it can be written
 * in the form 2^p - 1 for some positive integer p.
 * Write a program that finds all Mersenne primes with p<=31
 * and displays the output as follows:
 *    p              2^p-1
 *---------------------------
 *    2              3
 *    3              7
 *    ...
 *
 */

 class Exercise28{
   //isPrime method
   public static boolean isPrime(int n){
     for(int divisor = 2; divisor <= n / 2; divisor++){
       if(n % divisor == 0) return false;
     }
     return true;
   }
   //Find the correct prime number that match the requirement
   public static int mersennePrime(int i){
       int x = (int)Math.pow(2,i) - 1;
       if(isPrime(x))
        return x;
     return 0;
   }

   public static void main(String[] args){
     System.out.printf("%-10s%15s", "p","2^p-1");//Print the table header
     System.out.println("\n----------------------------");
     //Find all mesenne prime that less than 31 
     for(int i = 2; i <= 31; i++){
       int k = mersennePrime(i);
       if(k != 0)
           System.out.printf("%-10d%15d\n", i, k);
     }
   }
 }
