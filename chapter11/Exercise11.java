/**
 * (Sort ArrayList)
 * Write the following method that sorts an ArrayList of numbers:
 * public static void sort(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter 5 numbers,
 * stores them in an array list, and displays them in increasing order.
 *
 */

 import java.util.Scanner;
 import java.util.ArrayList;

 public class Exercise11{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     ArrayList<Integer> list = new ArrayList<>();
    //Prompt the user to enter the numbers and end with 0
     System.out.println("Enter the numbers in the list: ");
     Integer num = input.nextInt();
     while(num.intValue() != 0){
       list.add(num);
       num = input.nextInt();
     }
     //Invoke the sort() method
     sort(list);

     System.out.println(list.toString());
   }
   //Sort() method
   public static void sort(ArrayList<Integer> list){
     java.util.Collections.sort(list);
   }
 }
