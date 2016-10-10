
/**
 * (Financial application: compute future tuition)
 * Suppose that the tuition for a university is $10,000 this year
 * and increases 5% every year. In one year, the tuition
 * will be $10,500. Write a program that computes the tuition in ten years and the
 * total cost of four years’ worth of tuition after the tenth year
 *
 */
 public class Exercise07{
   public static void main(String[] args){
     int tuition = 10000;
     int totalTuition = 0;
     int tuitionTenYear = 0;

     // Compute the tuition in tenth year
     for(int i = 0; i < 10; i++)
        tuition += tuition * 0.05;
     tuitionTenYear = tuition;

     for(int i = 0; i < 4; i++)
       totalTuition += tuitionTenYear * (1 + 0.05);

     System.out.println("The tuition in tenth year is " + tuitionTenYear + "total cost of four years" +
        "worth of tuition after the tenth year" + totalTuition);

   }
 }
