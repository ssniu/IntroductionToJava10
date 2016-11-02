//GDC Euclid Algorithm
import java.util.Scanner;

public class GCDEuclid{
  //GCD method
  public static int gcd(int m, int n){
    if(m % n == 0)
       return n;
    else
       return gcd(n, m % n);//Invoke the gcd method 
  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter two integers: ");
    int m = input.nextInt();
    int n = input.nextInt();

    System.out.println("The gcd of those two numbers: " + m + " " + n
         + " is " + gcd(m, n));
  }
}
