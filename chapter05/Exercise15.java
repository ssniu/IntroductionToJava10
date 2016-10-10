/**
 * (Display the ASCII character table)
 * Write a program that prints the characters in
 * the ASCII character table from ! to ~. Display ten characters per line.
 * The ASCII table is shown in Appendix B. Characters are separated by exactly one space.
 *
 */

 class Exercise15{
   public static void main(String[] args){
     //Set the constant number for ten characters per line
     final int CHARACTERS_PER_LINE = 10;
     int count = 0;

     for(int i = 33; i <= 126; i++){
       count++; // Increment count the ASCII characters

      if(count % 10 == 0)
         System.out.println((char)i);//Convert the number to ASCII characters
      else
         System.out.print((char)i + " ");
     }
   }
 }
