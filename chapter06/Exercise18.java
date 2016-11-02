/**
 * (Check password) Some websites impose certain rules for passwords.
 * Write a method that checks whether a string is a valid password.
 * Suppose the password rules are as follows:
 * ■ A password must have at least eight characters.
 * ■ A password consists of only letters and digits.
 * ■ A password must contain at least two digits.
 * Write a program that prompts the user to enter a password and
 * displays Valid Password if the rules are followed or
 * Invalid Password otherwise
 *
 */

 import java.util.Scanner;

 class Exercise18{
   //Main method
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Prompt the user to enter the password
     System.out.print("Enter your password: ");
     String password = input.nextLine();
     //Using checkPassword method to test valid password
     if(checkPassword(password))
        System.out.println("Valid Password.");
     else
       System.out.println("Invalid Password.");
   }
   //Check the password is valid or invalid
   public static boolean checkPassword(String password){
     final int VALID_LENGTH = 8;
     final int MIN_DIGITS = 2;
     //Valid password has to follow 3 rules
     boolean validPassword =
        isLength(password, VALID_LENGTH) &&
        isCharDigit(password) &&
        isNumDigits(password, MIN_DIGITS);

      return validPassword;
   }
   // Rule 1 method: password length must be at least 8
   public static boolean isLength(String password, int n){
     if(password.length() < n)
       return false;
     else
       return true;
   }
   //Rule2 method: consistes of only letters and digits
   public static boolean isCharDigit(String password){
     for(int i = 0; i < password.length(); i++){
       if(!Character.isLetterOrDigit(password.charAt(i))){
         return false;
       }
     }
     return true;
   }
   // Rule3 method: has at least n digits
   public static boolean isNumDigits(String password, int n){
     int numberOfDigits = 0;
     for(int i = 0; i < password.length(); i++){
       if(Character.isDigit(password.charAt(i))) {
         numberOfDigits++;
       }
       if(numberOfDigits >= n)
         return true;
     }return false;
   }

 }
