/**
 * 258 Add digits
 * Given a non-negative integer num,
 * repeatedly add all its digits until the result has only one digit.
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2.
 * Since 2 has only one digit, return it.
 *
 */

 import java.util.Scanner;

 public class AddDigits{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter a number:");
     int i = input.nextInt();

     System.out.println("The result is " + addDigits(i));
   }

   public static int addDigits(int i){
     return i == 0 ? 0 : (i % 9 == 0 ? 9 : (i % 9));
   }
 }
