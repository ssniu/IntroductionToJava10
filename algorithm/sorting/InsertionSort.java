/**
 * The insertion-sort algorithm sorts a list of values by
 * repeatedly inserting a new element into a sorted sublist
 * until the whole list is sorted.
 *
 */

 public class InsertionSort{

   public static void insertionSort(int[] list){
     for(int i = 1; i < list.length; i++){
       int currentElement = list[i];
       int k;
       for(k = i - 1; k >= 0 && list[k] > currentElement; k--){
         list[k + 1] = list[k];

       }
       list[k + 1] = currentElement;
     }
     for(int i = 0; i < list.length; i++)
       System.out.print(list[i] + " ");
   }

   public static void main(String[] args){
     int[] list = {1, 9, 4, 6, 5, -4};
     InsertionSort.insertionSort(list);

   }
 }
