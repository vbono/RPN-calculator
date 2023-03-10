package template;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

public class YourRPNCalculator implements SimpleRPNCalculator {
	// don't change these...
	YourStack theStack = null;

	public YourRPNCalculator(YourStack stack) {
		theStack = stack;
	}


	public String calculate(String inputString) {
		// this is probably helpful, but you can remove...
		ArrayList<String> tokens = RPNStringTokenizer.tokenize(inputString);

		// create array list of valid operators
		String ops = "+,-,*,/,^";
		String[] valid = ops.split(",");
		ArrayList<String> operators = new ArrayList<>(Arrays.asList(valid));

		double result=0;
		int symbols=0;
		int nums=0;

		if (tokens == null) {
			result=0;
		} 

		else {
			
			// get # of operands (nums) && # of operators (symbols)
			for (int i=0; i<tokens.size(); i++) {
				if (!operators.contains(tokens.get(i)))
					nums++;
				else 
					symbols++;
			}

			// for all elements of tokens
			// if token is NOT operator, push to stack as int
			for (int i=0; i<tokens.size(); i++) {
				if (!operators.contains(tokens.get(i))) {
					theStack.push(Double.parseDouble(tokens.get(i)));
				} else if (!operators.contains(tokens.get(tokens.size()-1))) {
					return "'" + inputString + "' can't end with a number!";
				} else if (!operators.contains(tokens.get(0)) && operators.contains(tokens.get(1))) {
					return "'" + inputString + "' must start with two numbers";
				} else {
					
					if (symbols >= nums) {
						return "'" + inputString + "' has too many operands!";
					} else if (nums-1!=symbols) {
						return "'" + inputString + "' has too many numbers!";
					} 
					else {
						double r = theStack.pop();
						double l = theStack.pop();

						switch(tokens.get(i)) {

						case "+":
							result = l+r;
							theStack.push(result);
							break;
						case "-":
							result = l-r;
							theStack.push(result);
							break;
						case "*":
							result = l*r;
							theStack.push(result);
							break;
						case "/":
							result = l/r;
							theStack.push(result);
							break;
						case "^":
							result = Math.pow(l, r);
							theStack.push(result);
							break;
						}
					}
				}
			}	
			return "'" + inputString + "' = " + String.valueOf(result);
		}
		return "'" + inputString + "' is a Bad Token! No good!!!!";
	}

}
