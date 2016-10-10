
/**
 * (Compute the greatest common divisor)
 * Another solution for Listing 5.9 to find
 * the greatest common divisor of two integers n1 and n2 is as follows:
 * First find d to be the minimum of n1 and n2, then check whether d, d-1, d-2,
 * . . . , 2, or 1 is a divisor for both n1 and n2 in this order.
 * The first such common divisor is the greatest common divisor
 * for n1 and n2. Write a program that prompts the user to enter
 * two positive integers and displays the gcd.
 *
 */

import java.util.Scanner;

class Exercise14{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter two numbers: ");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int d = 0;
    int gcd = 0;

    // Assign the minimum of n1 and n2 to d
    if(number1 >= number2)
      d = number2;
    else
      d = number1;
    System.out.println("d is :" + d);//Output d to make sure it works correctly

    // Find the gcd
    for( ; d > 0; d--) {
      if(number1 % d == 0 && number2 % d == 0){
        gcd = d;
        break;// Once find the gcd, break the process and output the gcd
    }
}
    System.out.println("The gcd of " + number1 + " and " + number2 + " is " + gcd);
  }
}
