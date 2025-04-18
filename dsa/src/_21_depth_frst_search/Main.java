package _21_depth_frst_search;

public class Main {
	
	
	
	// Adjacency Matrix = A 2D array to store 1's/0's to represent edges
	// # of rows = # of unique nodes
	// # of columns = # of unique nodes
	//
	// runtime complexity to check an Edge: O(1)
	// space complexity: O(v^2)
	
	
		
	//	DFS	=	a search algorithm for traversing a tree of graph data structure	
		
	//	1.	Pick a route
	//	2.	Keep going until you reach a dead end, or a previously visited node
	//	3.	Back-track to last node that has unvisited adjacent neighbors
		
	public static void main(String[] args) {
		
		Graph graph = new Graph(5);
		
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
		
		graph.depthFirstSearch(4);
		
	}

}
