package _16_quick_sort;

public class Main {
	
// 		Quick Sort = 	Moves smaller elements to the left of a pivot.
//  					Recursively divides array into two partitions.

//		Run-time complexity: 	Best case 		O(n log(n))
//      	     				Average case 	O(n log(n))
//           					Worst case 		O(n^2) 		if already sorted

//		Space complexity: 		O(log(n)) 		due to recursion
	
	
	public static void main(String[] args) {
		  int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};   
		  
		  quickSort(array, 0, array.length -1);
		  
		  for (int i : array) {
			System.out.print(i + " ");
		}
	}

	private static void quickSort(int[] array, int start, int end) {
		
		if(end <= start) {
			return;
		}
		
		int pivot = partition(array, start, end);
		quickSort(array, start, pivot - 1);
		quickSort(array, pivot + 1, end);
		
	}
	
	private static int partition(int[] array, int start, int end) {
		
		int pivot = array[end];
		
		int i = start - 1;
		
		for (int j = start; j <= end -1; j++) {
			if(array[j] < pivot) {
				int temp = array[++i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[++i];
		array[i] = array[end];
		array[end] = temp;
		
		return i;
	}
}
