/**
 * Find the smallest element in the list and swap it with the first element
 * Ignore the first element and sort the remaining smaller list recrusively
 *
 */

 public class RecursiveSelectionSort{
   public static void sort(double[] list){
     //Sort the entire list
     sort(list, 0, list.length - 1);
   }

   private static void sort(double[] list, int low, int high){
     if(low < high){
       int indexOfMin = low;
       double min = list[low];
       //Find the smallest one and its index
       for(int i = low + 1; i <= high; i++){
         if(list[i] < min){
           min = list[i];
           indexOfMin = i;
         }
       }

      //Swap the smallest in list[low .. high] with list[low]
      list[indexOfMin] = list[low];
      list[low] = min;

      sort(list, low + 1, high);
     }
   }

   public static void main(String[] args){
     double[] list1 = {25.0, 35.0, 23.1, 42.6, 16.5, 28.9};
     sort(list1);
     //Output the double array
     for(double e: list1)
       System.out.println(e + " ");
   }
 }
