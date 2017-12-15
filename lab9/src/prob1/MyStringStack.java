package prob1;

import prob1.MyStringLinkedList.Node;

public class MyStringStack {
	
	private MyStringLinkedList stringll;

	public MyStringStack() {
		stringll = new MyStringLinkedList();
	}
	
	public static void main(String[] args) {
		MyStringStack stack = new MyStringStack();
		
		stack.push("bob");
		stack.push("harry");
		stack.push("alice");
		
		System.out.println("Popping...." + stack.pop());
		System.out.println("Peeking...." + stack.peek());
		System.out.println("Popping...." + stack.pop());
	}

	private String peek() {
		return stringll.elemenAt(0).value;
	}

	private String pop() {
		Node top = stringll.elemenAt(0);
		stringll.remove(top);
		return top.value;
	}

	private void push(String item) {
		stringll.add(item);
	}

}
