/**
 * (HexFormatException) Exercise 12.6 implements the hex2Dec method to
 * throw a NumberFormatException if the string is not a hex string. Define
 * a custom exception called HexFormatException. Implement the hex2Dec
 * method to throw a HexFormatException if the string is not a hex string.
 *
 */
import java.util.*;

//Exception class
 class HexFormatException extends NumberFormatException{

   public HexFormatException(String str){
     super(str);
   }
 }

 public class Exercise08 {
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter the hex string:");
     String hexString = input.nextLine();

     System.out.println("The hex string is" + hex2Dec(hexString));

   }

   public static int hex2Dec(String str) throws HexFormatException{
     if(!isHex(str))
        throw new HexFormatException(str + "the hex string is invalid");

     int decimal = 0;
    for(int i = 0; i < str.length(); i++){
      char ch1 = str.charAt(i);
      decimal = decimal * 16 + hexChar2DecChar(ch1);
    }
    return decimal;
     }

     public static int hexChar2DecChar(char ch){

         if(ch >= 'A' && ch <= 'F')
              return 10 + ch - 'A';
          else
              return ch - '0';
   }

   public static boolean isHex(String str){
     for(int i = 0; i < str.length(); i++){
       if(str.charAt(i) < 0 || str.charAt(i) > 9 || str.charAt(i) < 'A' || str.charAt(i) > 'F');
        return false;
     }
     return true;
   }
 }
