package template;

import java.util.ArrayList;

public class YourArrayListStack implements YourStack {

	ArrayList<Double> theStack = new ArrayList<>();

	// adds number to the ArrayList Stack
	public void push(Double i) {
		theStack.add(i);
	}
	
	// removes number fro ArrayList Stack
	public Double pop() {
		int last = theStack.size()-1;
		double del = theStack.remove(last);
		return del;
	}

	// returns size of the stack
	public Integer size() {
		return theStack.size();
	}

}
