/**
 * (Process scores in a text file)
 * Suppose that a text file contains an unspecified number of
 * scores separated by blanks. Write a program that prompts the user
 * to enter the file, reads the scores from the file,
 * and displays their total and average.
 *
 */

 import java.util.*;
 import java.io.*;

 public class Exercise14{
   public static void main(String[] args) throws Exception{
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter the file name
     System.out.println("Enter a file of scores: ");
     File file = new File(input.nextLine());
     //Check the file exists or not
     if(!file.exists()){
       System.out.println("File " + file + " does not exist");
       System.exit(1);
     }
     //Initialize the number of scores and summation of scores and average
     int count = 0;
     double total = 0;
     double avg = 0;
     //Compute the total and count
     try( Scanner iFile = new Scanner(file);){
       while(iFile.hasNext()){
         total += iFile.nextInt();
         count++;
       }
     }
     //Compute the average of all scores
     avg = total / count;
     System.out.println("There are " + count + " scores" +
        " total is " + total + " average is " + avg);
   }
 }
