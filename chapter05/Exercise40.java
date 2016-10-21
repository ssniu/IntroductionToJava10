/**
 * (Simulation: heads or tails)
 * Write a program that simulates flipping a coin one
 * million times and displays the number of heads and tails.
 *
 */

 import java.util.Random;

 class Exercise40{
   public static void main(String[] args){
     // Create new Random object
     Random rand = new Random();
     //Initialize the number of heads / tails to 0
     int tails = 0;
     int heads = 0;
     // Run 1 million times for random boolean
     for(int j = 0; j < 1000000000; j++){
       boolean i = rand.nextBoolean();
       //Count the number of heads if i is true
       if(i)
         heads++;
       else
         tails++;
     }
     System.out.println("The number of tails is: " + tails + " and number of heads is: " +
        heads);
   }
 }
