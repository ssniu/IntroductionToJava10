public class TestBSTWithIterator{
  public static void main(String[] args){
    BST<String> tree = new BST<>();
    tree.insert("Geor");
    tree.insert("Mia");
    tree.insert("Tom");
    tree.insert("Adam");
    tree.insert("Jones");
    tree.insert("Perter");
    tree.insert("Dane");

    for(String s:tree)
       System.out.print(s.toUpperCase() + " ");
  }
}
