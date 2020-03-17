import java.util.*;
	
public class Question03 {
	public static void main(String[] args) {
		//Creating a Linked List
		LinkedList my_list = new LinkedList();
		//Creating Five Nodes
		Node node1 = new Node(500);
		Node node2 = new Node(3200);
		Node node3 = new Node(200);
		Node node4 = new Node(1200);
		Node node5 = new Node(5900);
		Node node6 = new Node(3400);
		Node node7 = new Node(2300);
		Node node8 = new Node(5240);
		//Linking All The Nodes
		my_list.head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		//Traversing And Printing The Linked List
		System.out.println("Linked List:");
		my_list.displayList();
		//Making Input Object
		Scanner input = new Scanner(System.in);
		//Taking User Input
		System.out.print("\nPlease Enter Any Number Or Data To Find In The Linked List:\t\t");
		int input_data = input.nextInt();
		my_list.dataFind(input_data);
		
	}
}
