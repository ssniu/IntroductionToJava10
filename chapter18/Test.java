import java.util.Scanner;

public class Test{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a string");
    String s = input.nextLine();
    //Invoke the isPalin() method
    if(isPalin(s))
       System.out.println(s + " is palindrome");
    else
       System.out.println(s + " is not palindrome");
  }
  //isPalin() method
  public static boolean isPalin(String s){
    if(s.length() == 1)
       return true;
    else if(s.charAt(0) != s.charAt(s.length() - 1))
      return false;
    else
      return isPalin(s.substring(1, s.length() - 1));
  }
}
