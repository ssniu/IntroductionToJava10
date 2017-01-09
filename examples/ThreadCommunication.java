class Producer implements Runnable {
  P q = null;

  public Producer(P q){
    this.q = q;
  }
  public void run(){
    int i = 0;
    while(true){
      if(i == 0){
        q.set("John", "male");
      }
      else {
        q.set("Mary", "female");
      }
      i = (i + 1) % 2;
    }
  }
}

class P {
  private String name = "Mary";
  private String gender = "female";
  boolean bFull = false;
  public synchronized void set(String name, String gender){
    if(bFull){
      try{
        wait();
      }catch(InterruptedException e){}
    }
    this.name = name;
    try{
      Thread.sleep(10);
    }catch(Exception e){
      System.out.println(e.getMessage());
    }
    this.gender = gender;
    bFull = true;
    notify();
  }
  public synchronized void get(){
    if(!bFull){
      try{
        wait();
      }catch(InterruptedException e){}
    }
    System.out.println(name + " --->" + gender);
    bFull = false;
    notify();
  }
}

class Consumer implements Runnable {
  P q = null;
  public Consumer(P q){
    this.q = q;
  }
  public void run(){
    while(true){
      q.get();
    }
  }
}

public class ThreadCommunication{
  public static void main(String[] args){
    P q = new P();
    new Thread(new Producer(q)).start();
    new Thread(new Consumer(q)).start();
    
  }
}
