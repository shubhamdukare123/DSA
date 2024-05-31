import java.util.*;

class Node {
	int data;
	Node next = null;
	Node(int data){
		this.data = data;
	}

}
class LinkedlistStack{
	
	Node head = null;
	
	void push(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
		}else{
			newNode.next = head;
			head = newNode;
		}	
	}

	int pop(){
		if(head == null){
			System.out.println("Stack is empty");
			return -1;
		}else{	
			int data = head.data;
			head = head.next;
			return data;
		}

	}

	int peek(){
		return head.data;
	}


	boolean empty(){
		if(head == null)
			return true;
		else
			return false;
	}

	int size() {
		Node temp = head;
		int count = 0;
		while(temp!=null){
			count++;
			temp = temp.next;
		}	
		return count;
	}

	void printStack(){
		Node temp = head;
		System.out.print("[");
		while(temp != null){
			if(temp.next != null)
				System.out.print(temp.data+ ", " );
			else
				System.out.print(temp.data);
			temp = temp.next;
		}
		System.out.println("]");
	}


}
class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		LinkedlistStack s = new LinkedlistStack();
		char ch;
		do{
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.empty");
			System.out.println("5.size");
			System.out.println("6.printStack");

			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice){
				case 1:{
					System.out.println("Enter element to push");
					int val = sc.nextInt();
					s.push(val);		
					}
					break;

				case 2:{
						int val = s.pop();
						if(val != -1){
							System.out.println(val + " popped");
						}
					}
				      	break;
				
				case 3:{
						int val = s.peek();
						if(val != -1)
							System.out.println(val);
					}	
				        break;

				case 4:{
						System.out.println(s.empty());
					}
				       break;

				case 5:{
						System.out.println(s.size());
					}
					break;

				case 6:{
						s.printStack();
					}
				        break;
				default:{
						System.out.println("Wrong choice");
					}
					break;
				
			}
			System.out.println("Do you want to continue?");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}
