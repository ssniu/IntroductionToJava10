/**
 * (Occurrences of each letter) Write a program that prompts the user to enter
 * a file name and displays the occurrences of each letter in the file. Letters are
 * case-insensitive.
 *
 */

 import java.io.*;
 import java.util.*;

 public class Exercise30{
   public static void main(String[] args){
     System.out.print("Enter a filename:");
     File file = new File(new Scanner(System.in).next());
     //Test if the file exists
     if(!file.exists()){
       System.out.println(file + " does not exist!");
       System.exit(1);
     }
     
     String buffer = "";
     int[] count = new int[26];
     try(Scanner input = new Scanner(file)){
       while(input.hasNext()){
         buffer = input.nextLine();
         for(char ch: buffer.toCharArray()){
           ch = Character.toUpperCase(ch);
           if(isLetter(ch)){
             count[ch-'A']++;//Count the number of letters
           }
         }
       }
     }catch(FileNotFoundException ex){
       ex.printStackTrace();
     }
    //Output the result
     for(int i = 0; i < count.length; i++){
       System.out.println((char)(i + 'A') + " occurrence = " + count[i]);
     }
   }
   //isLetter() method
   private static boolean isLetter(char ch){
     return (ch >= 'A' && ch <= 'Z');
   }
 }
