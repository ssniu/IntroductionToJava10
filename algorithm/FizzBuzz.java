/*
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime?
 * You may assume the returned list does not count as extra space.
 * Example:
 * Input:[4,3,2,7,8,2,3,1]
 * Output:[5,6]
 *
 */

import java.util.*;

 public class FizzBuzz{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter a number");
     int n = input.nextInt();

     System.out.println("Return " + fizzBuzz(n));
   }
  // fizzBuzz() method to return the result as a string
   public static List<String> fizzBuzz(int n){
     // Create a new ArrayList<> to add the result
     List<String> str = new ArrayList<>();
     for(int i = 1; i <= n; i++){
       if(i % 3 == 0 && i % 5 == 0){
         str.add("FizzBuzz");
       }else if(i % 3 == 0) {
         str.add("Fizz");
       }else if(i % 5 == 0){
         str.add ("Buzz");
       }else {
         //Add the integers as string elements
         str.add(String.valueOf(i));
       }
     } return str;
   }
 }
