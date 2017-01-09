/**
 * (Algebra: perfect square)
 * Write a program that prompts the user to enter
 * an integermandfindthesmallestintegernsuchthatm * nisaperfectsquare.
 * (Hint: Store all smallest factors of m into an array list.
 * n is the product of the factors that appear an odd number of times
 * in the array list. For example, consider m = 90,
 * store the factors 2, 3, 3, 5 in an array list.
 * 2 and 5 appear an odd number of times in the array list. So, n is 10.)
 *
 */

import java.util.*;

public class Exercise17{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer m:");
    int m = input.nextInt();

    ArrayList<Integer> list = new ArrayList<>();

    findFactors(m. list);
    int sm = smallest(list);


    System.out.println("The smallest n for m * n to be a perfect square is " + sm);
    System.out.println("m * n is " + m * sm);
  }
  public static ArrayList<Integer> 
}
