/**
 * (Random character)
 * Write a program that displays a random uppercase
 * letter using the Math.random() method.
 *
 */

 class Exercise16{
   public static void main(String[] args){
     //Generate the random number for letters
     int i = (int)(Math.random() * (91 - 65)) + 65;

     System.out.println(i + " is letter " + (char)(i));
   }
 }
