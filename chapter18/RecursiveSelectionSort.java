public class RecursiveSelectionSort{
  public static void main(String[] args){
    sort(list, 0, list.length - 1);
  }

  public static void sort(double[] list, int low, int high){
    if(low < high){
      int minIndex = low;
      double min = list[low];
      //Find the min number and its index
      for(int i = low + 1; i <= high; i++){
        if(list[i] < min){
          min = list[i];
          minIndex = i;
        }
      }
      //Swap the min in the list with list[low]
      list[minIndex] = list[low];
      list[low] = min;
      //Sort the remaining list
      sort(list, low + 1, high);
    }
  }
}
