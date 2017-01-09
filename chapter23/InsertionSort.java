public class InsertionSort{
  public static void insertionSort(int[] list){
    for(int i = 1; i < list.length; i++){
      int currentElement = list[i];//Make the current element from the second element
      int k;
      //insert the currentElement to the list[0..i-1]
      for(k = i - 1; k >= 0 && list[k] > currentElement; k--){
        list[k + 1] = list[k];
      }
      // Set currentElement to be the 
      list[k + 1] = currentElement;
    }
  }
  public static void main(String[] args){
    int[] list = {1, 8, 9, 4, 6, 5, -4};
    InsertionSort.insertionSort(list);
    for(int i : list)
      System.out.print(i + " ");
  }
}
