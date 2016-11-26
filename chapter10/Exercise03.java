/**
 * (The MyInteger class)
 * Design a class named MyInteger. The class contains:
 * ■ An int data field named value that stores the int value represented
 * by this object.
 * ■ A constructor that creates a MyInteger object for the specified
 * int value.
 * ■ A getter method that returns the int value.
 * ■ The methods isEven(), isOdd(), and isPrime() that return true if the
 * value in this object is even, odd, or prime, respectively.
 * ■ The static methods isEven(int), isOdd(int), and isPrime(int) that
 * return true if the specified value is even, odd, or prime, respectively.
 * ■ The static methods isEven(MyInteger), isOdd(MyInteger), and
 * isPrime(MyInteger) that return true if the specified value is even, odd,
 * or prime, respectively.
 * ■ The methods equals(int) and equals(MyInteger) that return true if
 * the value in this object is equal to the specified value.
 * ■ A static method parseInt(char[]) that converts an array of numeric
 * characters to an int value.
 * ■ A static method parseInt(String) that converts a string into an int value.
 * Draw the UML diagram for the class and then implement the class.
 * Write a client program that tests all methods in the class.
 *
 */

 /*************************************************
  *                 UML                           *
  *               MyInteger                       *
  *-----------------------------------------------*
  * -value:int                                    *
  * +MyInteger()                                  *
  * +getInt(): int                                *
  * +isEven():boolean                             *
  * +isOdd():boolean                              *
  * +isPrime():boolean                            *
  * +isOdd(value: int): boolean                   *
  * +isPrime(value: int): boolean                 *
  * +isEven(value: MyInteger): boolean            *
  * +isOdd(value: MyInteger): boolean             *
  * +isPrime(value: MyInteger): boolean           *
  * +equals(value: int): boolean                  *
  * +equals(value: MyInteger): boolean            *
  * +parseInt(chars: char[])                      *
  * +parseInt(str: String)                        *
  *************************************************/

class MyInteger{
    private int value;

    public MyInteger(int i){
      value = i;
  }
    public int getInt(){
      return value;
  }

  public boolean isEven() {
		return isEven(value);
	}

	/** Return true if value is odd */
	public boolean isOdd() {
		return isOdd(value);
	}

	/** Return true if value is prime */
	public boolean isPrime() {
		return isPrime(value);
	}

	/** Return true if the specified value is even */
	public static boolean isEven(int value) {
		return value % 2 == 0;
	}

	/** Return true if the specified value is odd */
	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}

	/** Return true if specified value is prime */
	public static boolean isPrime(int value) {
		for (int divisor = 2; divisor <= value / 2; divisor++) {
			if (value % divisor == 0)
				return false;
		}
		return true;
	}

	/** Return true if the specified value is even */
	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven();
	}

	/** Return true if the specified value is odd */
	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isOdd();
	}

	/** Return true if specified value is prime */
	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime();
	}

	/** Return true is the value in this object
	*   is equal to the specified value. */
	public boolean equals(int i) {
		return value == i;
	}

	/** Return true if the value in this object
	*   is equal to the specified value */
	public boolean equals(MyInteger myInteger) {
		return myInteger.value == this.value;
	}

	/** converts an array of numeric
	*   characters to an int value */
	public static int parseInt(char[] chars) {
		int value = 0;
		for (int i = 0, j = (int)Math.pow(10, chars.length - 1);
			  i < chars.length; i++, j /= 10) {
			value += (chars[i]- 48) * j;
		}
		return value;
	}

	/** Converts a string into an int value */
	public static int parseInt(String str) {
		int value = 0;
		for (int i = 0, j = (int)Math.pow(10, str.length() - 1);
			  i < str.length(); i++, j /= 10) {
			value += (str.charAt(i) - 48) * j;
		}
		return value;
	}
}

public class Exercise03{
  public static void main(String[] args){
    int[] values = {5, 6, 7, 8, 9};

// Test isEven(int), isOdd(int), and isPrime(int)
System.out.println("\nTest if values are even using isEven(int):");
for (int i = 0; i < values.length; i++) {
  System.out.println(values[i] + " " + MyInteger.isEven(values[i]));
}

System.out.println("\nTest if values are odd using isOdd(int):");
for (int i = 0; i < values.length; i++) {
  System.out.println(values[i] + " " + MyInteger.isOdd(values[i]));
}

System.out.println("\nTest if values are prime using isPrime(int):");
for (int i = 0; i < values.length; i++) {
  System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
}

// Test MyInteger(), isEven(), isOdd(), isPrime() and getValue()
System.out.println("\nTest if values are even using isEven():");
for (int i = 0; i < values.length; i++) {
  // Create a MyInteger
  MyInteger value = new MyInteger(values[i]);
  System.out.println(value.getInt() + " " + value.isEven());
}

System.out.println("\nTest if values are odd using isOdd():");
for (int i = 0; i < values.length; i++) {
  // Create a MyInteger
  MyInteger value = new MyInteger(values[i]);
  System.out.println(value.getInt() + " " + value.isOdd());
}

System.out.println("\nTest if values are prime using isPrime():");
for (int i = 0; i < values.length; i++) {
  // Create a MyInteger
  MyInteger value = new MyInteger(values[i]);
  System.out.println(value.getInt() + " " + value.isPrime());
}

// Test isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger)
System.out.println("\nTest if values are even using isEven(MyInteger):");
for (int i = 0; i < values.length; i++) {
  // Create a MyInteger
  MyInteger value = new MyInteger(values[i]);
  System.out.println(value.getInt() + " " + MyInteger.isEven(value));
}

System.out.println("\nTest if values are odd using isOdd(MyInteger):");
for (int i = 0; i < values.length; i++) {
  // Create a MyInteger
  MyInteger value = new MyInteger(values[i]);
  System.out.println(value.getInt() + " " + MyInteger.isOdd(value));
}

System.out.println("\nTest if values are prime using isPrime(MyInteger):");
for (int i = 0; i < values.length; i++) {
  // Create a MyInteger
  MyInteger value = new MyInteger(values[i]);
  System.out.println(value.getInt() + " " + MyInteger.isPrime(value));
}

// Test equals(int) and equals(MyInteger)
int[] values2 = {5, 9, 7};
MyInteger value = new MyInteger(9);
System.out.println("\nTest if " + value.getInt() +
  " is equal to the specified value:");
for (int i = 0; i < values2.length; i++) {
  System.out.println(values2[i] + " " + value.equals(values2[i]));
}

System.out.println("\nTest if " + value.getInt() +
  " is equal to the specified value:");
for (int i = 0; i < values2.length; i++) {
  MyInteger myInteger = new MyInteger(values2[i]);
  System.out.println(values2[i] + " " + value.equals(myInteger));
}

// Test parseInt(char[]) and parseInt(String)
System.out.println("\nTest parseInt(char[]) and parseInt(String):");
// Create a character array
char[] numericCharacters = {'3', '4', '2'};

// Create a string
String numericString = "658";
System.out.print("\'");
for (int i = 0; i < numericCharacters.length; i++) {
  System.out.print(numericCharacters[i] + "");
}
System.out.println("\' + \"" + numericString + "\" = " +
  (MyInteger.parseInt(numericCharacters) +
  MyInteger.parseInt(numericString)));
  }
}
