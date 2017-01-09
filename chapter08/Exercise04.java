/**
 * (Compute the weekly hours for each employee)
 * Suppose the weekly hours for all employees are stored in a
 * two-dimensional array. Each row records an employee’s
 * seven-day work hours with seven columns. For example, the following
 * array stores the work hours for eight employees.
 * Write a program that displays employees and their total hours
 * in decreasing order of the total hours.
 *
 */

public class Exercise04{
  public static void main(String[] args){
    //Enter the information of 2D array
    System.out.printf("%15s%6s%6s%6s%6s%6s%6s\n","Su","M","T", "W","Th","F","Sa");
    int[][] weeklyHour = {
      {2, 4, 3, 4, 5, 8, 8},
      {7, 3, 4, 3, 3, 4, 4},
      {3, 3, 4, 3, 3, 2, 2},
      {9, 3, 4, 7, 3, 4, 1},
      {3, 5, 4, 3, 6, 3, 8},
      {3, 4, 4, 6, 3, 4, 4},
      {3, 7, 4, 8, 3, 8, 4},
      {6, 3, 5, 9, 2, 7, 9}
    };
    //Output the 2D array
    for(int i = 0; i < weeklyHour.length; i++){
      System.out.print("Employee" + i);
      for(int j = 0; j < weeklyHour[0].length; j++){
      System.out.printf("%6d",weeklyHour[i][j]);
    }
    System.out.println();
   }
   //Invoke sum(),selectionSort() and print() methods
   int[][] sum = sum(weeklyHour);
   selectionSort(sum);
   print(sum);
  }
 //sum() method to calculate the total weekly hours
  public static int[][] sum(int[][] arr){
    int[][] sum = new int[arr.length][2];
    for(int i = 0; i < arr.length; i++){
      sum[i][0] = i;
      sum[i][1] = 0;
     for(int j = 0; j < arr[i].length; j++){
       sum[i][1] += arr[i][j];
     }
   }
   return sum;
  }
  //selectionSort() method to sort the total weekly hours in descending way
  public static void selectionSort(int[][] sum){
    for(int i = 0; i < sum.length; i++){
      int max0 = sum[i][0];
      int max1 = sum[i][1];
      int index = i;
      for(int j = i + 1; j < sum.length; j++){
      if(max1 < sum[j][1]){
        max1 = sum[j][1];
        max0 = sum[j][0];
        index = j;
      }
    }
      if(index != i){
        sum[index][1] = sum[i][1];
        sum[index][0] = sum[i][0];
        sum[i][1] = max1;
        sum[i][0] = max0;
      }
    }
  }
 //print() method to output the result in 2D array
  public static void print(int[][] arr){
    System.out.printf("%10s%20s\n", "Employee", "Total Weekly Hours");
    for(int i = 0; i < arr.length; i++){
      System.out.printf("%4d%16d\n", arr[i][0],arr[i][1]);
    }
  }
}
