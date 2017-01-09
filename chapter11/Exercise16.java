/**
 * (Addition quiz) Rewrite Listing 5.1 RepeatAdditionQuiz.java to alert the user
 * if an answer is entered again. Hint: use an array list to store answers.
 *
 */

 import java.util.*;

 public class Exercise16{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     //Generate two random numbers
     int n1 = (int)(Math.random() * 10);
     int n2 = (int)(Math.random() * 10);

     System.out.print("What is " + n1 + " + " + n2 + "? ");
     //Create an ArrayList to store the answers
     ArrayList<Integer> answers = new ArrayList<>();
     //Enter the first answer
     int ans = input.nextInt();
     //Ask user to enter correct answers
     while(n1 + n2 != ans) {
       if(answers.contains(ans))
          System.out.println("You already entered " + ans);

     System.out.println("Wrong answer. Try again. What is " + n1 + " + " + n2 + "? ");
     answers.add(ans);//Add the answers in the answers ArrayList
     ans = input.nextInt();//Continuously enter the answers and store them in the ArrayList
   }
   System.out.println("You got it!");
 }
}
