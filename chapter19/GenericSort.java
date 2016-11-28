public class GenericSort{
  public static void main(String[] args){
    //Create 4 types of array
    Integer[] intArray = { new Integer(2), new Integer(4), new Integer(3)};
    Double[] doubleArray = {new Double(3.4), new Double(1.3), new Double(-22.1)};
    Character[] charArray = {new Character('a'), new Character('J'), new Character('r')};
    String[] stringArray = { "Tom", "Susan", "Kim"};
    //Sort those arrays
    sort(intArray);
    sort(doubleArray);
    sort(charArray);
    sort(stringArray);
    //Invoke the printList() method to print the array
    System.out.print("Sorted array is");
    printList(intArray);
    System.out.print("Sorted array is");
    printList(doubleArray);
    System.out.print("Sorted array is");
    printList(charArray);
    System.out.print("Sorted array is");
    printList(stringArray);
  }
  //Generic sort() method
  public static <E extends Comparable<E>> void sort(E[] list){
    E currentMin;
    int currentMinIndex;

    for(int i = 0; i < list.length; i++){
      //Find the minimum in the list[i+1..list.length-2]
      currentMin = list[i];
      currentMinIndex = i;

      for(int j = i + 1; j < list.length; j++){
        if(currentMin.compareTo(list[j]) > 0){
          currentMin = list[j];
          currentMinIndex = j;
        }
      }
      //Swap list[i] with list[currentMinIndex] if necessary
      if(currentMinIndex != i){
        list[currentMinIndex] = list[i];
        list[i] = currentMin;
      }
    }
  }
  //Print the list result
  public static void printList(Object[] list){
    for(int i = 0; i < list.length; i++){
      System.out.print(list[i] + " ");
    }
    System.out.println();
  }
}
