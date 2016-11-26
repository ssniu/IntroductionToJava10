/**
 * (Generate vehicle plate numbers) Assume a vehicle plate number consists of three
 * uppercase letters followed by four digits.
 * Write a program to generate a plate number.
 *
 */

 class Exercise25{
   public static void main(String[] args){

     //Generate the ramndom letters
     int letter1 = 65 + (int)(Math.random() * (91 - 65));
     int letter2 = 65 + (int)(Math.random() * (91 - 65));
     int letter3 = 65 + (int)(Math.random() * (91 - 65));

     //Generate random numbers
     int number1 = (int)(Math.random() * 10);
     int number2 = (int)(Math.random() * 10);
     int number3 = (int)(Math.random() * 10);
     int number4 = (int)(Math.random() * 10);

     //Three uppercase letters + 4 digits
     System.out.println(" " + (char)(letter1) + (char)(letter2) +
         (char)(letter3) + number1 + number2 + number3 + number4);

   }
 }
