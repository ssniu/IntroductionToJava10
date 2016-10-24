/**
 * Count the occurrences of each letter in an array of character
 *
 */

 public class CountLetterInArray{
   public static void main(String[] args){
     char[] chars = createArray();
     //Display the character array
     System.out.println("The lowercase letters are: ");
     displayArray(chars);
     //Initialize the counts array to store the number of occurrences of each letter
     int[] counts = countLetters(chars);

     System.out.println();
     System.out.println("The occurrences of each letter are: ");
     //Display the result of counts array
     displayCounts(counts);
   }
   //Create the random character array
   public static char[] createArray(){
     char[] chars = new char[100];
     //for character array, return arrayName equals reture all elements in this array
     for(int i = 0; i < chars.length; i++){
       chars[i] = RandomCharacter.getRandomLowerCaseLetter();
     }
     return chars;
   }
  //Ouput format of this character array
   public static void displayArray(char[] chars){
     //Display 20 characters each line
     for(int i = 0; i < chars.length; i++){
       if((i + 1) % 20 == 0)
         System.out.println(chars[i]);
       else
         System.out.print(chars[i] + " ");
     }
   }
   //Count the occurrences of each letter
   public static int[] countLetters(char[] chars){
     int[] counts = new int[26];

     for(int i = 0; i < chars.length; i++){
       counts[chars[i] - 'a']++;
     }
     return counts;
   }
   //Output format of counts array
   public static void displayCounts(int[] counts){
     // 10 pairs each line
     for(int i = 0; i < counts.length; i++){
       if((i + 1) % 10 == 0)
         System.out.println(counts[i] + " " + (char)(i + 'a'));
       else
         System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
     }
   }
 }
