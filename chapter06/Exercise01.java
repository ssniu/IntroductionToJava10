/**
 *(Math: pentagonal numbers)
 * A pentagonal number is defined as n(3n–1)/2 for n = 1, 2, . . ., and so on.
 * Therefore, the first few numbers are 1, 5, 12, 22, . . . .
 * Write a method with the following header that returns a pentagonal number:
 *
 */

class Exercise01{
	//Define the getPentagonalNumber method
	public static int getPentagonalNumber(int n){
		  return n * ( 3 * n - 1) / 2; // return the pentagonal number
	}

	public static void main(String[] args){
		final int NUMBER_PER_LINE = 10;// Set 10 numbers on each line as a constant

		System.out.print("The first 100 pentagonal numbers: ");
    //Output 100 pentagonal numbers
		for(int i = 1; i < 100; i++){
			if(i % NUMBER_PER_LINE == 0)
			   System.out.println(getPentagonalNumber(i));
			else
			   System.out.print(getPentagonalNumber(i) + " ");
		}

	}
}
