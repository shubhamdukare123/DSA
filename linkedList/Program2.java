
class Node{
	Node prev = null;
	int data = 0;
	Node next = null;
	Node(int data){
		this.data = data;
	}
}

class DoublyLinkedList{
	Node head = null;
	void addFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	void addLast(int data){
		Node newNode = new Node(data);
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}

	void addAtPos(int pos, int data){
		if(pos<=0 || pos > countNode()+1){
			System.out.println("Wrong Input");
		}
		else if(pos == 1){
			addFirst(data);
		}
		else if(pos == countNode()+1){
			addLast(data);
		}else{
			Node newNode = new Node(data);
			Node temp = head;
			while(pos-2 != 0) {
				temp = temp.next;
				pos--;
			}
			newNode.next = temp.next;
			newNode.prev = temp;
			temp.next = newNode;
		}
	}

	void deleteFirst(){
		if(head == null){
			System.out.println("Empty LinkedList");
		}else{
			head = head.next;
			head.prev = null;

		}
	}

	void deleteLast(){
		if(head == null){
			System.out.println("Empty LinkedList");
		}else{
			Node temp = head;
			while(temp.next.next!=null){
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	void deleteAtPos(int pos){
		if(head == null){
			System.out.println("Empty LinkedList");
		}
		else if(pos == 1){
			deleteFirst();
		}
		else if(pos == countNode()){
			deleteLast();
		}else{
			Node temp = head;
			while(pos-2 != 0){
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp.next;
		}
	}

	int countNode(){
		int count = 0;
		Node temp = head;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	void printDLL(){
		if(head == null) {
			System.out.println("EmptyLinkedList");
		}else{
			Node temp = head;
			while(temp != null){
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}

class Client{
	public static void main(String[] args){
		DoublyLinkedList dll = new DoublyLinkedList();

		dll.addFirst(10);
		dll.addFirst(20);
		dll.addFirst(30);
		dll.printDLL(); //30->20->10
				
		dll.addLast(5);
		dll.printDLL(); //30->20->10->5
				
		dll.addAtPos(2,25);
		dll.addAtPos(0,100);
		dll.printDLL(); //30->25->20->10->5
				
		dll.deleteFirst();
		dll.printDLL();// 25->20->10->5
		
		dll.deleteLast();
		dll.printDLL();// 25->20->10
		
		dll.deleteAtPos(2);
		dll.printDLL(); //25->10

		int count = dll.countNode();
		System.out.println(count); //5
	}
}
