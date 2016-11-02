/**
 * (Print the characters in a string reversely)
 * Write a recursive method that displays a string reversely
 * on the console using the following header:
 *     public static void reverseDisplay(String value)
 * For example, reverseDisplay("abcd") displays dcba.
 * Write a test program that prompts the user to
 * enter a string and displays its reversal.
 *
 */
import java.util.Scanner;

public class Exercise09{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Prompt the user to enter a string
    System.out.print("Enter the string: ");
    String str = input.nextLine();
    //Invoke the reverseDisplay() method
    reverseDisplay(str);
  }
  //reverseDisplay() method
  public static void reverseDisplay(String value){
    if(value.length() == 1)//Base case
      System.out.println(value);
    else {
      System.out.println(value.charAt(value.length() - 1));
      reverseDisplay(value.substring(0,(value.length() - 1)));//Reversive call
    }
  }
}
