/**
 * (Sum ArrayList)
 * Write the following method that returns the sum of all numbers in an ArrayList:
 * public static double sum(ArrayList<Double> list)
 * Write a test program that prompts the user to enter 5 numbers,
 * stores them in an array list, and displays their sum.
 *
 */

 import java.util.Scanner;
 import java.util.ArrayList;

 public class Exercise12{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     ArrayList<Double> list = new ArrayList<>();
     //Prompt the user to enter 5 numbers
     System.out.println("Enter 5 numbers: ");
     for(int i = 0; i < 5; i++){
       Double num = input.nextDouble();
       list.add(num);
     }
    //Invoke the sum() method
     System.out.println("The sum of those numbers is :" + sum(list));
   }
   //sum() method
   public static double sum(ArrayList<Double> list){
     double sum = 0;
     for(int i = 0; i < list.size(); i++){
       sum += list.get(i);
     }
     return sum;
   }
 }
