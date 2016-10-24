/**
 * Selection sort finds the smallest number in the list, swap it with the
 * first element. It then finds the smallest number remaining and swaps it
 * with the second element, and so on.
 *
 */

 class SelectionSortArray{
   public static void main(String[] args){
     //Initialize the array
     double[] list = {1, 9, 4.5, 5.7, -4.5};
     selectionSort(list);//Invoke selectionSort method
   }
   //Selection sort method
   public static void selectionSort(double[] list){
     for(int i = 0; i < list.length - 1; i++){
       double currentMin = list[i];
       int currentMinIndex = i;
       //Compare the elements with each letter that remaining
       for(int j = i + 1; j < list.length; j++){
         if(currentMin > list[j]){
           currentMin = list[j];
           currentMinIndex = j;
         }
      }
       if(currentMinIndex != 1){
         list[currentMinIndex] = list[i];
         list[i] = currentMin;
       }
     }
     //Output the result
     for(int m = 0; m < list.length; m++)
       System.out.print(list[m] + " ");
   }
 }
