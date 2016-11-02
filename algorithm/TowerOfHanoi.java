/**
 * There are n disks labeled 1, 2, 3, . . . , n
 * and three towers labeled A, B, and C.
 * No disk can be on top of a smaller disk at any time.
 * All the disks are initially placed on tower A.
 * Only one disk can be moved at a time, and
 * it must be the smallest disk on a tower.
 *
 */

 import java.util.Scanner;

 public class TowerOfHanoi{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter number of disks: ");
     int n = input.nextInt();

     //Fidn the solution recursively
     System.out.println("The moves are: ");
     moveDisks(n, 'A', 'B', 'C');
   }
   //moveDisks method
   public static void moveDisks(int n, char fromTower,
       char toTower, char auxTower){
    if(n == 1)
      System.out.println("Move disk " + n +
          " from " + fromTower + " to " + toTower);
    else{
      moveDisks(n - 1, fromTower, auxTower, toTower);
      System.out.println("Move disk " + n + " from "+
           fromTower + " to " + toTower);
      moveDisks(n - 1, auxTower, toTower, fromTower);
    }
  }
}
