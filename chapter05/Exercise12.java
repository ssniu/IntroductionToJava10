
/**
 * (Find the smallest n such that n2 > 12,000)
 * Use a while loop to find the smallest integer n such that n2 is greater than 12,000.
 *
 */
 public class Exercise12{
   public static void main(String[] args){
     int n = 0; // Declare n and its initial value is 0

     while(Math.pow(n, 2) <= 12000){
       while(Math.pow(n, 2) < 12000)
         n++;
     }
     System.out.println("The smallest integer n such that n^2 " +
              "is greater than 12,000 is: " + n);
   }
 }
