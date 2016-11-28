/**
 * (Create a text file)
 * Write a program to create a file named Exercise17_01.txt if
 * it does not exist. Append new data to it if it already exists.
 * Write 100 integers created randomly into the file using text I/O.
 * Integers are separated by a space.
 *
 */

 import java.util.*;
 import java.io.*;

 public class Exercise01{
   public static void main(String[] args) throws FileNotFoundException{
     ArrayList<String> list = new ArrayList<>();
     //Check the file exists or not
     File file = new File("Exercise17_01.txt");
     if(file.exists()){
       try(
       Scanner input = new Scanner(file);
       ){
         while(input.hasNext()){
           list.add(input.nextLine());
         }
       }
     }
     //Add random numbers
     for(int i = 0; i < 100; i++){
       list.add(((int)(Math.random() * 100)) + " ");
     }
     try(
     PrintWriter output = new PrintWriter(file);
     ){
       for(String i: list){
         output.print(i);
       }
     }
   }
 }
