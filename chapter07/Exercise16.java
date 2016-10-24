/**
 * (Execution time) Write a program that randomly
 * generates an array of 100,000 integers and a key.
 * Estimate the execution time of invoking the linearSearch method
 * in Listing 7.6. Sort the array and estimate the execution time
 * of invoking the binarySearch method in Listing 7.7.
 * You can use the following code template to obtain the execution time:
 *       long startTime = System.currentTimeMillis();  perform the task;
 *       long endTime = System.currentTimeMillis();
 *       long executionTime = endTime - startTime;
 *
 */

 class Exercise16{
   public static void main(String[] args){
     int[] randomList = new int[100000];
     // Generate random number list
     for(int i = 0; i < randomList.length; i++){
        randomList[i] = (int)(Math.random() * 100000 + 1);
      }
     //Generate the random key
     int key = (int)(Math.random() * 100000);
     System.out.print("The key is" + key);
     //Calculate the execution time for linear search
     long startTime = System.currentTimeMillis();
     int searchResult = linearSearch(randomList, key);
     long endTime = System.currentTimeMillis();
     long executionTime = endTime - startTime;
     System.out.println("The time for search by using linearSearch is: "
            + executionTime + "s");
     //Sort the random number list
     selectionSort(randomList);
     //Calculate the execution time for binary search
     startTime = System.currentTimeMillis();
     searchResult = binarySearch(randomList, key);
     endTime = System.currentTimeMillis();
     executionTime = endTime - startTime;
     System.out.println("The time for search by using binarySearch is: "
            + executionTime);
   }
   //Linea search method
   public static int linearSearch(int[] mylist, int key){
     for(int i = 0; i < mylist.length; i++){
       if(key == mylist[i])
         return i;
     }
     return -1;
   }
   //Binary search method
   public static int binarySearch(int[] mylist, int key){
     int low = 0;
     int high = mylist.length - 1;

     while(high > low){
       int mid = (low + high) / 2;
       if(key < mid)
          high = mid - 1;
       else if(key == mid)
          return mid;
       else
          low = mid + 1;
     }
     return -low - 1;
   }
   //Sort the random number list
   public static void selectionSort(int[] list){
     for(int i = 0; i < list.length; i++){
       int min = list[i];
       int minIndex = i;
       for(int j = i + 1; j < list.length; j++){
         if(min > list[j]){
           min = list[j];
           minIndex = j;
         }
         //Swap the minimun number to the first number
         if(minIndex != i){
           list[minIndex] = list[i];
           list[i] = min;
         }
       }
     }
   }


 }
