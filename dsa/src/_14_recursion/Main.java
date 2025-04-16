package _14_recursion;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
//		Recursion => 
//				Apply the result of a procedure to a procedure.
//				A recursive method calls itself and can be a substitute for iteration.
//				Divide a problem into sub-problems of the same type as the original.
//				Commonly used with advanced sorting algorithms and navigating trees.
//
//				Advantages:
//				- Easier to read/write
//				- Easier to debug
//
//				Disadvantages:
//				- Sometimes slower
//				- Uses more memory
		
		walk(5);

	}

	private static void walk(int steps) {
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("You take a step");
//		}
		
		if(steps < 1) {
			return;
		}
		
		System.out.println("You take a step");
		
		walk(steps -1);
	}

}
