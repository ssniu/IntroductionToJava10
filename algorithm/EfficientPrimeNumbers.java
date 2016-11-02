import java.util.Scanner;

public class EfficientPrimeNumbers{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Find all prime numbers <= n, enter n: ");
    int n = input.nextInt();

    java.util.List<Integer> list = new java.util.ArrayList<>();

    final int NUMBER_PER_LINE = 10;
    int count = 0;
    int number = 2;
    int squareRoot = 1;

    System.out.println("The prime numbers are \n");

    //Repeatly find prime numbers
    while(number <= n){
      //Assume the number is prime
      boolean isPrime = true;

      if(squareRoot * squareRoot < number) squareRoot++;

      //Test whether number is prime
      for(int k = 0; k < list.size() && list.get(k) <= squareRoot; k++){
        if(number % list.get(k) == 0){
          isPrime = false;
          break;
        }
      }
      //Print the prime number and increase the count
      if(isPrime){
        count++;
        list.add(number);
        if(count % NUMBER_PER_LINE == 0){
          System.out.println(number);
        }
        else
          System.out.print(number + " ");
      }

      //Check whether the next number is prime
      number++;
    }
    System.out.println("\n" + count + " prime(s) less than or equal to " + n);
  }
}
