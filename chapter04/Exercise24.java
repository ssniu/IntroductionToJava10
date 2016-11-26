/**
 * (Order three cities) Write a program that prompts the
 * user to enter three cities and displays them in ascending order.
 *
 */

 import java.util.Scanner;

 class Exercise24{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     //Prompt the user to enter three cities
     System.out.print("Enter the first city: ");
     String city1 = input.nextLine();
     System.out.print("Enter the second city: ");
     String city2 = input.nextLine();
     System.out.print("Enter the third city: ");
     String city3 = input.next();
     String temp = "";

     //Compare those three cities, swap the smallest one to be the first
     if(city1.compareTo(city2) > 0){
       temp = city2;
       city2 = city1;
       city1 = temp;
     }
     if(city2.compareTo(city3) > 0){

       temp = city3;
       city3 = city2;
       city2 = temp;
     }
     if(city1.compareTo(city2) > 0){

       temp = city2;
       city2 = city1;
       city1 = temp;
     }

    System.out.println("\nThe three cities in alphabetical order are " +
    city1 + " " + city2 + " " + city3);
   }
 }
