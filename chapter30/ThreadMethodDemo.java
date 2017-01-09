//Thread class methods
public class ThreadMethodDemo{
  public static void main(String[] args){
    //Create tasks
    Runnable printA = new PrintChar('a', 100);
    Runnable printB = new PrintChar('b', 100);
    Runnable print100 = new PrintNum(100);
    Runnable print200 = new PrintNum2(100);

    //Create threads
    Thread thread1 = new Thread(printA);
    Thread thread2 = new Thread(printB);
    Thread thread3 = new Thread(print100);
    Thread thread4 = new Thread(print200);

    //Start threads
    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();

    /* Execute the tasks one by one
    thread1.run();
    thread2.run();
    thread3.run();
    */
  }
}

//The task for printing a character a specified number of times
class PrintChar implements Runnable{
  private char charToPrint; // The character to print
  private int times; //The number of times to repeat

  //Construct a task with a specified character and number of times to print the character
  public PrintChar(char c, int t){
    charToPrint = c;
    times = t;
  }

  @Override //override() the run() method
  public void run(){
    for(int i = 0; i < times; i++){
      System.out.print(charToPrint);
    }
  }
}

//The task class for printing numbers from 1 to n for a given n
class PrintNum implements Runnable{
  private int lastNum;
  //Construct a task for printing 1, 2... n
  public PrintNum(int n){
    lastNum = n;
  }
  @Override //Tell the thread how to run
  public void run(){
    for(int i = 1; i <= lastNum; i++){
      System.out.print(" " + i);
      Thread.yield();//Temporaily release time for other threads
    }
  }
}
  //The task class for printing numbers from 1 to n for a given n
  class PrintNum2 implements Runnable{
    private int lastNum2;
    //Construct a task for printing 1, 2... n
    public PrintNum2(int n){
      lastNum2 = n;
    }
    @Override //Tell the thread how to run
    public void run(){
      try{
      for(int i = 100; i <= lastNum2; i++){
        System.out.print(" " + i);
        //Put the thread to sleep for time 1 millis
        if( i >= 150) Thread.sleep(1000);
      }
    }catch(InterruptedException ex){
    }
 }
}
