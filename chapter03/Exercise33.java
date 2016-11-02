/**
 * (Financial: compare costs) Suppose you shop for rice in two different packages.
 * You would like to write a program to compare the cost. The program prompts the
 * user to enter the weight and price of the each package and displays the one with
 * the better price.
 *
 */

 import java.util.Scanner;

 class Exercise33{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter price and weight for package 1
     System.out.print("Enter weight and price for package 1: ");
     double weight1 = input.nextDouble();
     double price1 = input.nextDouble();
     //Prompt the user to enter the price and weight for package 2
     System.out.print("Enter weight and price for package 2: ");
     double weight2 = input.nextDouble();
     double price2 = input.nextDouble();

    //Compare the price per pound to find out the better price
     if(price1 / weight1 > price2 / weight2)
        System.out.println("Package 2 has a better price.");
     else if(price1 / weight1 == price2 / weight2)
        System.out.println("Two packages have the same price.");
     else
        System.out.println("Package 1 has a better price.");
   }
 }
