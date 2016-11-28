/** (Remove text)
 * Write a program that removes all the occurrences of a specified
 * string from a text file. For example, invoking
 *    java Exercise12_11 John filename
 * removes the string John from the specified file.
 * Your program should get the arguments from the command line.
 *
 */

 import java.io.*;
 import java.util.*;

 public class Exercise11 {
   public static void main(String[] args) throws Exception {
     //Check the input is valid or invalid
     if(args.length != 2){
       System.out.println("Usage: java Exercise11 removeText fileName");
       System.exit(1);
     }
     //Check the file exists or not
     File file = new File(args[1]);
     if(!file.exists()){
       System.out.println("File " + args[1] + " is not exist");
       System.exit(2);
     }
     //Read the file
     ArrayList<String> list = new ArrayList<>();
     try(Scanner input = new Scanner(file);){
       while(input.hasNext()){
         String list2 = input.nextLine();
         //Invoke removeString() method
         list.add(removeString(args[0], list2));
       }
     }
     // Write the file
     try(PrintWriter output = new PrintWriter(file);){
       for(int i = 0; i < list.size(); i++){
         output.println(list.get(i));
       }
     }
   }
   //removeString() method
   public static String removeString(String s, String l){
     StringBuilder sb = new StringBuilder(l);
     int startIndex = sb.indexOf(s);
     int endIndex = s.length();
     while(startIndex >= 0){
       endIndex = startIndex + endIndex;
       sb = sb.delete(startIndex, endIndex);
       startIndex = sb.indexOf(s, startIndex);
     }
     return sb.toString();
   }
 }
