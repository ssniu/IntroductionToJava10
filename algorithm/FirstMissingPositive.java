
/**
 * Given an unsorted integer array, find the first missing positive integer.
 * For example, given [1,2,0] return 3 and [3,4,-1,1] return 2.
 * Your algorithm should run in O(n) time and uses constant space.
 * Analysis
 * This problem can solve by using a bucket-sort like algorithm.
 * Let's consider finding first missing positive and 0 first.
 * The key fact is that the ith element should be i, so we have:
 *                   i==A[i]
 *                 A[i]==A[A[i]]
 * For example, given an array {1,2,0,4}, the algorithm does the following:
 *      index      0  1  2  3
 *       A         1  2  0  4
 *
 */
 
