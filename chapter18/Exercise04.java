/**
 * (Sum series) Write a recursive method to compute the following series:
 * m(i) = 1 + 1/2 + 1/3 + 1/4 + ... + 1/i
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 *
 */

 public class Exercise04{
   public static void main(String[] args){
     //Display the results of m(1..10)
     for(int i = 1; i <= 10; i++)
       System.out.println("The result is " + m(i));
   }

   //m method
   public static double m(int n){
     if(n == 1)//Base case
        return 1;
     else
        return m(n - 1) + 1.0 / n; //Recursive call
   }
 }
