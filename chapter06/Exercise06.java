/**
 * (Display patterns) Write a method to display a pattern as follows:
 *                      1
 *                    2 1
 *                  3 2 1
 *                   ...
 *        n n-1 ... 3 2 1
 * The method header is
 *      public static void displayPattern(int n)
 *
 */
import java.util.Scanner;

 class Exercise06{
   public static void displayPattern(int n){
     for(int row = 1; row <= n; row++){
       //Display the spaces
       for(int i = n - row; i >= 1; i--)
         System.out.print("  ");
         //Display the numbers
       for(int j = row; j >= 1; j--)
         System.out.print(j + " ");
       System.out.println();
     }
 }
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter n: ");
     int n = input.nextInt();

     displayPattern(n);//Invoke the displayPattern method

   }
 }
