/**
 * (BinaryFormatException) Exercise 12.7 implements the bin2Dec method
 * to throw a BinaryFormatException if the string is not a binary string.
 * Define a custom exception called BinaryFormatException. Implement the
 * bin2Dec method to throw a BinaryFormatException if the string is not a
 * binary string.
 *
 */

import java.util.*;

 public class Exercise09 {
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.println("Enter a binary string:");
     String binString = input.nextLine();

     System.out.println("The result is" + bin2Dec(binString));
   }
   //bin2Dec() method
   public static int bin2Dec(String binaryString) throws BinaryFormatException {
     if(!isBinary(binaryString))//Thros the Exception
              throw new BinaryFormatException(binaryString + " is not a binary string");
      //Convert the hex to decimal
      int index = 0;
      int decimal = 0;
      for(int i = binaryString.length() - 1; i >= 0; i--){
        if(binaryString.charAt(i) == '1'){
          decimal += Math.pow(2, index);
        }
        index++;
      }
      return decimal;
   }
   //Check the string is binary or not
   public static boolean isBinary(String str){
     for(char ch : str.toCharArray()){
       if(ch != '1' && ch != '0')
        return false;
     }
     return true;
   }
 }

 class BinaryFormatException extends IllegalArgumentException{
   BinaryFormatException(String str){
     super(str);
   }
 }
