/**
 * (Order three cities) Write a program that prompts the
 * user to enter three cities and displays them in ascending order.
 *
 */

 import java.util.Scanner;

 class Exercise24{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt user enter three cities
     System.out.print("Enter the first city: ");
     String city1 = input.nextLine();
     System.out.print("Enter the second city: ");
     String city2 = input.nextLine();
     System.out.print("Enter the third city: ");
     String city3 = input.next();
     //Compare those three cities, swap the smallest one to be the first
     if((city2.compareTo(city1) < 0) && (city2.compareTo(city3) < 0)){
       String temp = new String();
       temp = city1;
       city1 = city2;
       city2 = temp;
     }
     else if((city3.compareTo(city1) < 0) && (city3.compareTo(city2) < 0)){
       String temp = new String();
       temp = city1;
       city1 = city3;
       city3 = temp;
     }
     else if(city3.compareTo(city2) < 0){
       String temp = new String();
       temp = city2;
       city2 = city3;
       city3 = temp;
     }
    System.out.println("\nThe three cities in alphabetical order are " +
    city1 + " " + city2 + " " + city3);
   }
 }
