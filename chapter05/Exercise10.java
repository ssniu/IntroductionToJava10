
/**
 * (Find numbers divisible by 5 and 6)
 * Write a program that displays all the numbers
 * from 100 to 1,000, ten per line, that are divisible by 5 and 6. Numbers are
 * separated by exactly one space.
 *
 */

 public class Exercise10{
   public static void main(String[] args){
     int count = 0;//Declare the count of numbers that can be divided by 5 and 6

     System.out.println("All the numbers from 100 to 1,000 that are divisible by 5 & 6:");
     //Find the numbers are divisible by 5 and 6
     for(int i = 100; i <= 1000; i++) {
       if(i % 5 == 0 && i % 6 == 0) {
          count++;
          // 10 numbers per line
          if(count % 10 == 0)
              System.out.println(i);
          else
               System.out.print(i + " ");
    }
   }
 }
}
