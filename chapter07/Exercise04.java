/**
 * (Analyze scores) Write a program that reads an unspecified number of scores and
 * determines how many scores are above or equal to the average and how many
 * scores are below the average. Enter a negative number to signify the end of the
 * input. Assume that the maximum number of scores is 100.
 *
 */

import java.util.Scanner;

class Exercise04{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Prompt the user to enter the scores
    System.out.print("Enter the scores: (negative number to end input)");
    //Set the maximum scores array to 100
    int[] scores = new int[100];
    int total = 0;
    int numOfScore = 0;
    double average = 0;
    //Compute the average of array
    for(int i = 0; i < 100; i++){
      int num = input.nextInt();
      if(num < 0)   break;
      scores[i] = num;
      total += num;
      numOfScore++;
    }
    average = (int)total / numOfScore;
    //Count the number of scores above and below average
    int above = 0;
    int below = 0;
    for(int i = 0; i < numOfScore; i++){
      if(scores[i] >= average)
         above++;
      else
         below++;
    }

    System.out.println("Average score is: " + average);
    System.out.println("Number of scores above average is: " + above);
    System.out.println("Number of scores below average is: "+ below);

  }


}
