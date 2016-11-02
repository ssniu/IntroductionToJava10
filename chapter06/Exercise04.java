/**
 * (Display an integer reversed) Write a method with the following header to display
 * an integer in reverse order:
 * public static void reverse(int number)
 * For example, reverse(3456) displays 6543. Write a test program that prompts
 * the user to enter an integer and displays its reversal.
 *
 */

 import java.util.Scanner;

 class Exercise04{
   public static void reverse(int number){
     String str = "";
     String n = number + "";
     //Input numeric string
     for(int i = n.length() - 1; i >= 0; i--){
       str += n.charAt(i);
     }
     //Output the string
     System.out.println(Integer.parseInt(str));
   }

   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter a number: ");
     int number = input.nextInt();
     reverse(number);//invoke the reverse method
   }
 }
