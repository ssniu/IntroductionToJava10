/**
 * (Statistics: compute mean and standard deviation)
 * In business applications, you are often asked to compute
 * the mean and standard deviation of data. The mean is
 * simply the average of the numbers. The standard deviation is a statistic that tells
 * you how tightly all the various data are clustered around the mean in a set of data.
 * For example, what is the average age of the students in a class?
 * How close are the ages? If all the students are the same age, the deviation is 0.
 * Write a program that prompts the user to enter ten numbers, and displays the
 * mean and standard deviations of these numbers using the following formula:
 *
 */

 import java.util.Scanner;

 class Exercise45{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Ask user enter the ten numbers
     System.out.print("Enter ten numbers: ");
     double total = 0;
     double mean = 0;
     double dev1 = 0;
     double dev = 0;
     // Input the 10 numbers
     for(int i = 0; i < 10; i++){
        double x = input.nextDouble();
        total += x;
        dev1 += x * x;
    }
    //Compute the mean and deviation
    mean = total / 10;
    dev = Math.pow((dev1 - total * total / 10) / (10 - 1), 0.5);
    System.out.println("The mean is " + mean);
    System.out.println("The standard deviation is " + dev);

   }
 }
