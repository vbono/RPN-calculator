package template;

public interface SimpleRPNCalculator {
	public String calculate(String inputString);
	
	/*
	 * RPN (Reverse Polish Notation) is a postfix method of expression mathematical functions.
	 * It is traditionally used to eliminate the necessity of parenthesis by removing the
	 * order of operations and acting on operators as they occur.
	 * 
	 * Very simply, INFIX notation "1 + 1" is represented in POSTFIX notation as "1 1 +"
	 * Longer expressions may change radically.  "1 + 2 * 3" assumes an order of operations, 
	 * while in POSTFIX, "2 3 * 1 +" or "1 2 3 * +"
	 * 
	 * The calculator works as follows:
	 * if number, push to a stack
	 * if operator, pop two numbers, operate on them, and push the result
	 * if I hit an operator and there are not two numbers on the stack, it's a bad expression
	 * if I get to the end of the expression and there is not exactly one number on the stack,
	 *    it's a bad expression.
	 *    
	 */

}
