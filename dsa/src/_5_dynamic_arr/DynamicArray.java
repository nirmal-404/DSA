package _5_dynamic_arr;


public class DynamicArray {
	int size;
	int capacity = 10;
	Object[] array;
	
	public DynamicArray() {
		this.array = new Object[capacity];
	}
	
	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.array = new Object[capacity];
	}
	
	public void add(Object data) {
		
		if (size >= capacity) {
			grow();
		}
		array[size++] = data;
	}
	
	public void insert(int index, Object data) {
		
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}
		
		if (size >= capacity) {
			grow();
		}
		for (int i = size; i > index; i--) {
			array[i] = array[i - 1];
		}
		array[index] = data;
		size++;
	}

	public void delete(Object data) {
		
		for (int i = 0; i < size; i++) {
			
			if(array[i] == data) {
				for (int j = i; j < size-1; j++) {
					array[j] = array[j + 1];
				}
				array[size -1] = null;
				size--;
				if(size <= (int) (capacity / 3)) {
					shrink();
				}
				break;
			}
		}
	}
	
	public int search(Object data) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == data) {
				return i;
			}
		}
		return -1;
	}
	
	public void grow() {
		int newCapacity = (int)(capacity * 2);
		Object[] newArray = new Object[newCapacity];
		
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;
		
		
	}

	public void shrink() {
		int newCapacity = (int)(capacity / 2);
		Object[] newArray = new Object[newCapacity];
		
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		capacity = newCapacity;
		array = newArray;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public String toString() {
		String string = "";
		
		for (int i = 0; i < size; i++) {
			string += array[i] + ", ";
		}
		if (string != "") {
			string = "[" + string.substring(0, string.length()-2) + "]";
		} else {
			
		}
		return string;
	}
}
