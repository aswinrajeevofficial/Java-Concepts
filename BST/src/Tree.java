
public class Tree {

	public Node root;

	Tree() {
		this.root = null;
	}

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insertNode(8);
		tree.insertNode(4);
		tree.insertNode(12);
		tree.insertNode(1);
		tree.insertNode(7);
		tree.insertNode(9);
		tree.insertNode(14);
		System.out.println("Inorder");
		tree.printInOrder(tree.root);
		System.out.println("\nPreOrder");
		tree.printPreOrder(tree.root);
		System.out.println("\nPostorder");
		tree.printPostOrder(tree.root);
		System.out.println("\nSearch for element");
		Node node = tree.searchNode(tree.root, 1);
		if(null == node) {
			System.out.println("Node not found");
		}
		else {
			System.out.println("Element Found: " + node.getData());
		}
		
	}

	public void insertNode(int data) {
		root = insertHelper(root, data);
	}

	public Node insertHelper(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.getData()) {
			root.setLeft(insertHelper(root.getLeft(), data));
		}
		if (data > root.getData()) {
			root.setRight(insertHelper(root.getRight(), data));
		}
		return root;

	}

	public void printInOrder(Node root) {
		if(root == null) {
			return;
		}
		else {
			printInOrder(root.getLeft());
			System.out.print(root.getData() + " -> ");
			printInOrder(root.getRight());
		}
	}

	public void printPreOrder(Node root) {
		if(root == null) {
			return;
		}
		else {
			System.out.print(root.getData() + " -> ");
			printPreOrder(root.getLeft());
			printPreOrder(root.getRight());
		}
	}

	public void printPostOrder(Node root) {
		if(root == null) {
			return;
		}
		else {
			printPostOrder(root.getLeft());
			printPostOrder(root.getRight());
			System.out.print(root.getData() + " -> ");			
		}
	}
	
	public Node searchNode(Node root, int data) {
		if(root == null || root.getData() == data)
			return root;
		if(data < root.getData())
			return searchNode(root.getLeft(), data);
		return searchNode(root.getRight(), data);
	}
}