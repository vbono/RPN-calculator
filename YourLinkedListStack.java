package template;

public class YourLinkedListStack implements YourStack {

	private YourStackNode head = null;
	private Integer size = 0;

	// adds num to LinkedList stack
	public void push(Double i) {


		YourStackNode next = new YourStackNode();
		next.setItem(i);
		next.setNext(null);

		if (head == null) {
			head = next;
		} else {
			// iterates to the end of the stack
			YourStackNode current = head;
			while (current.getNext() != null) { 	
				current = current.getNext();
			}
			
			// sets the last position in the stack to the new num
			current.setNext(next);
		}

		size++; // index size when num added
	}





	public Double pop() {
		
		// can't remove from stack if it is empty
		if (head == null) {
			return null;
		} 
		
		// else if stack only has one element, return that element & remove from stack
		else if (size == 1) {
			double del = head.getItem();
			head = null;
			size--;
			return del;
		} 
		
		/* else
		 * create local node current = head
		 * iterator to the end of the stack
		 * capture the element at the end in local variable del
		 * remove from stack, decrement the size of the stack
		 * return the captured variable
		 */
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


	// returns the size of the stack
	public Integer size() {
		return size;
	}

}
