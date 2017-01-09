//Search an element
public boolean search(E element){
  TreeNode<E> current = root; //Start from the root

  while(current != null)
    if(element < current.element){
      current = current.left;//Go left
    }
    else if(element > current.element){
      current = current.right;
    }
    else //Element matches current.element
      return true;

  return false; //Element is not in the tree
}

//Insert an element into a BST
boolean insert(E e){
  if( tree is empty)
  //Create the node for e as the root
  else {
    //Locate the parent node
    parent = current = root;
    while(current != null)
    if(e < the value in current.element){
      parent = current; // Keep the parent
      current = current.left;
    }
    else if( e > the value in current.element){
      parent = current ;// Keep the parent
      current = current.right; // Go right
    }
    else
      return false ; //Duplicate node not inserted

    //Create a new node for e and attach it to parent

    return true; // Element inserted
  }
}
