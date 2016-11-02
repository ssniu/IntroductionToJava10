
/**
 * (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using
 * the following header:
 *    public static void printMatrix(int n)
 *   Each element is 0 or 1, which is generated randomly. Write a test program that
 * prompts the user to enter n and displays an n-by-n matrix
 *
 */
import java.util.Scanner;

class Exercise17{
  //Matrix Method
  public static void printMatrix(int n){
    //Create a n-by-n matrix
    for(int i = 0; i < n; i++){
      for(int j = 0; j < n; j++){
         System.out.print((int)(Math.random() * 2) + " ");
    }
    //Generate a new line
    System.out.println();
   }
  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Prompt the user to enter the number n
    System.out.print("Enter the number n ( n-by-n matrix): ");
    int m = input.nextInt();
    printMatrix(m);//Output the n-by-n matrix

  }
}
