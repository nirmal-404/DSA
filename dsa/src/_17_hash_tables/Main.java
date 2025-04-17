package _17_hash_tables;

import java.util.Hashtable;

public class Main {
	
//		Hash-table = A data structure that stores unique keys to values ex.<Integer, String>
// 					Each key/value pair is known as an Entry
	
// 		FAST insertion, look up, deletion of key/value pairs
// 		Not ideal for small data sets, great with large data sets

// 		hashing = 	takes a key and computes an integer (formula will vary based on key & data type)
// 					In a Hash-table, we use the hash % capacity to calculate an index number

// 		key.hashCode() % capacity = index
	
// 		bucket = 	an indexed storage location for one or more Entries
//  				can store multiple Entries in case of a collision (linked similarly a LinkedList)
	
//		collision = hash function generates the same index for more than one key
//     				less collisions = more efficiency
	
//		Runtime complexity: Best Case O(1)
//             				Worst Case O(n)
		
	
	
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> table = new Hashtable<>(10);
		
		table.put(100, "Spongebob");
		table.put(123, "Patrik");
		table.put(321, "Sandy");
		table.put(555, "Squidward");
		table.put(777, "Gary");
		
//		table.remove(777);
		
		for(Integer key: table.keySet()) {
//			System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
		}
		
		
		Hashtable<String, String> tableStr = new Hashtable<>(21);
		
		tableStr.put("100", "Spongebob");
		tableStr.put("123", "Patrik");
		tableStr.put("321", "Sandy");
		tableStr.put("555", "Squidward");
		tableStr.put("777", "Gary");
		
//		table.remove(777);
		
		for(String key: tableStr.keySet()) {
			System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + tableStr.get(key));
		}
		
	}
}
