/**
 * (Sort students on grades)
 * Rewrite Listing 8.2, GradeExam.java, to display the
 * students in increasing order of the number of correct answers.
 *
 */

 public class Exercise03{
   public static void main(String[] args){
     char[][] answers = {
       {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
       {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
       {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
       {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
       {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
       {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
       {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
       {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
     };

     //Key to the questions
     char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
     int[][] sortedResult = new int[answers.length][2];
     //Crade all answer
     for(int i = 0; i < answers.length; i++){
       int correct = 0;
       for(int j = 0; j < answers[i].length; j++){
         if(answers[i][j] == keys[j])
            correct++;
       }
       sortedResult[i][0] = i;
       sortedResult[i][1] = correct;
       //System.out.println(sortedResult[i][0], sortedResult[i][1]);
     }
     selectionSort(sortedResult);
     /*for(int j = 0; j < sortedResult.length; j++){
       System.out.println("Students " + sortedResult[j][0] + " 's correct count is "
                  + sortedResult[j][1]);
     }*/
   }
   //Sorting problem not solved
   public static void selectionSort(int[][] arr){
     for(int i = 0; i < arr.length; i++){
       int min = arr[i][1];
       int index = arr[i][0];
       int minIndex = i;
       for(int j = i + 1; j < arr.length; j++){
         if(min > arr[j][1]){
           min = arr[j][1];
           minIndex = j;
           index = arr[j][0];
         }
       }
       if(i != minIndex && index != arr[i][0]){
       arr[minIndex][1] = arr[i][1];
       arr[i][1] = min;
       arr[i][0] = index;
        }
  System.out.println("Students " + arr[i][0] + " 's correct count is "
                    + arr[i][1]);
     } }
 }
