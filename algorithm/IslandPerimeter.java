/*
 * You are given a map in form of a two-dimensional integer grid
 * where 1 represents land and 0 represents water.
 * Grid cells are connected horizontally/vertically (not diagonally).
 * The grid is completely surrounded by water, and
 * there is exactly one island (i.e., one or more connected land cells).
 * The island doesn't have "lakes" (water inside that isn't connected to
 * the water around the island). One cell is a square with side length 1.
 * The grid is rectangular, width and height don't exceed 100.
 * Determine the perimeter of the island.
 *
 */

 public class IslandPerimeter{
   public static void main(String[] args){
     int[][] arr = { {0, 1, 0, 0},
                      {1, 1, 1, 0},
                      {0, 1, 0, 0},
                      {1, 1, 0, 0}
                  };
    System.out.println("Answer is " + islandPerimeter(arr));
   }
   //islandPerimeter() method to compute the result
   public static int islandPerimeter(int[][] arr){
     int count = 0;
     int island = 0;
     //Find the number of island, and number of neighbours
     for(int i = 0; i < arr.length; i++){
       for(int j = 0; j < arr[0].length; j++){
         if(arr[i][j] == 1){
           island++;
           //Find the number of neighbours
           if(i < arr.length - 1 && arr[i+1][j] == 1) count++;
           if(j < arr[i].length - 1 && arr[i][j+1] == 1) count++;
         }
       }
     }
     //Compute the result by using island * 4 - neighbours * 2
     return island * 4 - count * 2;
   }
 }
