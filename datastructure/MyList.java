//Common features of lists are defined in the List interface
/**
 * retrieve an element from the list
 * insert a new element into the list
 * delete an element from the list
 * find out how many elements are in the list
 * determine whether an element is in the list
 * check whether the list is empty
 */

 /**
  * 1 create an array to store the elements
  * 2 use a linked structure
  */

  public interface MyList<E> extends java.lang.Iterable<E>{
    //Add a new element at the end of this list
    public void add(E e);
    //Add a new element at the specified index in this list
    public void add(int index, E e);

    //Clear the list
    public void clear();

    //Return true if this list contains the element
    public boolean contain(E e);

    //Return the element from this list at the specified index
    public E get(int index);

    //REturn the index of the first matching element in this list
    public int indexOf(E e);

    //Return true if this list does not contain any elements
    public boolean isEmpty();

    //Return the index of the last matching element in this list
    public int lastIndexOf(E e);

    //Remove the first occurrence of the element e from this list
    //Shift any subsequent elements to the left
    //Return true if the element is removed
    public boolean remove(E e);

    //REmove the element at the specified position
    //Shift any subsequent elements to the left
    //Return the element that was removed from the list
    public E remove(int index);

    //Replace the element at the specified position
    //with the specified element and return the old element
    public Object set(int index, E e);

    //Return the number of elements in this list
    public int size();

  }
