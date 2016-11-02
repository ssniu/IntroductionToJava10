/**
 * (Sum series) Write a recursive method to compute the following series:
 * m(i) = 1/3 + 2/5 + 3/7 + 4/9 + ... + i/(2i + 1)
 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
 *
 */

 public class Exercise05{
   public static void main(String[] args){
     //Compute the result of the first 10 numbers
     for(int i = 1; i <= 10; i++){
       System.out.println("The result is: " + m(i));
     }
   }
  //M method
   public static double m(int n){
     if(n == 1)//Base case
         return 1.0 / 3;
     else
         return n / (2.0 * n + 1.0) + m(n - 1);//Recursive call
   }
 }
