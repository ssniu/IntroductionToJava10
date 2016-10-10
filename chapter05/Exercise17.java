
/**
 * (Display pyramid)
 * Write a program that prompts the user to enter an integer from
 * 1 to 15 and displays a pyramid, as shown in the following sample run:
 * Enter the number of lines: 7
 *                           1
 *                         2 1 2
 *                       3 2 1 2 3
 *                     4 3 2 1 2 3 4
 *                   5 4 3 2 1 2 3 4 5
 *                 6 5 4 3 2 1 2 3 4 5 6
 *               7 6 5 4 3 2 1 2 3 4 5 6 7
 *
 */

 import java.util.Scanner;

 class Exercise17{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter the number of lines: ");
     int lines = input.nextInt();

     for(int row = 1; row <= lines; row++){
       //Generate the speces
       for(int i = lines - row; i >= 1; i--)
         System.out.print("  ");// Two spaces
       // Generate descending numbers
       for(int j = row; j >= 2; j--)
         System.out.print(j + " ");
      // Generate ascending numbers
       for(int k = 1; k <= row; k++)
         System.out.print(k + " ");
      System.out.println();
     }
   }
 }
