// This class implements a Stack ADT as a linked list
public class LinkedStackMod {
	LinkedNode front;  // Reference to the first LinkedNode in the list
	int count;         // Number of nodes in the list
	
	// Constructor - initializes the front and count variables
	LinkedStackMod() {
		front = null;
		count = 0;
	}
	
	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
    	newNode.next = front;
    	front = newNode;
    	count++;
	}
	
	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}
	
	// Implements the peek operation
	int peek() {
		return front.x;
	}
	
	// Implements the isEmpty operation
	boolean isEmpty() {
		return front==null;
	}
	
	// Implements the size operation
	int size() {
		return count;		
	}
	void removeBottomHalf() {
		int removeHalf = count/2;
		
		for (int x = 0; x < removeHalf; x++) {
			
			System.out.println ("Bottom half elements that are removed: " + pop());
		}
		
		System.out.println ("Here's what remains: ");
		System.out.println (this);
	}
	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";
		
		LinkedNode cur = front;
		while (cur!=null) {
			str += cur.x + " ";
			cur = cur.next;
		}
		
		return str;
	}
	
}
//Time complexity is 0(n)