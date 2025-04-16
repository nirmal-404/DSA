package _2_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
//		Queue -> FIFO
//		add -> add from the end             	=> offer()
//		remove -> removes from the beginning	=> poll()
		
		Queue<String> queue = new LinkedList<String>();
		
		System.out.println(queue.isEmpty());
		
		queue.offer("Manusha");
		queue.offer("Nirmal");
		queue.offer("Perera");
		
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.contains("Nirmal"));
		
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
		
		System.out.println(queue);
		
	}
}
