/**
 * (Count characters, words, and lines in a file)
 * Write a program that will count the number of characters, words,
 * and lines in a file. Words are separated by whitespace characters.
 *
 */
import java.util.*;
import java.io.*;

public class Exercise13{
  public static void main(String[] args) throws Exception{
    if(args.length != 1){
      System.out.println("Usage: java fileName");
      System.exit(1);
    }
    //Create file object
    File file = new File(args[0]);
    if(!file.exists()){
      System.out.println("File " + args[0] + " does not exist");
      System.exit(2);
    }
    //Initialize the number of characters and words and lines to 0
    int numberOfChar = 0;
    int numberOfLines = 0;
    int numberOfWords = 0;
    //Read the file
    try(Scanner input = new Scanner(file);){
      while (input.hasNext()){
        //Find the number of lines and characters
        numberOfLines++;
        String s = input.nextLine();
        numberOfChar += s.length();
      }
    }
    //Write the file
    try( Scanner input = new Scanner(file);){
      while(input.hasNext()){
        String l = input.next();
        //Find the number of words
        numberOfWords++;
      }
    }
    //Output the results
    System.out.println("File" + file.getName() + " has ");
    System.out.println(numberOfChar + " characters");
    System.out.println(numberOfWords + " words");
    System.out.println(numberOfLines + " lines");
  }
}
