
/**
 * (Cost of shipping) A shipping company uses the following function to calculate
 * the cost (in dollars) of shipping based on the weight of the package (in pounds).
 *    c(w) = d
 *           3.5, if 0 < w < = 1
 *           5.5, if 1 < w < = 3
 *           8.5, if 3 < w < = 10
 *           10.5, if 10 < w < = 20
 * Write a program that prompts the user to enter the weight of the package and
 * display the shipping cost. If the weight is greater than 50, display a message “the
 * package cannot be shipped.”
 *
 */

 import java.util.Scanner;

 public class Exercise18{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     //Prompt user to enter the weight
     System.out.print("Enter the weight of package: ");
      double weight = input.nextDouble();

     //Compute the cost
     double cost = 0;
     if(weight > 0 && weight <= 1)
       cost = 3.5;
     else if(weight > 1 && weight <= 3)
       cost = 5.5;
     else if(weight > 3 && weight <= 10)
       cost = 8.5;
     else if(weight > 10 && weight <= 20)
       cost = 10.5;
     System.out.println("The cost of package is: " + cost);

     if(weight > 50)
       System.out.println("The package cannot be shipped.");


   }
 }
