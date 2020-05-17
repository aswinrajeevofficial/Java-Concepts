import java.util.HashMap;

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
		System.out.println("\nDelete head");
		list.deleteHead();
		list.printLinkedList();
		System.out.println("\nDelete from position 2 (12)");
		list.deleteFromPos(2);
		list.printLinkedList();
		
		
		//Inserting a few more nodes before reversing the linked list
		System.out.println("\nInserting a few more nodes before reversing the linked list");
		list.insertAtPosition(9, 1);
		list.insertAtPosition(14, 2);
		list.insertAtPosition(15, 3);
		list.printLinkedList();
		
		
		System.out.println("\nReversing LinkedList");
		list.reverseLinkedList();
		list.printLinkedList();
		
		//Adding a loop to the linked list
		System.out.println("\nChecking for loop");
		list.head.getNext().getNext().getNext().getNext().getNext().setNext(list.head.getNext().getNext().getNext().getNext());
		list.detectLoop();
		
		
		//Finding merge point of two linked lists
		/*
		 * [List #1] a--->b--->c
                     \
                      x--->y--->z--->NULL
                     /
     		[List #2] p--->q
		 */
		LinkedList list2 = new LinkedList();
		
		Node list2node1 = new Node(10);
		Node list2node2 = new Node(20);
		Node list2node3 = new Node(30);
		
		list2.head = list2node1;
		list2node1.setNext(list2node2);
		list2node2.setNext(list2node3);
		
		LinkedList list3 = new LinkedList();
		Node list3node1 = new Node(40);
		
		list3.head = list3node1;
		list3node1.setNext(list2node2);
		
		System.out.println("List 2: ");
		list2.printLinkedList();
		
		System.out.println("\nList 3: ");
		list3.printLinkedList();
		
		System.out.println("\nMerge point of two lists: " + findMergeNode(list2.head, list3.head));
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
		while(pos >= 2) {
			curr = curr.getNext();
			pos-=1;
		}
		node.setNext(curr.getNext());
		curr.setNext(node);
	}
	
	public void deleteHead() {
		if(head.getNext() == null) {
			head = null;
		}
		else {
			head = head.getNext();
		}
	}
	
	public void deleteFromPos(int pos) {
		Node curr = head;
		while(pos >= 2) {
			curr = curr.getNext();
			pos -= 1;
		}		
		curr.setNext(curr.getNext().getNext());
		curr.getNext().setNext(null);
	}
	
	public void reverseLinkedList() {
		Node curr = head, next = null, prev = null;
		while(curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public void detectLoop() {
		//13->12->15->14->9->10->
		Node curr1 = head, curr2 = head;
		while(curr1 != null && curr2 != null && curr2.getNext() != null) {
			curr1 = curr1.getNext();
			curr2 = curr2.getNext().getNext();
			if(curr1 == curr2) {
				System.out.println("Loop found");
				return;
			}
		}
		System.out.println("Loop not found");
		
	}
	
	public static int findMergeNode(Node head1, Node head2) {
        HashMap<Node, Integer> hashMap = new HashMap<>();
        Integer returnData = 0;
        Node curr2 = head2;
        while(curr2 != null){
            hashMap.put(curr2, curr2.getData());
            curr2 = curr2.getNext();
        }
        Node curr1 = head1;
        while(curr1 != null){
            if(hashMap.containsKey(curr1)){
                returnData = curr1.getData();
                break;
            }
            curr1 = curr1.getNext();
        }
        return returnData;
    }
}
