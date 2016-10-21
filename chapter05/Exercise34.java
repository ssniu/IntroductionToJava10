/**
 * (Game: scissor, rock, paper)
 * Programming Exercise 3.17 gives a program that plays
 * the scissor-rock-paper game. Revise the program to let
 * the user continuously play until either the user or
 * the computer wins more than two times than its opponent.
 *
 */

 import java.util.Scanner;

 class Exercise34{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Number 0, 1 and 2 represent scissor, rock and paper. \n");

     do{
       int computer = (int)(Math.random() * 3);

       System.out.print("Enter 0 or 1 or 2: ");
       int gamer = input.nextInt();

       if(computer == gamer)
          System.out.println("We draw.");
       else if((computer == 0 && gamer == 1) || (computer == 1 && gamer == 2) ||
         (computer == 2 && gamer == 0)){
           System.out.println("You win.");
           total1++;
         }
       else {
           System.out.println("Computer wins.");
           total2++;
         }
       }

   }
 }
