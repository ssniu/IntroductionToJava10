public class Test implements Runnable{
  public static void main(String[] args){
    new Test();
  }
  public Test(){
    //Test task = new Test(); should delete this statement
    new Thread(this).start();
  }
  public void run(){
    System.out.println("test");
  }

  /*public Test(){
    Thread t = new Thread(this);
    t.start();
    //t.start(); should delete this start() method
  }
  public void run(){
    System.out.println("test");
  }*/
}
