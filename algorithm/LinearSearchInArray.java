/**
 * Linear search element in an array.
 * The linear search approach compares the key element sequentially with
 * each element in the array, the array can be in any order.
 * It continues to do so until the key matches
 * an element in the array. If no matches, return -1.
 *
 */

 class LinearSearchInArray{
   public static void main(String[] args){
     // Initialize an array, then search specific key
     int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
     int i = linearSearch(list, 4);
     int j = linearSearch(list, -4);
     int k = linearSearch(list, -3);

     System.out.println("The results of search 4, -4 and -3 are " + i + " "
           + j + " " + k);
   }
   //Linear search method
   public static int linearSearch(int[] list, int key){
     //Compare each elements in the array to key
     for(int i = 0; i < list.length; i++){
       if(list[i] == key)
         return i;
     }
     //If key is not in the array, return -1
     return -1;
   }
 }
