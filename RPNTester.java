package template;

import java.util.ArrayList;

public class RPNTester {

	public static void main(String[] args) {
		
		// instance of calculator using array list
		YourRPNCalculator calc = new YourRPNCalculator(new YourArrayListStack());
		System.out.println("Testing ArrayList version");
		testRPNCalculator(calc);
		
		// instance of calculator using linked list
		calc = new YourRPNCalculator(new YourLinkedListStack());
		System.out.println("Testing LinkedList version");
		testRPNCalculator(calc);
		
	}
	
	private static void testRPNCalculator(SimpleRPNCalculator calc) {
		ArrayList<String> testExpressions = new ArrayList<>();
	//	testExpressions.add("2 3 + -");
		testExpressions.add("1 1 +"); // 2
		testExpressions.add("1 3 -"); // 2
		testExpressions.add("1 1 + 2 *"); // 4
		testExpressions.add("1 1 2 + *"); // 3
		testExpressions.add("1 1 + 2 2 * -"); // 2
		testExpressions.add("11 bv +"); // bad token
		testExpressions.add("2 3 + -"); // underflow on an operator
		testExpressions.add("2 3 + 4 5 -"); // leftover tokens
		// YOU SHOULD ADD MORE TEST CASES!
		testExpressions.add("7 4 + 3 5"); // underflow on an operator
		testExpressions.add("7 -"); // doesnt start with 2 numbers
		testExpressions.add("7.2 4.3 + 1.1");
		testExpressions.add("5.001 4.223 - 3 *");
		testExpressions.add("0.432 9.330 + 4.22342 - 3.98765 6.654 * +");
		
		// division
		testExpressions.add("1 1 2 + /"); 
		testExpressions.add("30 23 + 2 2 * /");
		testExpressions.add("4567.3845 23 + 2 4 * /");
		testExpressions.add("1 2 / 183 983 - *");

		
		
		for (String s : testExpressions) {
			System.out.println(calc.calculate(s));
		}
		
	}

}
