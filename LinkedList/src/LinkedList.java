
public class LinkedList {

	public Node head;	
	
	public LinkedList() {
		this.head = null;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		System.out.println("Inserting 3 nodes to linked list");
		Node node = new Node(10);
		list.head = node;
		Node node1 = new Node(11);
		node.setNext(node1);
		Node node2 = new Node(13);
		node1.setNext(node2);
		list.printLinkedList();
		System.out.println("\nInserting new node at head");
		list.insertNodeAtHead(9);
		list.printLinkedList();
		System.out.println("\nInserting new node (12) at position 2");
		list.insertAtPosition(12, 2);
		list.printLinkedList();
	}
	
	public void printLinkedList() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.getData() + "->");
			curr = curr.getNext();
		}
	}
	
	public void insertNodeAtHead(int data) {
		Node node = new Node(data);
		node.setNext(head);
		head = node;
	}
	
	public void insertAtPosition(int data, int pos) {
		//Considering 1st node as 0th position, 2nd node as 1st position and so on
		
		//Let us insert 12 in position 2 (0->1->2)
		Node node = new Node(data);
		Node curr = head;
		while(pos >= 1) {
			curr = curr.getNext();
			pos-=1;
		}
		node.setNext(curr.getNext());
		curr.setNext(node);
	}
}
