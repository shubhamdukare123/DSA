class Node{
	int data = 0;
	Node next = null;
	Node(int data){
		this.data = data;
	}
}

class SinglyCircularLinkedList{
	Node head = null;
	void addFirst(int data){
		if(head == null){
			Node newNode = new Node(data);
			head = newNode;
			newNode.next = head;
		}else{
			Node newNode = new Node(data);
			Node temp = head;
			while(temp.next != head){
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
			head = newNode;
		}
	}

	void addLast(int data){
			Node newNode = new Node(data);
			Node temp = head;
			while(temp.next != head){
				temp = temp.next;
			}
			newNode.next = head;
			temp.next = newNode;
		}
		
	
	
	void printSCLL(){
		if(head == null){
			System.out.println(("Empty LinkedList"));
		}else{
			Node temp = head;
			while(temp.next != head){
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data + "->");
		}
	}
}
class Client{
	public static void main(String[] args){
		SinglyCircularLinkedList scll = new SinglyCircularLinkedList();
		scll.addFirst(10);
		scll.addFirst(20);
		scll.addFirst(30);
		scll.printSCLL();

		scll.addLast(5);
		scll.printSCLL();
		
		
	}
}
