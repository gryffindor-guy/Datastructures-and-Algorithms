public class Main {

	static Node head;
	static class Node {

		int value;
		Node next;
		Node prev;

		Node (int v) {

			value = v;
			next = null;
			prev = null;
		}
	}

	public void push(int value) {

		Node newNode = new Node(value);

		newNode.prev = null;
		newNode.next = this.head;

		if (this.head != null) {
			this.head.prev = newNode;
		}

		this.head = newNode;

	}

	public void append(int value) {

		Node newNode = new Node(value);

		newNode.next = null;
		newNode.prev = null;

		if (this.head == null) {
			this.head = newNode;
			return;
		} else {

			Node currNode = this.head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
			newNode.prev = currNode;

		}
				
	}

	public void printList() {

        Node node = this.head;
		Node last =  null;

        System.out.println("Traversal in forward direction");
		while(node != null) {

			System.out.print(node.value + " --> ");
			last = node;
			node = node.next;

		}
		System.out.print("null\n");
        
        System.out.println("Traversal in Reverse direction");
		while (last != null) {

			System.out.print(last.value + " --> ");
			last = last.prev;

		}
		System.out.print("null\n");
	}

	public static void main(String[] args) {

		Main list = new Main();

		list.push(7);
		list.push(6);
		list.push(5);
		list.push(4);
		list.push(3);
		list.push(1);
        list.printList();

        list.append(8);
        list.append(9);
        list.append(10);
        list.printList();

        	
	}
}