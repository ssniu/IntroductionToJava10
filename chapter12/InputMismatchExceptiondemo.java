import java.util.*;

public class InputMismatchExceptiondemo{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;

    do{
      try{
        System.out.println("Enter an integer:");
        int number = input.nextInt();

        System.out.println("The number is" + number);
        continueInput = false;
      }catch (InputMismatchException ex) {
        System.out.println("Pls enter an integer:");
        input.nextLine();
      }
    }while(continueInput);
  }
}
