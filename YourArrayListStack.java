package template;

import java.util.ArrayList;

public class YourArrayListStack implements YourStack {
	// YOU MUST USE THIS IMPLEMENTATION - just code the methods
	ArrayList<Double> theStack = new ArrayList<>();


	public void push(Double i) {
		theStack.add(i);
	}

	public Double pop() {
		int last = theStack.size()-1;
		double del = theStack.remove(last);
		return del;
	}

	@Override
	public Integer size() {
		return theStack.size();
	}

}
