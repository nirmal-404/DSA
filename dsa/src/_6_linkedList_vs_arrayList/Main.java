package _6_linkedList_vs_arrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Map<String, Long> timeMap = new HashMap<>();

		LinkedList<Integer> linkedList = new LinkedList<>();
		ArrayList<Integer> arrayList = new ArrayList<>();

		long startTime;
		long endTime;
		long elapsedTime;

		for (int i = 0; i < 1000000; i++) {
			linkedList.add(i);
			arrayList.add(i);
		}

		// ******************* LinkedList *******************
		// Access
		timeMap.put("al-first", timeOperation(() -> linkedList.get(0)));
		timeMap.put("al-center", timeOperation(() -> linkedList.get(500000)));
		timeMap.put("al-end", timeOperation(() -> linkedList.get(linkedList.size() - 1)));

		// Remove
		timeMap.put("rl-first", timeOperation(() -> linkedList.removeFirst()));
		timeMap.put("rl-center", timeOperation(() -> linkedList.remove(500000)));
		timeMap.put("rl-end", timeOperation(() -> linkedList.removeLast()));

		// Insert (to maintain size after removal)
		timeMap.put("il-first", timeOperation(() -> linkedList.addFirst(-1)));
		timeMap.put("il-center", timeOperation(() -> linkedList.add(500000, -1)));
		timeMap.put("il-end", timeOperation(() -> linkedList.addLast(-1)));

		// ******************* ArrayList *******************
		// Access
		timeMap.put("aa-first", timeOperation(() -> arrayList.get(0)));
		timeMap.put("aa-center", timeOperation(() -> arrayList.get(500000)));
		timeMap.put("aa-end", timeOperation(() -> arrayList.get(arrayList.size() - 1)));

		// Remove
		timeMap.put("ra-first", timeOperation(() -> arrayList.remove(0)));
		timeMap.put("ra-center", timeOperation(() -> arrayList.remove(500000)));
		timeMap.put("ra-end", timeOperation(() -> arrayList.remove(arrayList.size() - 1)));

		// Insert (to maintain size after removal)
		timeMap.put("ia-first", timeOperation(() -> arrayList.add(0, -1)));
		timeMap.put("ia-center", timeOperation(() -> arrayList.add(500000, -1)));
		timeMap.put("ia-end", timeOperation(() -> arrayList.add(arrayList.size(), -1)));

		// Summary Outputs
		printSummary("Access Time Summary (nanoseconds):", "a", timeMap);
		printSummary("Remove Time Summary (nanoseconds):", "r", timeMap);
		printSummary("Insert Time Summary (nanoseconds):", "i", timeMap);
	}

	private static long timeOperation(Runnable operation) {
		long start = System.nanoTime();
		operation.run();
		long end = System.nanoTime();
		return end - start;
	}

	private static void printSummary(String title, String prefix, Map<String, Long> timeMap) {
		System.out.println("\n" + title);
		System.out.println("--------------------------------------------------");
		System.out.printf("| %-10s | %-15s | %-15s |%n", "Position", "LinkedList (ns)", "ArrayList (ns)");
		System.out.println("--------------------------------------------------");
		System.out.printf("| %-10s | %-15d | %-15d |%n", "First",  timeMap.get(prefix + "l-first"),  timeMap.get(prefix + "a-first"));
		System.out.printf("| %-10s | %-15d | %-15d |%n", "Center", timeMap.get(prefix + "l-center"), timeMap.get(prefix + "a-center"));
		System.out.printf("| %-10s | %-15d | %-15d |%n", "End",    timeMap.get(prefix + "l-end"),    timeMap.get(prefix + "a-end"));
		System.out.println("--------------------------------------------------");
	}
}
