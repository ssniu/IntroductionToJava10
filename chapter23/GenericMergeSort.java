/**
 * (Generic merge sort) Write the following two generic methods using merge sort.
 * The first method sorts the elements using the Comparable interface and the
 * second uses the Comparator interface.
 * public static <E extends Comparable<E>>
 * void mergeSort(E[] list)
 * public static <E> void mergeSort(E[] list,
 * Comparator<? super E> comparator)
 *
 */

 import java.util.Comparator;
 import java.util.Arrays;

 public class GenericMergeSort{
   public static <E extends Comparable<E>> void mergeSort(E[] list){
     if(list.length > 1){
       //Merge sort the first half
       E[] firstHalf = (E[])(new Comparable[list.length / 2]);
       System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
       mergeSort(firstHalf);

       //mergeSort the second half
       int secondHalfLength = list.length - list.length / 2;
       E[] secondHalf = (E[])(new Comparable[secondHalfLength]);
       System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
       mergeSort(secondHalf);

       //Merge firstHalf with secondHalf into list
       merge(firstHalf, secondHalf, list);
     }
   }

   //Merge() method
   public static <E extends Comparable<E>> void merge(E[] list1, E[] list2, E[] list){
     int current1 = 0;
     int current2 = 0;
     int current = 0;

     while(current1 < list1.length && current2 < list2.length){
       if(list1[current1].compareTo(list2[current2]) < 0)
           list[current++] = list1[current1++];
       else
           list[current++] = list2[current2++];
     }
     while(current1 < list1.length)
        list[current++] = list1[current1++];
     while(current2 < list2.length)
        list[current++] = list2[current2++];
   }

   public static <E> void mergeSort(E[] list, Comparator<? super E> comparator){
     if(list.length > 1){
       //Mergesort the first half array
       E[] firstHalf = Arrays.copyOf(list, list.length / 2);
       mergeSort(firstHalf, comparator);

       E[] secondHalf = Arrays.copyOfRange(list, list.length / 2, list.length);
       mergeSort(secondHalf, comparator);

       merge(firstHalf, secondHalf, list, comparator);
     }
   }

   public static <E> void merge(E[] list1, E[] list2, E[] list, Comparator<? super E> comparator){
     int current1 = 0;
     int current2 = 0;
     int current = 0;

     while(current1 < list1.length && current2 < list2.length){
       if(comparator.compare(list1[current1], list2[current2]) < 0)
          list[current++] = list1[current1++];
       else
          list[current++] = list2[current2++];
     }
     while(current1 < list1.length)
        list[current++] = list1[current1++];
     while(current2 < list2.length)
        list[current++] = list2[current2++];
   }

   public static <E> void print(E[] list){
     for( E i: list)
        System.out.print(i + " ");

   System.out.println();
   }

   public static void main(String[] args){
     Integer[] arr1 = {7, 1, 5, 2, 3, 4, -5, 6};
     Double[] arr2 = {1.5, 2.5, 9.4, -2.4, 7.6};
     Character[] arr3 = {'z', 'a','g', 'm', 'c', 't'};
     String[] arr4 = {"abc", "hjg", "hgo", "java", "python"};

     GenericMergeSort.mergeSort(arr1);
     GenericMergeSort.mergeSort(arr2);
     GenericMergeSort.mergeSort(arr3);
     GenericMergeSort.mergeSort(arr4);

     GenericMergeSort.print(arr1);
     GenericMergeSort.print(arr2);
     GenericMergeSort.print(arr3);
     GenericMergeSort.print(arr4);

   }
 }
