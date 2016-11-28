/**
 * (Combine two lists)
 * Write a method that returns the union of two array lists of integers
 * using the following header:
 * public static ArrayList<Integer> union(ArrayList<Integer> list1,
 * ArrayList<Integer> list2)
 * For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
 * {2, 3, 1, 5, 3, 4, 6}.
 * Write a test program that prompts the user to enter two lists,
 * each with five integers, and displays their union.
 * The numbers are separated by exactly one space in the output.
 *
 */

 import java.util.Scanner;
 import java.util.ArrayList;

 public class Exercise14{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Create two objects of ArrayList class
     ArrayList<Integer> list1 = new ArrayList<>();
     ArrayList<Integer> list2 = new ArrayList<>();

     //Pormpt the user to enter numbers into two ArrayList objects
     System.out.println("Enter five integers for list1:");
     for(int i = 0; i < 5; i++){
       list1.add(input.nextInt());
     }

     System.out.println("Enter five integers for list2:");
     for(int i = 0; i < 5; i++){
       list2.add(input.nextInt());
     }
     //Create the 3rd ArrayList object to store the result
     ArrayList<Integer> list3 = union(list1, list2);
     System.out.println("The conbined list is ");
     for(int i = 0; i < list3.size(); i++){
       System.out.print(list3.get(i) + " ");
     }
   }
   //union() method
   public static ArrayList<Integer> union(ArrayList<Integer> list1,
              ArrayList<Integer> list2){
                ArrayList<Integer> list3 = list1;

                for(int i = 0; i < list2.size(); i++){
                  list3.add(list2.get(i));
                }
                return list1;
              }
 }
