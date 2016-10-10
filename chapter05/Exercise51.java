
/**
 * (Longest common prefix) Write a program that prompts the user to enter two
 * strings and displays the largest common prefix of the two strings.
 *
 */
 import java.util.Scanner;

 class Exercise51{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     // Enter two strings
     System.out.print("Enter the first string: ");
     String str1 = input.nextLine();

     System.out.print("Enter the second string: ");
     String str2 = input.nextLine();
    //Compare the first letter in each string
    if(str1.charAt(0) != str2.charAt(0))
      System.out.print(str1 + " and " + str2 + " have no common prefix.");
    else {
      //If the first letter in each string is the same one, compare the two strings
     for(int i = 0; i < str1.length(); i++) {
       if(str1.charAt(i) == str2.charAt(i))
          System.out.print(str1.charAt(i));
       else
          break;
    }
  }
 }
}
