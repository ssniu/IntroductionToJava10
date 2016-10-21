/**
 * (Math: combinations) Write a program that displays all possible combinations
 * for picking two numbers from integers 1 to 7. Also display the total number of
 * all combinations.
 *
 */

 class Exercise43{
   public static void main(String[] args){
     //Initialize the number of combination
     int count = 0;
     //Display two number from integers 1 to 7
     for(int i = 1; i <= 7; i++){
       for(int j = i + 1; j <= 7; j++){
         System.out.println(i + " " + j);
         //Compute the number of combinations
         count++;
       }
     }
    System.out.println("The total number of all combinations is " + count);
   }
 }
