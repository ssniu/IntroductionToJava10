/**
 * (Sort ArrayList)
 * Write the following method that sorts an ArrayList of numbers.
 * public static void sort(ArrayList<Number> list)
 *
 */

 import java.util.*;

 public class Exercise03{
   public static void main(String[] args){
     ArrayList<Number> list = new ArrayList<>();
     list.add(2);
     list.add(32);
     list.add(35.6);
     list.add(24.3);
     //Invoke the sort() method
     sort(list);
     System.out.println("The sorted list is " + list.toString());
   }

   public static void sort(ArrayList<Number> list){
		for (int i = 0; i < list.size() - 1; i++) {
			//Find the mimimum number
			Number min = list.get(i);
			int minIndex = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					minIndex = j;
				}
			}

			//Swap list.get(i) with list.get(minIndex) if necessary
			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			}
		}
   }
 }
