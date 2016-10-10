
/**
 * (Display numbers in a pyramid pattern)
 * Write a nested for loop that prints the following output:
 *                               1
 *                             1 2 1
 *                           1 2 4 2 1
 *                         1 2 4 8 4 2 1
 *                       1 2 4 8 16 8 4 2 1
 *                    1 2 4 8 16 32 16 8 4 2 1
 *                 1 2 4 8 16 32 64 32 16 8 4 2 1
 *              1 2 4 8 16 32 64 128 64 32 16 8 4 2 1
 *
 */

 import java.util.Scanner;

 class Exercise19{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter the number of lines: ");
     int line = input.nextInt();

     for(int i = 1; i <= line; i++){

       //Generate spaces
       for(int j = line - i; j > 0; j--)
         System.out.print("  ");
       for(int k = i; k >= 2; k--) {
             k *= 2;
         System.out.print(k + " ");
       }
       for(int m = 1; m <= i; m++){
         m *= 2;
         System.out.print(m * 2 + " ");
       }
      System.out.println();
     }
   }
 }
