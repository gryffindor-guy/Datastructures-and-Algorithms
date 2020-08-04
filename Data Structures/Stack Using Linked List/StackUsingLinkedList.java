import java.util.*;

public class StackUsingLinkedList {

	StackNode head;

	static class StackNode {
		int value;
		StackNode next;

		StackNode (int value) {
			this.value = value;
            this.next = null;
		}

	}

	public boolean isEmpty() {

		return this.head == null;
	}

	public void push(int value) {

		StackNode newNode = new StackNode(value);

		if (this.head == null) {

			this.head = newNode;

		} else {

			StackNode temp = this.head;
			this.head = newNode;
			newNode.next = temp;
		}
		System.out.println(value + " Pushed into the Stack");
	}

	public int pop() {

		int poppedItem = Integer.MIN_VALUE;

		if (this.head == null) {
			System.out.println("Stack is Empty");
		} else {

			poppedItem = this.head.value;
			this.head = this.head.next;
            System.out.println("Item popped from the stack");
		}
		return poppedItem;
	}


	public static void main(String[] args) {

		StackUsingLinkedList myStack = new StackUsingLinkedList();
        StackUsingLinkedList myStack2 = new StackUsingLinkedList();

		myStack.push(3);
		myStack.push(2);
		myStack.push(1);
        System.out.println(myStack.isEmpty());


		System.out.println(myStack.pop());



        myStack2.push(100);
		myStack2.push(10);
		myStack2.push(1);
        System.out.println(myStack2.isEmpty());


		System.out.println(myStack2.pop());



	}
}