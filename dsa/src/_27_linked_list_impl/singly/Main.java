package _27_linked_list_impl.singly;

public class Main {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		
		list.insertAtEnd(0);
		
		list.insertAtEnd(1);
		list.insertAtEnd(2);
		list.insertAtEnd(3);
		list.insertAtEnd(4);

		list.insertAtBegining(-1);
		list.insertAtBegining(-2);
		list.insertAtBegining(-3);
		list.insertAtBegining(-4);

		
		list.deleteByValue(-4);
		list.deleteByValue(0);
		list.deleteByValue(4);
		
		list.display();
	}

}
