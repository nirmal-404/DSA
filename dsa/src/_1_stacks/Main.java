package _1_stacks;


import java.util.Stack;

public class Main {
	public static void main(String[] args) {
//		Stack - LIFO
//		stores objects in  a vertical tower
//		push ()  -> add to the top
//		pop ()   -> remove from the top
		
		Stack<String> stack = new Stack<String>();
		
		System.out.println(stack.empty());
		
		stack.push("Minecreaft");
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("BorderLands");
		stack.push("FFVII");
		
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search("DOOM"));
		System.out.println(stack.search("Pizza"));
		
//		Running memory out -> lava.lang.OutOfMemoryError
		for(int i = 0; i < 1000000000; i++) {
			stack.push("Fallout76");
		}
		
	}
}
