/**
 * A heap sort uses a binary heap. It first adds all the elements
 * to a heap and then removes the largest elements successively to obtain
 * a sorted list.
 * A binary heap is a binary tree with the following properties:
 *       Shape property: it is a complete binary tree
 *       Heap property: Each node is greater than or equal
 *    to any of its children
 *
 */

 class Heap<E extends Comparable<E>>{
   private java.util.ArrayList<E> list = new java.util.ArrayList<>();

   //Create a default heap
   public Heap(){

   }

   //Create a heap from an array of objects
   public Heap(E[] objects){
     for(int i = 0; i < objects.length; i++)
        add(objects[i]);
   }

   //Add a new object into the heap
   public void add(E newObject){
     list.add(newObject);//Append to the heap
     int currentIndex = list.size() - 1; //The index of the last node

     while(currentIndex > 0){
       int parentIndex = (currentIndex - 1) / 2;
       //Swap if the current object is greater than its parent
       if(list.get(currentIndex).compareTo(
           list.get(parentIndex)) > 0){
             E temp = list.get(currentIndex);
             list.set(currentIndex, list.get(parentIndex));
             list.set(parentIndex, temp);
           }
        else
           break;//The tree is a heap now

        currentIndex = parentIndex;
     }
   }

   //Remove the root from the heap
   public E remove(){
     if(list.size() == 0) return null;

     E removeObject = list.get(0);
     list.set(0, list.get(list.size() - 1));
     list.remove(list.size() - 1);

     int currentIndex = 0;
     while(currentIndex < list.size()){
       int leftChildIndex = 2 * currentIndex + 1;
       int rightChildIndex = 2 * currentIndex + 2;

       //Find the maximum between two children
       if(leftChildIndex >= list.size()) break; // The tree is a heap
       int maxIndex = leftChildIndex;
       if(rightChildIndex < list.size()){
         if(list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0){
           maxIndex = rightChildIndex;
         }
       }

       //Swap if the current node is less than the maximum
       if(list.get(currentIndex).compareTo(list.get(maxIndex)) < 0){
         E temp = list.get(maxIndex);
         list.set(maxIndex, list.get(currentIndex));
         list.set(currentIndex, temp);
         currentIndex = maxIndex;
       }
       else
          break;//The tree is a heap
     }
     return removeObject;
   }

   public int getSize(){
     return list.size();
   }
 }

 public class HeapSort{
   public static <E extends Comparable<E>> void HeapSort(E[] list){
     //Create a heap of integers
     Heap<E> heap = new Heap<>();
     //Add elements to the heap
     for(int i = 0; i < list.length; i++)
        heap.add(list[i]);

     //Remove elements from the heap
     for(int i = list.length - 1; i >= 0; i--)
       list[i] = heap.remove();
   }

   public static void main(String[] args){
     Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
     HeapSort(list);
     for(int i = 0; i < list.length; i++)
        System.out.print(list[i] + " ");
   }
 }
 //Constructing an initial heap is O(logn), remove method is invoked n times
 //Time complexity is O(nlogn)
 //Merge sort and heap sort both require O(nlogn) time, merge sort needs
 //more spaces than heap sort.      
