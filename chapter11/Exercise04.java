/**
 * (Maximum element in ArrayList)
 * Write the following method that returns the maximum value
 * in an ArrayList of integers. The method returns null if the
 * list is null or the list size is 0.
 * public static Integer max(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter
 * a sequence of numbers ending with 0, and invokes this method
 * to return the largest number in the input.
 *
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise04{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Prompt the user to enter the integer objects inside list
    System.out.println("Enter the elements in this arraylist:");
    ArrayList<Integer> list = new ArrayList<>();
    Integer num = input.nextInt();
    //The input will end with 0
    while(num.intValue() != 0){
      list.add(num);
      num = input.nextInt();
    }
    //Invoke max() method
    System.out.println("The largest number in this list is " + max(list));
  }
  //max() method
  public static Integer max(ArrayList<Integer> list){
    //If the list is null or size is 0, return null
    if(list.size() == 0)
       return null;
    //Find the max object in the list
    Integer max = list.get(0);
    for(int i = 0; i < list.size(); i++){
      if(list.get(i) > max)
         max = list.get(i);
    }
    return max;
  }
}
