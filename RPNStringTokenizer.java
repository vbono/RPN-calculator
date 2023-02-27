package template;

import java.util.ArrayList;
import java.util.Arrays;

public interface RPNStringTokenizer {
	public static ArrayList<String> tokenize(String expression) throws NumberFormatException {
		// take a string.  If it is valid RPN stuff - integers or operators
		// - then put them in a list for processing.
		// anything bad (not int or one of the operators we like) and return a null.
		// YOU WRITE THIS!
		String[] spl = expression.split(" ");
		
		String ops = "+,-,*,/,^";
		String[] valid = ops.split(",");
		ArrayList<String> operators = new ArrayList<>(Arrays.asList(valid));
		ArrayList<String> equation = new ArrayList<>();

		for (int i = 0; i < spl.length; i++) {
				if (operators.contains(spl[i])) {
					equation.add(spl[i]);
				} else {
					try {
						Double.parseDouble(spl[i]);
						equation.add(spl[i]);
					} catch (NumberFormatException e) {
						return null; }
				}
			}

		return equation;
	}
}
