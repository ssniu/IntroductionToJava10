/**
 * (Shuffle ArrayList)
 * Write the following method that shuffles the elements in an ArrayList of integers.
 * public static void shuffle(ArrayList<Integer> list)
 *
 */

 import java.util.Scanner;
 import java.util.ArrayList;

 public class Exercise07{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     // Create the list object for ArrayList class
     ArrayList<Integer> list = new ArrayList<>();
     System.out.println("Enter the elements inside the list: ");
     Integer num = input.nextInt();
     // Check the valid input
     while(num.intValue() != 0){
       list.add(num);
       num = input.nextInt();
     }
     //Invoke the shuffle method
     shuffle(list);
   }
   //Shuffle method
   public static void shuffle(ArrayList<Integer> list){
     java.util.Collections.shuffle(list);
     //Output the list
     //for(int i = 0; i < list.size(); i++){
       //System.out.print(list.get(i) + " ");
     //}
     for(int i : list)
       System.out.print(i + " ");
     System.out.println();
   }
 }
