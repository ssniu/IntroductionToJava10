/**
 * (Count single digits)
 * Write a program that generates 100 random integers between 0 and 9
 * and displays the count for each number.
 * (Hint: Use an array of ten integers, say counts,
 * to store the counts for the number of 0s, 1s, . . . , 9s.)
 *
 */

 class Exercise07{
   public static void main(String[] args){
     //Set two arrays to store the random numbers and the output results
     int[] rand = new int[100];
     int[] counts = new int[10];
     //Generate the array with random numbers
     for(int i = 0; i < 100; i++){
       rand[i] = (int)(Math.random() * 10);
       //Store the number of occurences in counts array
       switch(rand[i]){
         case 0: counts[0]++; break;
         case 1: counts[1]++; break;
         case 2: counts[2]++; break;
         case 3: counts[3]++; break;
         case 4: counts[4]++; break;
         case 5: counts[5]++; break;
         case 6: counts[6]++; break;
         case 7: counts[7]++; break;
         case 8: counts[8]++; break;
         case 9: counts[9]++; break;
       }
     }
     //Output the counts array
     for(int i = 0; i < 10; i++){
       System.out.print(counts[i] + " ");
     }
   }
 }
