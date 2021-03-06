
/**
 * Product of array except self
 * Given an array of n integers where n > 1, nums, return an array output
 * such that output[i] is equal to the product of all the elements of nums
 * except nums[i].Solve it without division and in O(n).
 * For example,
 *         given [2, 3, 4, 6],
 *         return [72, 48, 36, 24].
 */
public class ProductExceptSelf{
 public static void main(String[] args){
  int[] arr = {2, 3, 4, 6}; // Initialize the array

   //Declare the arrays
   int[] product = new int[arr.length];
   int[] num1 = new int[arr.length];
   int[] num2 = new int[arr.length];

   //Initialize the first element of num1 and last element of num2
   num1[0] = 1;
   num2[arr.length-1] = 1;

   //Compute the produce of new array num1 from left to right
   for(int i = 0; i < arr.length - 1; i++) {
     num1[i+1] = num1[i] * arr[i];
   }

   //Compute the product of new array num2 from right to left
   for(int i = arr.length - 1; i > 0; i--){
    num2[i-1] = num2[i] * arr[i];
   }

   //Multiply num1 and num2
   for(int i = 0; i < arr.length; i++){
    product[i] = num1[i] * num2[i];
    System.out.print(product[i] + " ");
   }

 }
}
