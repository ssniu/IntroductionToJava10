public interface Tree<E> extends Iterable<E>{
  //Return true if the element is in the tree
  public boolean search(E e);

  //Insert element e into the binary search tree, return true if insertion correctly
  public boolean insert(E e);

  //Delete the specified element from the tree
  public boolean delete(E e);

  //Inorder traversal from the root
  public void inorder();

  //Postorder traversal from the root
  public void postorder();

  //Preorder traversal from the root
  public void preorder();

  //Get the number of nodes in the tree
  public int getSize();

  //Return true if the tree is empty
  public boolean isEmpty();
}
