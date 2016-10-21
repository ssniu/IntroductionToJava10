/**
 * (Financial application: find the sales amount)
 * You have just started a sales job
 * in a department store. Your pay consists of a base salary
 * and a commission. The base salary is $5,000.
 * The scheme shown below is used to determine the commission rate.
 *
 *     Sales Amount          Commission Rate
 *      $0.01–$5,000           8 percent
 *      $5,000.01–$10,000      10 percent
 *      $10,000.01 and above   12 percent
 * Note that this is a graduated rate. The rate for the first $5,000 is
 * at 8%, the next $5000 is at 10%, and the rest is at 12%.
 * If the sales amount is 25,000, the commission is
 * 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
 * Your goal is to earn $30,000 a year.
 * Write a program that finds the minimum sales you have to
 * generate in order to make $30,000.
 *
 */

 class Exercise39{
   public static void main(String[] args){
     // Set the total salary to be a constant
     final double COMMISSION = 30000;
     double salesAmount = 0;
     double commission = 0;
     double balance = 0;
     //Do while loop to compute the commission
     do{
       salesAmount += 0.01;
       if(salesAmount > 10000){
         balance = salesAmount - 10000;
         commission = balance * 0.12;
       }
       else if(salesAmount > 5000){
         balance -= 5000;
         commission += balance * 0.10;

       }
        else if(salesAmount > 0)
         commission += balance * 0.08;
     }while(commission < COMMISSION);

     System.out.printf("You have to make minimum sales 30000 is %.2f \n", (salesAmount - 5000));

   }
 }
