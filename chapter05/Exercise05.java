
/**
 * (Conversion from kilograms to pounds and pounds to kilograms)
 * Write a program
 * that displays the following two tables side by side:
 *   Kilograms    Pounds | Pounds    Kilograms
 *    1            2.2   |  20         9.09
 *    3            6.6   |  25        11.36
 *    ...
 *    197          433.4 |  510       231.82
 *    199          437.8 |  515       234.09
 *
 */

 public class Exercise05{
   public static void main(String[] args){
     //Print the header
     System.out.printf("%-12s%6s%5s%11s%16s","Kilograms","Pounds","|","Pounds","Kilograms");
     //Print the table
     for(int i = 1, j = 20; i < 200 && j <= 515; i += 2, j += 5)
         {
          System.out.printf("\n%-10d%8.1f%5s", i, i * 2.2, "|");

          System.out.printf("%5s%-6d%16.2f", " ",j, j * (9.09 / 20));

        }
   }
 }
