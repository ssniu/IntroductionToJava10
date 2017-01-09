/**
 * 461 Hamming distance
 * The Hamming distance between two integers is the number of positions
 * at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 * Note:
 * 0 ≤ x, y < 2^31.
 * Example:
 * Input: x = 1, y = 4
 * Output: 2
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * The above arrows point to positions where the corresponding
 * bits are different.
 *
 */

import java.util.Scanner;

 public class HammingDistance{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.println("Enter two integers:");
   int x = input.nextInt();
   int y = input.nextInt();

   System.out.println("The hamming distance between " + x + " and " + y
      + " is " + hammingDistance(x,y));
   }
   //Integer.bitCount(i) return the number of one-bits
   //x ^ y shows one-bits if two bits are different
   public static int hammingDistance(int x, int y){
      return Integer.bitCount(x ^ y);
   }
 }
