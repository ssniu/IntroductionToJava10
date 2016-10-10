
/**
 * (Find the largest n such that n^3 < 12,000)
 * Use a while loop to find the largest integer n such that n^3 is less than 12,000.
 *
 */
 public class Exercise13{
   public static void main(String[] args){
     int n = 0; // Initialize n to 0

     while(Math.pow(n, 3) < 12000){
       
         n++;
     }
     System.out.println("The largest n such that n^3 is less than 12,000 is: " + n);
   }
 }
