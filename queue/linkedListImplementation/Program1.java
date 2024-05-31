//Queue implementation using linkedList
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
class QueueLinkedList {
	Node front = null;
	Node rear = null;

	void enqueue(int data) {
		Node newNode = new Node(data);
		if(front == null) {
			front = newNode;
			rear = newNode;
		}else{
			rear.next = newNode;
			rear = newNode;
		}
	}

	int dequeue(){
		if(front == null) {
			System.out.println("Queue is empty");
			return -1;
		}else{
			int val = front.data;
			front = front.next;
			return val;
		}
	}

	boolean empty(){
		if(front == null)
			return true;
		else
			return false;
	}

	int front(){
		if(front == null){
			System.out.println("Queue is empty");
			return -1;
		}else
			return front.data;
	}

	int rear(){
		if(front == null){
			System.out.println("Queue is empty");
			return -1;
		}else
			return rear.data;
	}

	void printQueue(){
		if(front == null){
			System.out.println("Queue is empty");
			return;
		}
		Node temp = front;
		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

}

class Client{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		QueueLinkedList q = new QueueLinkedList();
		char ch;
		do {
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.empty");
			System.out.println("4.front");
			System.out.println("5.rear");
			System.out.println("6.printQueue");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					{
						System.out.println("Enter data to enqueue");
						int val = sc.nextInt();
						q.enqueue(val);
					}
					break;
				case 2:
					{
						int ret = q.dequeue();
						if(ret != -1)
							System.out.println(ret + " popped");
					}
					break;

				case 3:
					{
						if(q.empty())
							System.out.println("queue is empty");
						else
							System.out.println("queue is not empty");
					}
					break;

				case 4:
					{
						int ret = q.front();
						if(ret != -1)
							System.out.println(ret);
					}
					break;

				case 5: 
					{
						int ret = q.rear();
						if(ret != -1)
							System.out.println(ret);
					}
					break;

				case 6: 
					{
						q.printQueue();
					}
					break;

				default:
					System.out.println("Wrong choice");
					break;

			}
			System.out.println("Continue?");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}
