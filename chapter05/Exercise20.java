
/**
 * (Display prime numbers between 2 and 1,000)
 * Modify Listing 5.15 to display all the prime numbers between 2 and 1,000, inclusive.
 * Display eight prime numbers per line. Numbers are separated by exactly one space.
 *
 */

 class Exercise20{
   public static void main(String[] args){
     int count = 0;

     System.out.println("All the prime numbers between 2 and 1000, inclusive: ");

     for(int i = 2; i <= 1000; i++) {
       boolean isPrime = true;

       //Find out the prime numbers
       for(int j = 2; j <= i / 2; j++) {
         if(i % j == 0) {
           isPrime = false;
           break;
         }
       }
       //If the number is prime, count it
       if(isPrime) {
          count++;
           // Output the 8 primes per line
           if(count % 8 == 0)
             System.out.println(i);
           else
             System.out.print(i + " ");
       }
     }
   }
 }
