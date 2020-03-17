
	class Main{
		public static void main(String[] args) {
			LinkedList l1 = new LinkedList();
			Node n1 = new Node (20);
			
			Node n2 = new Node (100);
			l1.head = n1;
			n1.next = n2;
			Node temp = l1.head;
			while(temp != null){
				System.out.println(temp.data);
				temp = temp.next;
				}
			}
		}