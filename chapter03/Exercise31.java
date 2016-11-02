/**
 * (Financials: currency exchange) Write a program that prompts the user to enter
 * the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
 * to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
 * Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
 * or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 *
 */

 import java.util.Scanner;

 class Exercise31{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter the amount of dollars
     System.out.print("Enter the exchange rate from dollars to RMB: ");
     double e = input.nextDouble();
     // Convert dollars or RMB
     System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
     int c = input.nextInt();
     // Enter the amount of RMB
     System.out.print("Enter the RMB amount: ");
     int a = input.nextInt();
     // Convert dollars to RMB or convert RMB to dollar
     if(c == 0)
       System.out.println("$" + a + " is " + a * e + " yuan");
     else
       System.out.println(a + " yuan is $ " + a / e);
   }
 }
