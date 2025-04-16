package _12_selection_sort;

public class Main{

	public static void main(String[] args) {

		
		// selection sort = search through an array and keep track of the minimum value during each iteration. At the end of each iteration, we swap variables.

		// Quadratic time O(n^2)
		// small data set = okay
		// large data set = BAD
		
		
		int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
		
		selectionSort(array);
		
		for (int i : array) {
			System.out.println(i);
		}
		
	}

	private static void selectionSort(int[] array) {
		
		
		
		
		for (int i = 0; i < array.length -1; i++) {
			int temp;
			int min_index = i;
			for (int j = i + 1; j < array.length; j++) {
				 if(array[j] < array[min_index]) {
					 min_index = j;
				 }
			}
			if(min_index != i) { // for better performance
				temp = array[i];
				array[i] = array[min_index];
				array[min_index] = temp;
			}
			
		}
		
	}

}
