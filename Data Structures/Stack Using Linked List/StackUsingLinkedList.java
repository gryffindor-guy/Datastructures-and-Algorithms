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

	public int peek() {

		if (this.head == null) {

			System.out.println("The Stack is Empty");
            return Integer.MIN_VALUE;
		} else {
            System.out.println("the peek item in the stack is : ");
			return this.head.value;
		}
        
	}

	public void printStack() {

        System.out.println("Printing items in the stack");

		if (this.head == null) {
			System.out.println("Stack is Empty");
		} else {
            StackNode temp =this.head;
			while (temp != null) {

				System.out.println(temp.value);
				temp = temp.next;
			}
		}

	}


	public static void main(String[] args) {

		StackUsingLinkedList myStack = new StackUsingLinkedList();
        StackUsingLinkedList myStack2 = new StackUsingLinkedList();

		myStack.push(3);
		myStack.printStack();
		myStack.push(2);
		myStack.printStack();
		myStack.push(1);
		myStack.printStack();
        System.out.println(myStack.isEmpty());


		System.out.println(myStack.pop());
		myStack.printStack();

		System.out.println(myStack.peek());


        myStack2.push(100);
		myStack2.printStack();
		myStack2.push(10);
		myStack2.printStack();
		myStack2.push(1);
		myStack2.printStack();
        System.out.println(myStack2.isEmpty());


		System.out.println(myStack2.pop());
		myStack2.printStack();

		System.out.println(myStack2.peek());


	}
}