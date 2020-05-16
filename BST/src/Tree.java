
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
		System.out.println("Height of tree");
		System.out.println(tree.heightOfTree(tree.root));
		int height = tree.heightOfTree(tree.root);
		
		//Level Order Traversal
		for(int i = 1; i <= height+1; i++) {
			tree.levelOrderTraversal(tree.root, i);	
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
	
	public int heightOfTree(Node root) {
		if(root == null) {
			return -1;
		}
		else {
			int leftDepth = heightOfTree(root.getLeft());
			int rightDepth = heightOfTree(root.getRight());
			
			int finalDepth = leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
			return finalDepth;
		}
	}
	
	public void levelOrderTraversal(Node root, int level) {
		if(root == null) {
			return;
		}
		else {
			if(level == 1) {
				System.out.print(root.getData() + " ");
			}
			else {
				levelOrderTraversal(root.getLeft(), level-1);
				levelOrderTraversal(root.getRight(), level-1);
			}
		}
	}
}
