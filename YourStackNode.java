package template;

public class YourStackNode {

	private Double item;
	private YourStackNode next;
	
	public Double getItem() {
		return item;
	}
	
	public YourStackNode getNext() {
		return next;
	}
	
	public void setItem (Double i) {
		item = i;
	}
	
	public void setNext (YourStackNode node) {
		next = node;
	}

}
