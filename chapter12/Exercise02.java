/**
 * (InputMismatchException)
 * Write a program that prompts the user to read
 * two integers and displays their sum.
 * Your program should prompt the user to read the number
 * again if the input is incorrect.
 *
 */

 import java.util.*;

 public class Exercise02{
   public static void main(String[] args){
     //Data fields
     Scanner input = new Scanner(System.in);
     boolean continueInput = true;
     System.out.print("Enter two integers:");
     //Loop condition
     do{
       //InputMismatchException
       try{
         int num1 = input.nextInt();
         int num2 = input.nextInt();

         int sum = num1 + num2;
         System.out.println("The sum is " + sum);
         continueInput = false;
     }catch (InputMismatchException ex){
       System.out.println("Please enter the integer instead:");
       //Discard input
       input.nextLine();
     }
   }while(continueInput);
 }
 }
