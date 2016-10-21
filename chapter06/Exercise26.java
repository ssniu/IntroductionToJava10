/**
 * (Palindromic prime) A palindromic prime is a prime number and also palindromic.
 * For example, 131 is a prime and also a palindromic prime, as are 313 and 757.
 * Write a program that displays the first 100 palindromic prime numbers.
 * Display 10 numbers per line, separated by exactly one space, as follows:
 * 2 3 5 7 11 101 131 151 181 191
 * 313 353 373 383 727 757 787 797 919 929
 *
 */

 class Exercise26{
   // Check the number is prime or not method
   public static boolean isPrime(int number){
     for(int i = 2; i < number / 2; i++){
       if(number % i == 0)
          return false;// Not prime. return false
     }
     return true;
   }
   //Check the number is palindromic  or not
   public static boolean isPalindromic(int number){
     return number == reverse(number) ? true : false;
   }
   //Reverse the number from backward to forward
   public static int reverse(int number){
     String reverse = "";
     String n = number + "";
     // Reverse method
     for(int i = n.length() - 1; i >= 0; i--){
       reverse += n.charAt(i);
     }
     return Integer.parseInt(reverse);//Output integer
   }
   // Main method
   public static void main(String[] args){
     final int NUMBER_PER_LINE = 10;
     final int TOTAL_PALIN = 100;
     //Initialize the count of palindromic and prime number, start from 2
     int count = 0;
     int n = 2;
     // While loop to output 200 numbers
     while(count < TOTAL_PALIN){
       if(isPalindromic(n) && isPrime(n)){
         count++;
         System.out.print((count % NUMBER_PER_LINE == 0) ? n + " " + "\n" : n + " ");
       }
       n++;
     }
   }
 }
