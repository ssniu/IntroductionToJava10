import java.util.Scanner;

public class QuotientException{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter two numbers:");
    int num1 = input.nextInt();
    int num2 = input.nextInt();

    try{
      int result = quotient(num1, num2);
      System.out.println("The result is" + result);
    } catch(ArithmeticException e){
      System.out.println("Divisor can not be zero");
    }
    System.out.println("Excution continues ...");
  }

  public static int quotient(int n1, int n2){
    if(n2 == 0)
      throw new ArithmeticException("Divisor can not be zero");

    return n1 / n2;
  }
}
