/**
 * (Implement GenericStack using inheritance)
 * In Listing 19.1, GenericStack is implemented using composition.
 * Define a new stack class that extends ArrayList.
 * Draw the UML diagram for the classes and then implement GenericStack.
 * Write a test program that prompts the user to enter five strings and
 * displays them in reverse order.
 *
 */

 import java.util.Scanner;

 public class Exercise02{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     GenericStack1<String> stack = new GenericStack1<>();

     System.out.print("Enter five strings: ");
     for(int i = 0; i < 5; i++){
       stack.push(input.next());
     }
     while(!stack.isEmpty())
        System.out.print(stack.pop() + " ");
     System.out.println();
   }
 }
