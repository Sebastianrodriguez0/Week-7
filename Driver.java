public class Driver {
	
	public static void main(String args []) {
	
		ArrayStack firstObj = new ArrayStack ();
		System.out.println ("Push 1,7,3,4,9,2 on stacks.");
			firstObj.push (1);
			firstObj.push (7);
			firstObj.push (3);
			firstObj.push (4);
			firstObj.push (9);
			firstObj.push (2);
			
		System.out.println ("Array Stack is now "+firstObj.size()+" after pushing.");
		firstObj.pop (); firstObj.pop (); firstObj.pop (); firstObj.pop (); firstObj.pop (); firstObj.pop ();
		
		System.out.println ("Array Stack is now " + firstObj.size() + " after popping.");
		LinkedStack secondObj = new LinkedStack ();
		
		System.out.println ("Push 1,7,3,4,9,2 again.");
			secondObj.push (1);
			secondObj.push (7);
			secondObj.push (3);
			secondObj.push (4);
			secondObj.push (9);
			secondObj.push (2);

		System.out.println ("Array Stack is now " + secondObj.size() + " after pushing again.");
		System.out.println (secondObj);

		secondObj.pop (); secondObj.pop (); secondObj.pop (); secondObj.pop (); secondObj.pop (); secondObj.pop ();
		
		System.out.println ("Array Stack is now " + secondObj.size() + " after popping again.");
		System.out.println (secondObj);
}
}