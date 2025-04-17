package _24_binary_search_tree;

public class Main {
	public static void main(String[] args) {
		
		// Binary Search Tree = A tree data structure, where each node is greater than its left child, but less than its right.

		// Benefit: Easy to locate a node when they are in this order.

		// Time complexity: Best case O(log n)
		//                  Worst case O(n)

		// Space complexity: O(n)
		                      
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(new Node(5));
		tree.insert(new Node(1));
		tree.insert(new Node(9));
		tree.insert(new Node(2));
		tree.insert(new Node(7));
		tree.insert(new Node(3));
		tree.insert(new Node(6));
		tree.insert(new Node(4));
		tree.insert(new Node(8));

		tree.remove(1);
		tree.remove(5);
		tree.display();
		
		System.out.println(tree.search(0));
		System.out.println(tree.search(1));
		System.out.println(tree.search(2));
		System.out.println(tree.search(5));
	}
}
