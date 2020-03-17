
public class Question02 {

	public static void main(String[] args) {
		//Creating a Linked List
		LinkedList my_list = new LinkedList();
		//Creating Five Nodes
		Node node1 = new Node(500);
		Node node2 = new Node(3200);
		Node node3 = new Node(200);
		Node node4 = new Node(1200);
		Node node5 = new Node(5900);
		//Linking All The Nodes
		my_list.head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		//Traversing And Printing The Linked List
		System.out.println("Linked List Before Insertion:");
		my_list.displayList();
		//Inserting Node At Start Of The List
		my_list.insertStart(1024);
		//Printing The List
		System.out.println("\nLinked List After Insertion At Start:");
		my_list.displayList();
		//Inserting At End
		my_list.insertEnd(2048);
		//Printing The Linked List
		System.out.println("\nLinked List After Insertion At End:");
		my_list.displayList();
		//Inserting At Position
		my_list.insertAtPosition(3200, 1567);
		//Printing The Linked List
		System.out.println("\nLinked List After Insertion At A Position In Between After 3200");
		my_list.displayList();
	}
}