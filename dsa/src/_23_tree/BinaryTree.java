package _23_tree;

class Node {
	int data;
	Node left;
	Node right;
	
	
	public Node(int data) {
		this.data = data;
	}
	
}



public class BinaryTree {
	
	Node root;
	
	
	public void insert(int data) {
		root = insertHelper(root, data);
	}
	
	public Node insertHelper(Node root, int data) {
		if(root == null) {
			root = new Node(data);
		}
		else if(root.data > data){
			root.left = insertHelper(root.left, data);
		}
		else if(root.data < data){
			root.right = insertHelper(root.right, data);
		}
		
		return root;
	}
	
	public void displayInOrder() {
		System.out.print("In-order: ");
		displayInOrderHelper(root);
	}
	
	private void displayInOrderHelper(Node root) {
		if(root != null) {
			displayInOrderHelper(root.left);
			System.out.print(root.data + " ");
			displayInOrderHelper(root.right);
		}
	}
	
	public void displayPreOrder() {
		System.out.print("Pre-order: ");
		displayPreOrderHelper(root);
	}
	
	private void displayPreOrderHelper(Node root) {
		if(root != null) {
			System.out.print(root.data + " ");
			displayInOrderHelper(root.left);
			displayInOrderHelper(root.right);
		}
	}
	
	public void displayPostOrder() {
		System.out.print("Post-order: ");
		displayPostOrderHelper(root);
	}
	
	private void displayPostOrderHelper(Node root) {
		if(root != null) {
			displayInOrderHelper(root.left);
			displayInOrderHelper(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	
}








