/**
*Pattern A             Pattern B         Pattern C           Pattern D
* 1                     1 2 3 4 5 6       1                   1 2 3 4 5 6
* 1 2                   1 2 3 4 5         2 1                 1 2 3 4 5
* 1 2 3                 1 2 3 4           3 2 1               1 2 3 4
* 1 2 3 4               1 2 3             4 3 2 1             1 2 3
* 1 2 3 4 5             1 2               5 4 3 2 1           1 2
* 1 2 3 4 5 6           1                 6 5 4 3 2 1         1
*/
class Exercise18D{
  public static void main(String[] args){

    int n = 6;
    for(int line = 1; line <= 6; line++){
       //Generate descending numbers
       for(int m = 1; m <= n - line + 1; m++)
         System.out.print(m + " ");
         //Generate spaces
       for(int k = line - 1; k < n ; k++)
         System.out.print("  ");


    System.out.println();
    }

  }
}
