/**
 * (Sort students) Write a program that prompts the user
 * to enter the number of stu- dents, the students’ names,
 * and their scores, and prints student names in decreasing order of their scores.
 *
 */

 import java.util.Scanner;

 class Exercise17{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt user enter the number of students, name and score
     System.out.print("Enter the number of students: ");
     int numberOfStudents = input.nextInt();
     double[] score = new double[numberOfStudents];
     String[] name = new String[numberOfStudents];
     //Input the name and score of all students
     for(int i = 0; i < numberOfStudents; i++){
       System.out.print("\nStudents " + (i + 1) + " : ");
       name[i] = input.next();
       System.out.print("\nScore: ");
       score[i] = input.nextDouble();
     }
     //Invoke the sort method
     sort(score, name);
     //Output the name string array
     for(String e: name)
       System.out.println(e);
   }
   //Sort method
   public static void sort(double[] score, String[] name){
     for(int i = 0; i < score.length; i++){
       int maxIndex = i;
       double max = score[i];
       String temp;
       //Find the maximum score and swap it to the first,
       for(int j = i + 1; j < score.length; j++){
         if(max < score[j]){
           max = score[j];
           maxIndex = j;
         }
       }
       //Swap the name string elements according the descending score order
         if(maxIndex != i){
           temp = name[i];
           name[i] = name[maxIndex];
           name[maxIndex] = temp;

           score[maxIndex] = score[i];
           score[i] = max;
         }
       }
     }
   }
