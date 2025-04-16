package _5_dynamic_arr;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		DynamicArray dynamicArray = new DynamicArray(5);
		System.out.println(dynamicArray.capacity);
		System.out.println(dynamicArray.size);
		
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		dynamicArray.add("D");
		dynamicArray.add("E");
		dynamicArray.add("F");
		
//		dynamicArray.insert(1, "X");
//		
		dynamicArray.delete("A");
		dynamicArray.delete("B");
		dynamicArray.delete("C");
		
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size + "\ncapacity: " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
		
//		System.out.println(dynamicArray.search("B"));
	}

}
