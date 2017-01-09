/**
 * (Search Web) Modify Listing 12.18 WebCrawler.java to search for the
 * word Computer Programming starting from the URL
 * http://cs.armstrong.edu/liang. Your program terminates
 * once the word is found. Display the URL for the page that contains the word.
 *
 */

 import java.util.*;
 import java.net.*;

 public class Exercise33{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.print("Enter a URL: ");
     String url = input.nextLine();

     crawler("http://cs.armstrong.edu/liang");
   }

   public static void crawler(String startUrl){
     ArrayList<String> listOfPendingUrls = new ArrayList<>();
     ArrayList<String> listOfTraversedUrls = new ArrayList<>();

     listOfPendingUrls.add(startUrl);
     while(!listOfPendingUrls.isEmpty() && listOfTraversedUrls.size() <= 100){
       String urlString = listOfPendingUrls.remove(0);
       System.out.println("Craw" + urlString);

       for(String s: getSubUrls(urlString)){
         if(!listOfTraversedUrls.contains(s))
            listOfPendingUrls.add(s);
       }
     }
   }


 public static ArrayList<String> getSubUrls(String urlString){
   ArrayList<String> list = new ArrayList<>();

   try{
     URL url = new URL(urlString);
     Scanner input = new Scanner(url.openStream());
     int current = 0;
     while(input.hasNext()){
       String line = input.nextLine();
       if(line.contains("Computer Programming")){
         System.out.println("Found the word \"Computer Programming\".");
         System.out.println("URL: " + url);
         System.exit(1);
       }
       current = line.indexOf("http", current);
       while(current > 0){
         int endIndex = line.indexOf("\"", current);
         if(endIndex > 0){
           list.add(line.substring(current, endIndex));
           current = line.indexOf("http:", endIndex);
         }
         else
            current = -1;
       }
     }
   }
   catch(Exception ex){
     System.out.println("Error:" + ex.getMessage());
   }
   return list;
 }
}
