import java.util.*;

public class TestArrayLinked{
  public static void main(String[] args){
    List<String> arraylists = new ArrayList<String>();
    arraylists.add("Rave");
    arraylists.add("Vich");
    arraylists.add("Rarch");

    List<String> linkedlists = new LinkedList<String>();
    linkedlists.add("James");
    linkedlists.add("Serena");
    linkedlists.add("John");

    System.out.println("arraylists: " + arraylists);
    System.out.println("linkedlists: " + linkedlists);
  }
}
