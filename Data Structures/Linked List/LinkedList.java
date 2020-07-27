public class LinkedList {

	Node head;
	static class Node {

		int value;
		Node next;

		Node (int v) {

			value = v;
			next = null;
		}
	}

	public static LinkedList insert(LinkedList list, int value) {

		Node newNode = new Node(value);

		newNode.next = null;

		if (list.head == null) {
			list.head = newNode;
		} else {

			Node currNode = list.head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;

		}
		return list;		
	}

	public static void printList(LinkedList list) {

		Node currNode = list.head;
		while(currNode != null) {

			System.out.print(currNode.value + "-->");
			currNode = currNode.next;

		}
		System.out.print("null");
	}

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.insert(list, 1);
		list.insert(list, 2);
		list.insert(list, 3);
		list.insert(list, 4);
		list.insert(list, 5);
		list.insert(list, 6);
		list.insert(list, 7);
		
		printList(list);
	}
}
