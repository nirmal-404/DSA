package _20_adjacency_list;


public class Main {
	
	
//	Adjacency List	=	An array/array-list of linked-lists
//						Each linked-list has a unique node at the head.
//						All adjacent neighbors to that node are added to that node's linked-list
	
//	Runtime complexity to check an edge:	O(v)
//	Space complexity: 	O(v + e)
	
	
	public static void main(String[] args) {
		
		Graph graph = new Graph();
		
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		
		graph.print();
		
		
		System.out.println(graph.checkEdge(0, 1)); // true
//		System.out.println(graph.checkEdge(6, 0)); // ArrayIndexOutOfBoundsException
		System.out.println(graph.checkEdge(0, 4)); // false
	
	}
}
