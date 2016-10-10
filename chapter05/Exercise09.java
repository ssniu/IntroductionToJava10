
/**
 * (Find the two highest scores)
 * Write a program that prompts the user to enter the
 * number of students and each student’s name and score, and finally displays the
 * student with the highest score and the student with the second-highest score.
 *
 */

 import java.util.Scanner;

 public class Exercise09{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     //Prompt user to enter the number of students
     System.out.print("Enter the number of students:");
     int n = input.nextInt();

     //Declare the highestScore and highestName, second-highest score and name
     int highestScore = 0;
     String highestName = " ";
     int secondHighestScore = 0;
     String secondHighestName = " ";

     System.out.println("Enter the student name and score:");

     for(int i = 0; i < n; i++){
       //Enter the student name
       System.out.print("Student:" + (i + 1) + "\n Name: ");
       String name = input.next();
       //Enter the student score
       System.out.print("Score: ");
       int score = input.nextInt();

       //Find the highest score
       if(score >= highestScore) {
         highestScore = score;
         highestName = name;
       }

        while(score != highestScore) {
          if(score >= secondHighestScore){
            secondHighestScore = score;
            secondHighestName = name;

     }
   }
   }
    System.out.println("Student with highest score is: " + highestName);
    System.out.println("The student with second highest score is: " + secondHighestName);

   }
 }
