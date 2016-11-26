
/**
 * (Conversion from miles to kilometers)
 * Write a program that displays the following two tables side by side:
 *     Miles     Kilometers   |  Kilometers     Miles
 *     1         1.609        |  20             12.430
 *     2         3.218        |  25             15.538
 *     ...
 *     9         14.481       |  60             37.290
 *     10        16.090       |  65             40.398
 *
 */

 public class Exercise06{
   public static void main(String[] args){
     //Print the header
     System.out.printf("%-10s%10s%6s%13s%10s","Miles","Kilometers","|","Kilometers","Miles");
     //Print the table
     for(int i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5){
       System.out.printf("\n%-10d%-8.3f%8s", i, i * 1.609,"|");
       System.out.printf("%3s%-8d%13.3f\n", " ",j, j * (12.430 / 20));
     }
   }
 }
