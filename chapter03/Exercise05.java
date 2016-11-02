
/**
 * (Find future dates)
 * Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6).
 * Also prompt the user to enter the number of days after today
 * for a future day and display the future day of the week.
 *
 */

 import java.util.Scanner;

 public class Exercise05{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter today's day
     System.out.print("Enter today's day: (Sunday is 0, Monday is 1, ... Saturday is 6)");
     int i = input.nextInt();
     //Prompt user enter number of days elapsed
     System.out.print("Enter the number of days elapsed since today:");
     int j = input.nextInt();

     // Output today's day
     switch(i) {
       case 0: System.out.print("Today is Sunday");
               break;
       case 1: System.out.print("Today is Monday");
               break;
       case 2: System.out.print("Today is Tuesday");
               break;
       case 3: System.out.print("Today is Wednesday");
               break;
       case 4: System.out.print("Today is Thursday");
               break;
       case 5: System.out.print("Today is Friday");
               break;
       default: System.out.print("Today is Saturday");
               break;
     }
     //compute the future day by ((i + j) % 7)
     switch((i + j) % 7) {
       case 0: System.out.println(" and the future day is Sunday");
               break;
       case 1: System.out.println(" and the future day is Monday");
               break;
       case 2: System.out.println(" and the future day is Tuesday");
               break;
       case 3: System.out.println(" and the future day is Wednesday");
               break;
       case 4: System.out.println(" and the future day is Thursday");
               break;
       case 5: System.out.println(" and the future day is Friday");
               break;
       default: System.out.println(" and the future day is Saturday");
               break;
     }

   }
 }
