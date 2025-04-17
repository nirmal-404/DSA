package _15_merge_sort;

public class Main {

	public static void main(String[] args) {
		
//		Merge sort -  	recursively divide the array in 2, sort, re-combine
//						run time complexity = O(n log n )
//						space complexity = O( n )
		
//		O( n log n ) -> quick sort, merge sort, heap sort
//		O ( n ^ 2) -> insertion  sort, selection  sort, bubble sort
		
//		merge sort -> leaner space: because we need to create sub arrays
		
		int[] array = {8, 2, 5, 3, 4, 7, 6 ,1};
		
		mergeSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		

	}

	private static void mergeSort(int[] array) {
		
		int length = array.length;
		
		if (length <= 1) return; // base case
		
		
		int middle = length / 2;
		
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];
		
		int i = 0;
		int j = 0;
		
		for(; i < length; i++) {
			if(i < middle) {
				rightArray[i] = array[i];
			}else {
				leftArray[j++] = array[i];
			}
		}
		
		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);
		
		
		
	}
	
	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		
		int i = 0, l = 0, r = 0;
		
		while (l< leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i++] = leftArray[l++];
			}else {
				array[i++] = rightArray[r++];
			}
		}
		
		while (l < leftSize) {
			array[i++] = leftArray[l++];
		}
		
		while (r < rightSize) {
			array[i++] = rightArray[r++];	
		}
	}

}








