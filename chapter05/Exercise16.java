
/**
 * (Find the factors of an integer)
 * Write a program that reads an integer and displays
 * all its smallest factors in increasing order.
 * For example, if the input integer is 120,
 * the output should be as follows: 2, 2, 2, 3, 5.
 *
 */
 import java.util.Scanner;

 class Exercise16{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter an integer
     System.out.print("Enter an integer: ");
     int n = input.nextInt();
     int i = 2;//The factors start from 2

     // Can not use for loop, cause for loop will increment i
     while(n / i != 1){
       if(n % i == 0){// i is n's factor
         n /= i;// n is divided by i and return a new n to continue the factor test
         System.out.print(i + " ");
       }
       else
         i++;// if i is not the factor, increment i to find next factor
     }
     System.out.println(n);// Output the final n after divided by largest i
   }
 }
