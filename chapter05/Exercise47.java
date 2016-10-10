
/**
 * (Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. It
 * uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
 * which is calculated from the other digits using the following formula:
 * 10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
 * If the checksum is 10, replace it with 0. Your program should read the input as a
 * string.
 *
 */

import java.util.Scanner;

 class Exercise47{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
     String number = input.nextLine();

    if(number.length() != 12){
      System.out.println(number + " is invalid input.");
      System.exit(1);
    }
    int check = 0;
    for(int i = 0; i < number.length(); i++){
      check += (i % 2 == 0 ? 3 * Integer.parseInt(number.charAt(i) + "") : Integer.parseInt(number.charAt(i) + ""));
    }
    check = 10 - check % 10;
    System.out.println("The isbn-13 number is " + number + (check == 10 ? 0 : check));
   }
 }
