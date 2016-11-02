/**
 * (Revising Listing 19.1) 
 * Revise the GenericStack class in Listing 19.1 to implement
 * it using an array rather than an ArrayList. You should check the array size
 * before adding a new element to the stack. If the array is full, 
 * create a new array that doubles the current array size and 
 * copy the elements from the current array to the new array.
 *
 */

class GenericStack<E> {
	private E[] list = (E[])new Object[10];
	private int size = 0;

	//Getter
	public int getSize(){
		return size;
	}

	public E peek(){
		return list[size - 1];
	}

	public void push(E o){
		if(size >= list.length){
			doubleList();
		}
		list[size++] = o;
	}

	//Return and remove the top element from the stack
	public E pop(){
		E o = list[--size];
		return o;
	}

	//Check the stack is empty or not 
	public boolean isEmpty(){
		return size == 0;
	}

	//Create new array and copy the current array to this new array
	private void doubleList(){
		E[] tempList = (E[])new Object[list.length * 2];
		System.arraycopy(list, 0, tempList, 0, list.length);
		list = tempList;
	}

	@Override 
	public String toString(){
		return "stack: " + list.toString();
	}
}

public class Exercise01{
	public static void main(String[] args){
		GenericStack<String> str = new GenericStack<>();
		str.push("London");
		str.push("Paris");
		str.push("Berlin");

		GenericStack<Integer> str2 = new GenericStack<>();
		for(int i = 0; i < 100; i++){
			str2.push(i + 1);
		}

		System.out.print("Stack 1: ");
		while(!str.isEmpty()){
			System.out.print(str.pop() + " ");
		}
		System.out.println();

		System.out.println("Stack 2 : ");
		for(int i = 1; !str2.isEmpty(); i++){
			if( i % 10 == 0)
				  System.out.println(str2.pop());
			else 
				 System.out.println(str2.pop() + " ");
		}
		System.out.println();
	}
}