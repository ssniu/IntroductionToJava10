/**
 * Binary search is a common search approach. for binary search to work,
 * the elements in the array must already be ordered.
 * Assuming that the array is in ascending order, the binary search first
 * compares the key with the element in the middle of the array.
 * If the key is less than the middle element, need to continue to search for the
 * key in only the first half of the array.
 * If the key is equal to the middle element, the search ends with a match.
 * If the key is greater than the middle element, need to continue to
 * search for the key only in the second half of the array.
 *
 */

 class BinarySearchInArray{
   public static void main(String[] args){
     //Initialize the list array
     int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
     int i = binarySearch(list, 2);
     int j = binarySearch(list, 11);
     int k = binarySearch(list, 12);
     int l = binarySearch(list, 1);
     int m = binarySearch(list, 3);

     System.out.println("The results of search 2, 11, 12, 1, 3 are " + i +
         " " + j + " " + k + " " + l + " " + m);
   }
   //Binary search
   public static int binarySearch(int[] list, int key){
     int low = 0;
     int high = list.length - 1;
     //Set the loop condition
     while(high > low){
       int mid = (low + high) / 2;
       if(key < list[mid])
         high = mid - 1;
       else if(key == mid)
         return mid;
       else
          low = mid + 1;
     }
     return -low -1;
   }
 }
