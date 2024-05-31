
class Node {
	int data = 0;
	Node next = null;
	Node(int data){
		this.data = data;
	}
}


class LinkedList {
	Node head = null;
	void addFirst(int data){
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
	}

	void addAtPos(int pos, int data){
		if(pos<=0 || pos> countNode()+1){
			System.out.println("Wrong input");
			return;
		}
		else if(head == null){
			System.out.println("addFirstCalled");
			addFirst(data);
		}
		else if(pos == countNode()+1){
			System.out.println("addLastCalled");
			addLast(data);
		}else{
		Node newNode = new Node(data);
		Node temp = head;
		while(pos-2 != 0){
			temp = temp.next;
			pos--;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		}
	}

	void deleteFirst(){
		if(head == null){
			System.out.println("Empty LinkedList");
		}else{
		head = head.next;	
		}
	}

	void deleteLast(){
		if(head == null){
			System.out.println("Empty LinkedList");	
		}else{
			Node temp = head;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	void deleteAtPos(int pos) {
		if(head == null){
			System.out.println("Empty LinkedList");
		}
		else if(pos<=0 || pos> countNode()) {
			System.out.println("Wrong Input");
		}
		else if(pos==1) {
			deleteFirst();	
		}
		else if (pos == countNode()){
			deleteLast();
		}else{
			Node temp = head;
			while(pos-2 != 0){
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

	int countNode(){
		int count =0;
		Node temp = head;
		while(temp!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	void printSLL(){
		if(head == null){
			System.out.println("Empty LinkedList");
		}
		Node temp = head;
	 	while(temp != null){
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
		System.out.println();
	}

}


class Client{
	public static void main(String[] args){
		LinkedList ll = new LinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.printSLL(); // 30->20->10
			       
		ll.addLast(15);
		ll.printSLL(); //30->20->10->15
			       
		ll.addAtPos(2,25);
		ll.addAtPos(6,5);
		ll.addAtPos(8,12);
		ll.printSLL(); //30->25->20->10->15->5
			      
		int count = ll.countNode();
		System.out.println(count); //6

		ll.deleteFirst();
		ll.printSLL(); //25->20->10->15->5
		
		ll.deleteLast();
		ll.printSLL(); //25->20->10->15
			       
		ll.deleteAtPos(2);
		ll.printSLL(); //25->10->15
	}
}
