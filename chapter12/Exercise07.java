/**
 * (NumberFormatException) Write the bin2Dec(String binaryString)
 * method to convert a binary string into a decimal number. Implement the
 * bin2Dec method to throw a NumberFormatException if the string is not a
 * binary string.
 *
 */
import java.util.*;

 public class Exercise07 {
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.println("Enter a binary string:");
     String binString = input.nextLine();

     System.out.println("The result is" + bin2Dec(binString));
   }
   //bin2Dec() method
   public static int bin2Dec(String binaryString) throws NumberFormatException {
     if(!isBinary(binaryString))//Thros the Exception
              throw new NumberFormatException(binaryString + " is not a binary string");
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
