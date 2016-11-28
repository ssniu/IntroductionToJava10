/**
 * (ArrayIndexOutOfBoundsException)
 * Write a program that meets the following requirements:
 * ■ Creates an array with 100 randomly chosen integers.
 * ■ Prompts the user to enter the index of the array,
 *    then displays the corresponding element value.
 * If the specified index is out of bounds, display the message Out of Bounds.
 *
 */

 import java.util.*;

 public class Exercise03{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //create an array with 100 random elements
     int[] array = new int[100];
     for(int i = 0; i < 100; i++){
       array[i] = (int)(Math.random() * 100);
     }
     //ArrayIndexOutOfBoundsException
   try{
     System.out.print("Enter a number between 0 and 100:");
     int n = input.nextInt();
      System.out.println("The " + n + "th element is" + array[n]);
   }catch(ArrayIndexOutOfBoundsException ex){
     System.out.println("Out of Bounds");
   }
 }
 }
