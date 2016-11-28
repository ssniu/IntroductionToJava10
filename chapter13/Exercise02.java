/**
 * (Shuffle ArrayList)
 * Write the following method that shuffles an ArrayList of numbers:
 * public static void shuffle(ArrayList<Number> list)
 *
 */

 import java.util.*;

 public class Exercise02{
   //Shuffle() method
   public static void shuffle(ArrayList<Number> list){
     java.util.Collections.shuffle(list);
   }

   public static void main(String[] args){
     //Add elements in the ArrayList
     ArrayList<Number> list = new ArrayList<>();
     list.add(32);
     list.add(25.6);
     list.add(12);
     list.add(43);
     list.add(75.9);

     shuffle(list);
     System.out.println(list.toString());
   }
 }
