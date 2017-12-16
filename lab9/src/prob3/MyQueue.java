package prob3;

import java.util.Arrays;

public class MyQueue {

	private int[] arr = new int[2];

	private int size = 0;
	private int front = -1;
	private int rear = -1;

	private int peek() {
		return arr[front + 1];
	}

	private int dequeue() {
		if (size > 0) {
			size--;
		}
		return arr[++front];
	}

	private void enqueue(int i) {
		if(front <= 0) front = 0;
		if (size >= arr.length) {
			int[] newArr = new int[arr.length + 10];
			System.out.println("Resizing..... " + Arrays.toString(arr) + " - " + size);
			System.out.println("front:" + front);
			System.out.println("rear:" + rear);
			System.arraycopy(arr, front, newArr, 0, arr.length);
			front = 0;
			arr = newArr;
		}
		size++;
		arr[++rear] = i;
	}

	private int size() {
		return size;
	}

	private boolean isEmpty() {
		return size == 0;
	}

	public static void main(String[] args) {

		MyQueue q = new MyQueue();

		boolean empty = q.isEmpty();
		System.out.println("Is Empty? " + empty);
		
		System.out.println("Size? " + q.size());

		q.enqueue(2);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(8);
		
		System.out.println("Size? " + q.size());
		System.out.println("Dequeue -> " + q.dequeue());
		System.out.println("Size? " + q.size());
		System.out.println("Peek? " + q.peek());
		System.out.println("Dequeue -> " + q.dequeue());
		System.out.println("Size? " + q.size());

	}

}
