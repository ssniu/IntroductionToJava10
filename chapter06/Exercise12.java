
/**
 * (Display characters) Write a method that prints characters using the following
 * header:
 *      public static void printChars(char ch1, char ch2, int numberPerLine)
 * This method prints the characters between ch1 and ch2 with the specified numbers
 * per line. Write a test program that prints ten characters per line from 1 to Z.
 * Characters are separated by exactly one space.
 *
 */

 class Exercise12{
   // Method that prints characters
   public static void printChars(char ch1, char ch2, int numberPerLine){
     int i = 0; // Initialize the number of characters
     for(char ch = ch1; ch <= ch2; ch++){
       i++;
       // Print 10 characters each line
       if(i % numberPerLine != 0)
         System.out.print(ch + " ");
       else
         System.out.println(ch);
     }
   }

   public static void main(String[] args){
     printChars('1', 'Z', 10);
   }
 }
