
public class LinkedList {
	Node head;
	LinkedList(){
		this.head=null;
		}
	
	//Display List Function
	void displayList() {
		Node temporary = this.head;
		System.out.print("{");
		while(temporary != null) {
			System.out.print(" " + temporary.data + ", ");
			temporary = temporary.next;
		}
		System.out.println("}");
	}
	
	//Insertion At Start
	void insertStart(int d) {
		//Making new node
		Node new_node = new Node(d);
		//Changing head to next of this new node
		new_node.next = this.head;
		//Now Changing The New Head
		this.head = new_node;
	}
	
	//Insertion At End
	void insertEnd(int d) {
		//Making New Node
		Node new_node = new Node(d);
		//Identifying the end node
		Node temporary = this.head;
		Node temp = this.head;
		while(temporary != null) {
			temporary = temporary.next;
			if(temporary != null) {
				temp = temporary;
			}
		}
		//Now Temp contain the next of null
		temp.next = new_node;
	}
	
	void insertAtPosition(int after_data, int d) {
		//Making New Node
		Node new_node = new Node(d);
		//Locating The Node After Which We Have To Add
		Node temporary = this.head;
		Node temp = this.head;
		while(temporary.data != after_data) {
			temporary = temporary.next;
			if(temporary.data == after_data) {
				temp = temporary;
			}
		}
		//Changing The Next of the Given data node
		new_node.next = temp.next;
		//Changing The Head Of The Previous Node
		temp.next = new_node;
	}
	
	//Data Finding In Linked List
	void dataFind(int d) {
		//Traversing in linked list to find data
		Node temporary = this.head;
		Node temp = this.head;
		int count = 0;
		while(temporary != null) {
			if(temporary.data == d) {
				temp = temporary;
				break;
			}else {
				temporary = temporary.next;
				count += 1;
			}
		}
		if(temp.data == d) {
			System.out.println("\nThe Data " + d + " Is Found At Node " + (count + 1) + " Or At Node " + count + " According To Array Indexing.");
		}else {
			System.out.println("\nThe Linked List Does Not Contain The Data You Entered");
		}
	}
}
