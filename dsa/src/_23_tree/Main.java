package _23_tree;

// Tree traversal
// 		in order 	->	left root right
//		pre-order	->	root left right
//		post-order	->	left right root


public class Main {
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.insert(8);
		tree.insert(7);
		tree.insert(12);
		tree.insert(15);
		tree.insert(2);
		tree.insert(5);
		
		tree.displayInOrder();
		System.out.println();
		tree.displayPreOrder();
		System.out.println();
		tree.displayPostOrder();
		
	}
}
