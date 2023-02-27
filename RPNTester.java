package template;
import java.util.ArrayList;
import java.util.Scanner;

public class RPNTester {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		YourRPNCalculator calcArray = new YourRPNCalculator(new YourArrayListStack());
		YourRPNCalculator calcLinked = new YourRPNCalculator(new YourLinkedListStack());

		System.out.printf("Welcome to RPN Calculator!%n");
		boolean calculate = true;

		while(calculate) {
			menu();
			String input = s.nextLine();
			if (input.toUpperCase().equals("Q")) {
				calculate = false;
			} else if (input.equals("1") || input.equals("2") || input.equals("3")){
				System.out.printf("Input your operators/operands each followed by a space%n");
				if (input.equals("1")) {
					doRPNArrayList(input);
				}
				
			} else if (input.equals("4")) {
				System.out.println("Testing ArrayList version");
				testRPNCalculator(calcArray);
				System.out.println("Testing LinkedList version");
				testRPNCalculator(calcLinked);
		
			} else {
				System.out.println("I didn't understand that. Try again!");
			}
		}

		System.out.println("Goodbye!");

	
		
	}
	
	private static void testRPNCalculator(SimpleRPNCalculator calc) {
		ArrayList<String> testExpressions = new ArrayList<>();
	//	testExpressions.add("2 3 + -");
		testExpressions.add("1 1 +"); // 2.0
		testExpressions.add("1 3 -"); // -2.0
		testExpressions.add("1 1 + 2 *"); // 4.0
		testExpressions.add("1 1 2 + *"); // 3.0
		testExpressions.add("1 1 + 2 2 * -"); // -2.0
		testExpressions.add("11 bv +"); // bad token
		testExpressions.add("2 3 + -"); // underflow on an operator
		testExpressions.add("2 3 + 4 5 -"); // leftover tokens
		testExpressions.add("7 4 + 3 5"); // underflow on an operator
		testExpressions.add("7 -"); // doesnt start with 2 numbers
		testExpressions.add("7.2 4.3 + 1.1"); // underflow on operator/ends in a number
		testExpressions.add("5.001 4.223 - 3 *"); // 2.3340000000000014
		testExpressions.add("0.432 9.330 + 4.22342 - 3.98765 6.654 * +"); // 32.0724031
		// division
		testExpressions.add("1 1 2 + /"); // 0.3333333333333333
		testExpressions.add("30 23 + 2 2 * /"); // 13.25
		testExpressions.add("4567.3845 23 + 2 4 * /"); // 573.7980625
		testExpressions.add("1 2 / 183 983 - *"); // -400.0

		
		
		for (String s : testExpressions) {
			System.out.println(calc.calculate(s));
		}	
	}

	private static void menu() {
		System.out.printf("1 - Use RPN using an ArrayList%n");
		System.out.printf("2 - Use RPN using a LinkedList%n");
		System.out.printf("3 - Use RPN using a ArrayList and LinkedList at the same time%n");
		System.out.printf("4 - Use pre-filled test cases to see how the calculator works%n");
		System.out.printf("Q - Quit%n");	
		
		

	}

	private static void doRPNArrayList(String input) {

		calc.calculate(null);

	}

	private static void doRPNLinkedList(String input) {

		calc.calculate(null);

	}
	

}
