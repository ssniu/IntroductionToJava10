
/**
 * (Game: scissor, rock, paper)
 * Write a program that plays the popular scissor-rockpaper
 * game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
 * wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
 * scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
 * 2 and displays a message indicating whether the user or the computer wins, loses,
 * or draws.
 *
 */

import java.util.Scanner;

class Exercise17{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Prompt the user to enter the number represents scissor rock and paper
    System.out.print("Number 0, 1 and 2 represent scissor, rock and paper.\n");
    int computer = (int)(Math.random() * 3);// Generate random 0, 1 or 2
    // Prompt user enter 0, 1 or 2
    System.out.print("Enter 0 or 1 or 2: ");
    int gamer = input.nextInt();
    //Output the value from computer and user
    System.out.print("The computer is: ");

    switch(computer){
      case 0: System.out.print("scissor\n"); break;
      case 1: System.out.print("rock\n");break;
      case 2: System.out.print("paper\n");
    }

    System.out.print("You are: ");
    switch(gamer){
      case 0: System.out.print("scissor\n"); break;
      case 1: System.out.print("rock\n"); break;
      case 2: System.out.print("paper\n"); break;
    }
    //Compare the value from computer and user
    if(computer == gamer)
      System.out.println("We draw.");

    else if((computer == 0 && gamer == 1) ||
            (computer == 1 && gamer == 2) ||
            (computer == 2 && gamer == 0))
      System.out.println("You win.");

    else
       System.out.println("Computer wins.");
  }
}
