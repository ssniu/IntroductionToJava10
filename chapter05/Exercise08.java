
/**
 * (Find the highest score)
 * Write a program that prompts the user to enter the number
 * of students and each student’s name and score, and finally displays the name
 * of the student with the highest score.
 *
 */
 import java.util.Scanner;

 public class Exercise08{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     // Declare the highest score and name
     int highestScore = 0;
     String highestName = " ";

     System.out.print("Enter the number of students:");
     int n = input.nextInt();

     System.out.print("Enter each student's name and score: ");
     for(int i = 0; i < n; i++){
       //Enter the student's name
       System.out.print("Student: " + (i + 1) + "\n Name:");
       String name = input.next();//if it is nextLine, got runtime error
       //Enter the score
       System.out.print("score: ");
       int score = input.nextInt();

       // Find the highest score
       if(score > highestScore) {
         highestScore = score;
         highestName = name;
       }
  }
       // Output the highest score with Student's name
       System.out.println("The student with highest score is :" + highestName + " and the highest score is: " + highestScore);
   }
 }
