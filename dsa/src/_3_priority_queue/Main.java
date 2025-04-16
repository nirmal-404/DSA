package _3_priority_queue;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		
//		Priority queue => FIFO
//						- data structure that serves els. with the highest priorities first before els with lower priorities
		Queue<Double> gpa_queue = new PriorityQueue<>();
		
		gpa_queue.offer(3.0);
		gpa_queue.offer(2.5);
		gpa_queue.offer(4.0);
		gpa_queue.offer(1.5);
		gpa_queue.offer(2.0);
		
		while (!gpa_queue.isEmpty()) {
			System.out.println(gpa_queue.poll());
		}
		
		System.out.println();
		
		Queue<String> grade_queue = new PriorityQueue<>();
		
		grade_queue.offer("B");
		grade_queue.offer("C");
		grade_queue.offer("A");
		grade_queue.offer("F");
		grade_queue.offer("D");
		
		while (!grade_queue.isEmpty()) {
			System.out.println(grade_queue.poll());
		}
		
		System.out.println();
		
		Queue<String> grade_q_reversed = new PriorityQueue<>(Collections.reverseOrder());
		
		grade_q_reversed.offer("B");
		grade_q_reversed.offer("C");
		grade_q_reversed.offer("A");
		grade_q_reversed.offer("F");
		grade_q_reversed.offer("D");
		
		while (!grade_q_reversed.isEmpty()) {
			System.out.println(grade_q_reversed.poll());
		}
	}

}
