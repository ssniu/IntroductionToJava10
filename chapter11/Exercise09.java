/**
 * (Largest rows and columns)
 * Write a program that randomly fills in 0s and 1s into an n-by-n matrix,
 * prints the matrix, and finds the rows and columns with the
 * most 1s. (Hint: Use two ArrayLists to store the row and column
 * indices with the most 1s.)
 *
 */

 import java.util.Scanner;
 import java.util.ArrayList;

 public class Exercise09{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter the array size n: ");
     Integer n = input.nextInt();

     int[][] arr = new int[n][n];
     //Invoke the fill(), print() methods
     fill(arr);

     print(arr);
     //Output the index of row or column that have most 1's
     System.out.println("The largest row index is :");
    print(largestRow(arr));

     System.out.println("The largest column index is: ");
    print(largestColumn(arr));
   }
   //Fill() method
   public static void fill(int[][] array){
     for(int i = 0; i < array.length; i++){
       for(int j = 0; j < array.length; j++){
         array[i][j] = (int)(Math.random() * 2);
       }
     }
   }
   //Print() array method
   public static void print(int[][] array){
     for(int i = 0; i < array.length; i++){
       for(int j = 0; j < array.length; j++){
         System.out.print(array[i][j] + " ");
       }
       System.out.println();
     }
   }
  //Output the result of ArrayList objects
   public static void print(ArrayList<Integer> list){
     for(int i = 0; i < list.size(); i++){
       System.out.print(list.get(i) + " ");
     }
     System.out.println();
   }
   //Find the max value method
   public static int max(int[] a){
     int max = a[0];
     for(int i = 0; i < a.length; i++){
       if(a[i] > max)
          max = a[i];
     }
     return max;
   }
   //Get the index of row or column
   public static void getIndex(ArrayList<Integer> list, int[] count, int x) {
   		for (int i = 0; i < count.length; i++) {
   			if (count[i] == x)
   				list.add(i);
   		}
   	}
    //Find the row/column that have most 1's
   public static ArrayList<Integer> largestColumn(int[][] array) {
		ArrayList<Integer> index = new ArrayList<>();
		int[] count = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == 1)
					count[j]++;
			}
		}
		int max = max(count);
		getIndex(index, count, max);
		return index;
	}


	public static ArrayList<Integer> largestRow(int[][] array) {
		ArrayList<Integer> index = new ArrayList<>();
		int[] count = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[j][i] == 1)
					count[j]++;
			}
		}
		int max = max(count);
		getIndex(index, count, max);
		return index;
	}
 }
