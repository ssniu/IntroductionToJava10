public abstract class MyAbstractList<E> implements MyList<E>{
  protected int size = 0; // The size of the list

  //Create a default list
  protected MyAbstractList(){

  }

  protected MyAbstractList(E[] objects){
    for(int i = 0; i < objects.length; i++)
      add(objects[i]);
  }

  @Override //Add a new element at the end of this list
  public void add(E e){
    add(size, e);
  }

  @Override //Return true if this list does not contains any elements
  public boolean isEmpty(){
    return size == 0;
  }

  @Override //Return the number of elements in this list
  public int size(){
    return size;
  }

  @Override
  public boolean remove(E e){
    if(indexOf(e) > 0){
      remove(indexOf(e));
      return true;
    }
    else 
      return false;
  }
}
