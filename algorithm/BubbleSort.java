/**
 * A bubble sort sorts the array in multiple phases.
 * Each pass successively swaps the neighboring elements
 * if the elements are not in order.
 *
 */

 public class BubbleSort{
   public static void bubbleSort(int[] list){
     boolean needNextPass = true;

     for(int k = 1; k < list.length && needNextPass; k++){
       //Array may be sorted and next pass not needed
       needNextPass = false;
       for(int i = 0; i < list.length - k; i++){
         if(list[i] > list[i + 1]){
           //Swap list[i] with list[i + 1]
           int temp = list[i];
           list[i] = list[i + 1];
           list[i + 1] = temp;

           needNextPass = true;
         }
       }
     }
   }

   //A test method
   public static void main(String[] args){
     int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
     bubbleSort(list);
     for(int i : list)
        System.out.print(i + " ");
   }
 }
 //Time complexity is O(n^2)
