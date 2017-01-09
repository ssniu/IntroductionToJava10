/**
 * The merge sort algorithm can be described recursively as follows:
 * The algorithm divides the array into two halves and applies a merge
 * sort on each half recursively. After the two halves are sorted, merge them.
 *
 */

 public class MergeSort{
   public static void mergeSort(int[] list){
     if(list.length > 1){
       //Merge the first half
       int[] firstHalf = new int[list.length / 2];
       System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
       mergeSort(firstHalf);
       //Merge the second half
       int secondHalfLength = list.length - list.length / 2;
       int[] secondHalf = new int[secondHalfLength];
       System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
       mergeSort(secondHalf);

       //Merge firstHalf with secondHalf into list
       merge(firstHalf, secondHalf, list);
     }
   }

   //Merge two sorted lists
   public static void merge(int[] list1, int[] list2, int[] temp){
     //Current index in three lists
     int current1 = 0;
     int current2 = 0;
     int current3 = 0;

     while(current1 < list1.length && current2 < list2.length){
       if(list1[current1] < list2[current2])
          temp[current3++] = list1[current1++];
       else
          temp[current3++] = list2[current2++];
     }
     //Rest of the list1 to temp
     while(current1 < list1.length)
        temp[current3++] = list1[current1++];
        //Rest of the list2 to temp
     while(current2 < list2.length)
        temp[current3++] = list2[current2++];
   }

   public static void main(String[] args){
     int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
     mergeSort(list);
     for(int i : list)
        System.out.print(i + " ");
   }
 }
//Time complexity: (n - 1) to compare the elements from the two subarrays
// n moves to move elements to temporary array
//Time complexity: O(nlogn)
