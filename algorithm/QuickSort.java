/**
 * A quick sort works as follows:
 * The algorithm selects an element, called the pivot,
 * in the array. It divides the array into two parts,
 * so that all the elements in the first part are less than
 * or equal to the pivot and all the elements in the second
 * part are greater than the pivot. The quick sort algorithm
 * is then recursively applied to the first part and
 * then the second part.
 *
 */

 public class QuickSort{
   public static void quickSort(int[] list){
     quickSort(list, 0, list.length - 1);
   }

   public static void quickSort(int[] list, int first, int last){
      if(last > first){
        int pivotIndex = partition(list, first, last);
        quickSort(list, first, pivotIndex - 1);
        quickSort(list, pivotIndex + 1, last);
      }
   }

   //Partition the array list[first .. last]
   public static int partition(int[] list, int first, int last){
     int pivot = list[first];//Choose the first element as pivot
     int low = first + 1;//Index for forward search
     int high = last;//Index for backward search

     while(high > low){
       //Search forward from left
       while(low <= high && list[low] <= pivot)
          low++;

      //Search backward from right
      while(low <= high && list[high] > pivot)
          high--;

      //Swap two elements in the list
      if(high > low){
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
      }
     }

     while(high > first && list[high] >= pivot)
         high--;

     //Swap pivot with list[high]
     if(pivot > list[high]){
       list[first] = list[high];
       list[high] = pivot;
       return high;
     }
     else {
        return first;
     }
   }

   public static void main(String[] args){
     int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
     quickSort(list);
     for(int i : list)
        System.out.print(i + " ");
   }
 }
//Time complexity: T(n) = 2(T(n/2)) + n
//Time complexity is O(nlogn)
