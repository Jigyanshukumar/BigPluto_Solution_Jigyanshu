
//Question no - 13
class code {

	static Node first;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}


	Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}


	public static void main(String[] args)
	{
		code list = new code();
		list.first = new Node(6);
		list.first.next = new Node(7);
		list.first.next.next = new Node(8);
		list.first.next.next.next = new Node(9);
		list.first.next.next.next.next = new Node(10);

		System.out.println("Given linked list");
		list.printList(first);
		first = list.reverse(first);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(first);
	}
}


