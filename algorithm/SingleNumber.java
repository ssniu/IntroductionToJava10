/**
 * 136 Single number
 * Given an array of integers,
 * every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 *
 */

 public class SingleNumber{
   public static void main(String[] args){
     int[] a = {1, 2, 5, 6, 4, 4, 1, 2, 5};
     System.out.println("The integer " + singleNumber(a) + " appears once");
   }

   public static int singleNumber(int[] a){
     int result = 0;
     for(int i : a)
        result ^= i;//XOR the same integer twice, the value of result is the non-duplicated integer

   return result;
  }
 }
