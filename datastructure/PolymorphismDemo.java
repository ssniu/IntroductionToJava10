class Father{
  public void func1(){
    func2();//f.func2() will invoke the func2() in Child class
  }
  public void func2(){
    System.out.println("AAA");
  }
}

class Child extends Father{
  //New func1() method in Child class
  public void func1(int i){
    System.out.println("BBB");
  }
  @Override
  public void func2(){
    System.out.println("CCC");
  }
}

public class PolymorphismDemo{
  public static void main(String[] args){
    Father f = new Child();
    f.func1();
    //f.func1(8);Got the method can not be found in super class error
  }
}
//The result is CCC
