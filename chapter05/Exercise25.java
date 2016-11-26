
/**
 * (Compute p) You can approximate pi by using the following series:
 * pi = 4(1-1/3+1/5-1/7+1/9-1/11+...+(-1)^(i+1)/(2i-1))
 * Write a program that displays the pi value for i = 10000, 20000, ... and 100000.
 *
 */

 class Exercise25{

   public static void main(String[] args){
     //Compute the PI value
     for(int n = 10000; n <= 100000; n += 10000){
       double sum = 0;
     for(int i = 1; i <= n; i++){
       sum += 4.0 * (Math.pow((-1), (i + 1)) / ( 2 * i - 1));
     }
     System.out.println(sum + " ");
   }
 }
}
