public class RecursiveSelectionSort{
  public static int reBS(int[] list, int key){
    int low = 0;
    int high = list.length - 1;
    return reBS(list, key, low, high);
  }
  //Helper method
  private static int reBS(int[] list, int key, int low, int high){
    if(low > high)
       return -low-1;

    int min = (low + high) / 2;
    if( key > list[mid])
       return reBS(list, key, mid + 1, high);
    else if(key == list[mid])
       return mid;
    else
       return reBS(list, key, low, mid - 1);
  }
}
