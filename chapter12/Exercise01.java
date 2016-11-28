/**
 * (NumberFormatException)
 * Listing 7.9, Calculator.java, is a simple commandline
 * calculator. Note that the program terminates if any operand is nonnumeric.
 * Write a program with an exception handler that deals with nonnumeric operands;
 * then write another program without using an exception handler to achieve the
 * same objective.
 *
 */

 public class Exercise01{

	public static void main(String[] args) throws Exception {
		// Check number of strings passed
		if (args.length != 3) {
			System.out.println(
				"Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		// The result of the operation
		int result = 0;
    
try{
		// Determine the operator
		switch (args[1].charAt(0)) {
			case '+' : result = Integer.parseInt(args[0]) +
									        Integer.parseInt(args[2]);
						  break;
			case '-' : result = Integer.parseInt(args[0]) -
									        Integer.parseInt(args[2]);
						  break;
			case '.' : result = Integer.parseInt(args[0]) *
									        Integer.parseInt(args[2]);
						  break;
			case '/' : result = Integer.parseInt(args[0]) /
									        Integer.parseInt(args[2]);
						  break;
		}

		// Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
			+ " = " + result);
	}
  catch(NumberFormatException ex){
    System.out.println("Wrong Input: " +
    ex.getMessage().substring(ex.getMessage().indexOf("\"") + 1, ex.getMessage().lastIndexOf("\"")));
  }
}
}
