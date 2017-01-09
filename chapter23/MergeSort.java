//MergeSort:divides the array into two halves and applies a merge sort on each half
// recursively, after the two halves are sorted, merge them
//O(nlgn)
public class MergeSort{
  public static void mergeSort(int[] list){
    if(list.length > 1){
      //Merge the first half
      int[] firstHalf = new int[list.length / 2];
      //arraycopy(src, srcpos, dest, destpos, length)
      System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
      mergeSort(firstHalf);

      //Merge the second half
      int secondHalfLength = list.length - list.length / 2;
      int[] secondHalf = new int[secondHalfLength];
      System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength);
      mergeSort(secondHalf);

      merge(firstHalf,secondHalf, list);
    }
  }
  //Merge two sorted list
  public static void merge(int[] list1, int[] list2, int[] list){
    int current1 = 0;
    int current2 = 0;
     int current = 0;
    //Move one of the lists into list
     while(current1 < list1.length && current2 < list2.length){
       if(list1[current1] < list2[current2])
         list[current++] = list1[current1++];
       else
         list[current++] = list2[current2++];
     }
    //Move the left elements from those two lists into list
     while(current1 < list1.length)
        list[current++] = list1[current1++];
     while(current2 < list2.length)
        list[current++] = list2[current2++];
  }

  public static void main(String[] args){
    int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    mergeSort(list);
    for(int i = 0; i < list.length; i++)
       System.out.print(list[i] + " ");
  }
}
