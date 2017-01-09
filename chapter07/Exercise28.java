/**
 * (Math: combinations)
 * Write a program that prompts the user to enter 10 integers
 * and displays all combinations of picking two numbers from the 10.
 *
 */

 import java.util.Scanner;

 public class Exercise28{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter all 10 numbers
     System.out.println("Enter 10 numbers:");
     int[] num = new int[10];
     for(int i = 0; i < num.length; i++)
        num[i] = input.nextInt();
   combination(num);//Invoke the combination() method
  }
  //combination() method
  public static void combination(int[] num){
    for(int i = 0; i < num.length; i++){
      for(int j = 0; j < num.length; j++){
        if(i != j)
          System.out.print(num[i] + " " + num[j]);
      }
    }
  }
 }
