/**
 * (Use the Random class) Write a program that creates a Random object with seed
 * 1000 and displays the first 50 random integers between 0 and 100 using the
 * nextInt(100) method.
 *
 */

 public class Exercise04{
   public static void main(String[] args){
     // New object called rand of Random class
     java.util.Random rand = new java.util.Random(1000);
    // Output 10 numbers per line
     for(int i = 1; i <= 50; i++){
       if(i % 10 != 0)
           System.out.printf("%5d", rand.nextInt(100));
       else
           System.out.printf("%5d\n", rand.nextInt(100));
     }
   }
 }
