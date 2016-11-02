/**
 * (Sum series) Write a recursive method to compute the following series:
 * m(i) = 1/2 + 2/3 + ... + i/(i + 1)
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 *
 */

 public class Exercise06{
   public static void main(String[] args){
     //Compute the first 10 numbers
     for(int i= 1; i <= 10; i++)
        System.out.println("The result of first 10 numbers is: " + m(i));
   }
   //m method
   public static double m(int n){
     if(n == 1)//Base case
         return 1.0/2;
     else
         return n/(n + 1.0) + m(n - 1);//Recursive compute
   }
 }
