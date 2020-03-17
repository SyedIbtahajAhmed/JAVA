
public class Question01 {

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
		Node temporary = my_list.head;
		int count = 0;
		while(temporary != null) {
			System.out.println("Node " + count + " Has " + temporary.data + " Value.");
			temporary = temporary.next;
			count += 1;
		}
	}

}
