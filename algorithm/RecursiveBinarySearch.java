/**
 * If the key is less than the middle element, recursively search for the
 * key in the first half of the array.
 * If the key is equal to the middle element, the search ends with a match
 * If the key is greater than the middle element, recursively search
 * for the key in the second half of the array
 *
 */

 public class RecursiveBinarySearch{
   //RecursiveBinarySearch method to sort the array
   public static int RecursiveBinarySearch(int[] list, int key){
     int low = 0;
     int high = list.length - 1;
     return RecursiveBinarySearch(list, key, low, high);
   }
   //Sort the array in the half of array
   private static int RecursiveBinarySearch(int[] list, int key,
        int low, int high){
      if(low > high)
          return -low-1;
   
      int mid = (low + high) / 2;
      if(key < list[mid])
          return RecursiveBinarySearch(list, key, low, mid - 1);
      else if(key == list[mid])
          return mid;
      else
          return RecursiveBinarySearch(list, key, mid + 1, high);
        }

    public static void main(String[] args){
      int[] str = {4, 8, 2, 1, 3, 5, 9, 7, 6, 12, 10, 23};

      System.out.println(RecursiveBinarySearch(str, 7));

    }
 }
