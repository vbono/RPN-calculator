package template;

public class YourLinkedListStack implements YourStack {
	// YOU MUST USE THIS IMPLEMENTATION - just code the methods
	private YourStackNode head = null;
	private Integer size = 0;


	public void push(Double i) {


		YourStackNode next = new YourStackNode();
		next.setItem(i);
		next.setNext(null);

		if (head == null) {
			head = next;
		} else {
			YourStackNode current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(next);
		}

		size++;
	}





	public Double pop() {
		if (head == null) {
			return null;
		} 

		else if (size == 1) {
			double del = head.getItem();
			head = null;
			size--;
			return del;
		} 

		else {
			YourStackNode current = head;
			while (current.getNext().getNext() != null) {
				current = current.getNext();
			}
			double  del = current.getNext().getItem();
			current.setNext(null);
			size--;
			return del;
		}
	}



	public Integer size() {
		return size;
	}

}
