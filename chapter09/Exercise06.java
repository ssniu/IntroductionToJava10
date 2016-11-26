/**
 * (Stopwatch) Design a class named StopWatch. The class contains:
 * ■ Private data fields startTime and endTime with getter methods.
 * ■ A no-arg constructor that initializes startTime with the current time.
 * ■ A method named start() that resets the startTime to the current time.
 * ■ A method named stop() that sets the endTime to the current time.
 * ■ A method named getElapsedTime() that returns the elapsed time for the
 * stopwatch in milliseconds.
 * Draw the UML diagram for the class and then implement the class. Write a test
 * program that measures the execution time of sorting 100,000 numbers using
 * selection sort.
 *
 */

 /**
  *     UML                      *
  *      StopWatch               *
  *------------------------------*
  *-startTime: long              *
  *-endTime: long                *
  *+StopWatch()                  *
  *+start()                      *
  *+stop()                       *
  *+getElapsedTime()             *
  ********************************/


  public class Exercise06{
    public static void main(String[] args){
      //New object of StopWatch class
    StopWatch stopWatch = new StopWatch();
    //Invoke the methods of StopWatch
    int[] array = getArray();
    stopWatch.start();
    selectionSort(array);
    stopWatch.stop();
    //Output the elapse time
    System.out.println("The exection time is: " + stopWatch.getElapsedTime());
  }
  //Get an array that has 100000 elements
  public static int[] getArray(){
    int[] array = new int[100000];
    for(int i = 0; i < array.length; i++){
      array[i] = (int)(Math.random() * 100000);
    }
    return array;
  }
  //Selection sort method to sort 100000 elements in an array
  public static void selectionSort(int[] array){
    for(int i = 0; i < array.length; i++){
      int minNumber = array[i];
      int minIndex = i;

      for(int j = i + 1; j < array.length; j++){
        if(array[j] < minNumber){
          minNumber = array[j];
          minIndex = j;
        }
      }

      if( i != minIndex){
        array[minIndex] = array[i];
        array[i] = minNumber;
      }
    }
  }
}

  class StopWatch{
    // Declare two variables
    private long startTime;
    private long endTime;
    // No-arg constructor to initializes startTime with the current time
    StopWatch(){
      startTime = System.currentTimeMillis();
    }
    // Start, stop and getElapsedTime methods
    public void start(){
      startTime = System.currentTimeMillis();
    }

    public void stop(){
      endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
      return (endTime - startTime);
    }
    // Get startTime and endTime, make the private date public access
    public long getStartTime(){
      return startTime;
    }

    public long getEndTime(){
      return endTime;
    }
  }
