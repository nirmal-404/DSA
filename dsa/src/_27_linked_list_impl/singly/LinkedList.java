package _27_linked_list_impl.singly;


class Node {
	int value;
	Node next;
	
	public Node(int value) {
		this.value = value;
		next = null;
	}
}



public class LinkedList {
	
	private Node head;

	public LinkedList() {
		head = null;
	}
	
	public void insertAtEnd(int data) {
		if(head == null) {
			head = new Node(data);
		}
		else {

			Node newNode = new Node(data);
			Node current = head;
			
			while (current.next != null) {
				current = current.next;
			}
			
			current.next = newNode;
		}
	}
	
	public void insertAtBegining(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
//	public void deleteByValue(int data) {
//		Node current = head;
//		
//		if (head == null) return; 
//		
//	    if (head.value == data) {
//	        head = head.next;
//	        return;
//	    }
//	    
//		while(current != null && current.next != null) {
//			if(current.next.value == data) {
//				current.next=  current.next.next; 
//				return;
//			}
//			current = current.next;
//		}
//	}
//	
//	
	public void deleteByValue(int data) {
		if (head == null) {
			System.out.println("Can't delete. List is already empty");
			return;
		}
		
		if(head.value == data) {
			head = head.next;
			System.out.println("Removed from list");
			return;
		}
		
		Node current = head;
		Node previous = null;
		
		while(current != null && current.value != data) {
			previous = current;
			current = current.next;
		}
		
		if (current == null) {
			System.out.println("Value not found");
			return;
		}
		
		previous.next = current.next;
		System.out.println("Removed from list");
	}
	public void display() {
		if(head == null) {
			System.out.println("Emmpty list");
		}
		
		Node current = head;
		while(current != null) {
			System.out.print(current.value + " ");
			current = current.next;
		}
	}
	
}


