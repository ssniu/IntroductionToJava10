public class TestMyArrayList{
  public static void main(String[] args){
    //Create a list
    MyList<String> list = new MyArrayList<String>();

    //Add elements to the list
    list.add("America");
    System.out.println("(1) " + list);

    list.add(0, "cica");//Add it to the beginning of the list
    System.out.println("(2) " + list);

    list.add("Russia");//Add it to the end of the list
    System.out.println("(3) " + list);

    list.add("France");//Add it to the end of the list
    System.out.println("(4) " + list);

    list.add(2, "German");
    System.out.println("(5) " + list);

    list.add(5, "Swiss");
    System.out.println("(6) " + list);

    //Remove elements from the list
    list.remove("cica");
    System.out.println("(7) " + list);

    list.remove(2);
    System.out.println("(8) " + list);

    list.remove(list.size() - 1);
    System.out.println("(9) " + list + "\n(10) ");

    for(String s: list)
    System.out.println(s.toUpperCase() + " ");
  }
}
