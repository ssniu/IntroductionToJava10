/**
 * (NumberFormatException) Listing 6.8 implements the hex2Dec(String
 * hexString) method, which converts a hex string into a decimal number.
 * Implement the hex2Dec method to throw a NumberFormatException if the
 * string is not a hex string.
 *
 */

 import java.util.*;

 public class Exercise06{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.println("Enter a hex string:");
     String hexString = input.nextLine();

     for(int i = 0; i < hexString.length; i++){
       if(hexString.charAt(i) >= 'A' && hexString <= 'G')
     }

   }
 }
