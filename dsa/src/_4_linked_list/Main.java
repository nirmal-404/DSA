package _4_linked_list;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		
//		linked list as a stack
		System.out.println("--- as a stack ---");
		LinkedList<String> sLinkedList = new LinkedList<String>();
		sLinkedList.push("A");
		sLinkedList.push("B");
		sLinkedList.push("C");
		sLinkedList.push("D");
		sLinkedList.push("F");
		System.out.println("poppped: " + sLinkedList.pop());
		System.out.println(sLinkedList);
		
//		linked list as a queue
		System.out.println("\n--- as a queue ---");
		LinkedList<String> qLinkedList = new LinkedList<String>();
		qLinkedList.offer("A");
		qLinkedList.offer("B");
		qLinkedList.offer("C");
		qLinkedList.offer("D");
		qLinkedList.offer("F");
		
//		System.out.println("popped: " + qLinkedList.poll());
		
		qLinkedList.add(4, "E");
		qLinkedList.remove("E");
		
		System.out.println(qLinkedList.indexOf("F"));
		
		System.out.println(qLinkedList.peekFirst());
		System.out.println(qLinkedList.peekLast());
		
		qLinkedList.addFirst("0");
		qLinkedList.addLast("G");
		
		String first = qLinkedList.removeFirst();
		String last= qLinkedList.removeLast();
		
		System.out.println("first: " + first + " last: " + last);
		
		System.out.println(qLinkedList);
	}
}
