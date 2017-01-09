/**
 * (Generic bubble sort) Write the following two generic methods
 * using bubble sort. The first method sorts the elements using the
 * Comparable interface and the second uses the Comparator interface.
 *     public static <E extends Comparable<E>> void bubbleSort(E[] list)
 *  public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator)
 *
 */
import java.util.Comparator;

public class GenericBubbleSort<E>{
  public static <E extends Comparable<E>> void bubbleSort(E[] list){
    for(int i = 1; i < list.length; i++){
      for(int j = 0; j < list.length - i; j++){
        if(list[j].compareTo(list[j+1]) > 0){
          E temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }
  }
  //Generic bubbleSort() using comparator
  public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator){
    boolean needNextPass = true;

    for(int i = 1; i < list.length && needNextPass; i++){
      needNextPass = false;
      for(int j = 0; j < list.length - i; j++){
        if(comparator.compare(list[j], list[j + 1]) > 0){
          //Swap the two elements
          E temp = list[j];
          list[j] = list[j + 1];
          list[j + 1] = temp;
        }
      }
    }
  }
  public static <E> void print(E[] list){
    for( E i: list)
       System.out.print(i + " ");

  System.out.println();
  }

  public static void main(String[] args){
    Integer[] list={9, 3, 2, 0, 5, 4, 10};
    Double[] list1 = { 12.3, 2.5, 6.4, 3.0, 8.9, 1.4};
    GenericBubbleSort.bubbleSort(list);
    print(list);
    GenericBubbleSort.bubbleSort(list1);
    print(list1);
  }
}
