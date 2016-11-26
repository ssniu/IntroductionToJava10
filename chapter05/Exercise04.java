
/**
 * (Conversion from miles to kilometers) Write a program that displays the following
 * table (note that 1 mile is 1.609 kilometers):
 *     Miles       Kilometers
 *      1          1.609
 *      2          3.218
 *      ...
 *      9          14.481
 *      10         16.090
 *
 */

 public class Exercise04{
   public static void main(String[] args){
     System.out.printf("%-10s %10s","Miles","Kilometers");//Print the header
     //Create the table
     for(int i = 1; i < 11; i++){
       System.out.printf("\n%-11d%-10.3f", i, i * 1.609);
     }
   }
 }
