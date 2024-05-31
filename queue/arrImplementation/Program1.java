//Queue implementation using array
import java.util.*;
class QueueDemo{
	int maxSize;
	int[] queueArr;
	int front;
	int rear;
	QueueDemo(int size){
		this.maxSize = size;
		this.queueArr = new int[size];
		this.front = -1;
		this.rear = -1;
	}
	
	void enqueue(int data) {
		if(rear == maxSize-1){
			System.out.println("Queue is full");
			return;
		}else{
			if(front == -1){
				front = rear = 0;
			}else{
				rear++;
			}
			queueArr[rear] = data;
		}	
	}

	int dequeue(){
		if(front == -1){
			System.out.println("Queue is empty");
			return -1;
		}else{
			int val = queueArr[front];
			front++;
			if(front > rear){
				front = rear = -1;
			}
			return val;
		}
			
	}

	boolean empty(){
		if(front == -1)
			return true;
		else 
			return false;
	}

	int front(){
		if(front == -1){
			System.out.println("Queue is empty");
			return -1;
		}else{
			return queueArr[front];
		}
	}

	int rear() {
		if(front == -1) {
			System.out.println("Queue is empty");
			return -1;
		}else{
			return queueArr[rear];
		}
	}

	void printQueue() {
		if(front == -1) {
			System.out.println("Queue is empty");
			return;
		}
		for(int i = front; i<=rear; i++) {
			System.out.print(queueArr[i] + " ");
		}
		System.out.println();
	}


}
class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		QueueDemo q = new QueueDemo(size);
		char ch;
		do{
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.empty");
			System.out.println("4.front");
			System.out.println("5.rear");
			System.out.println("6.printQueue");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice){
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
							System.out.println("Queue is empty");
						else
							System.out.println("Queue is not empty");
					}
					break;
				case 4:
					{
						int val = q.front();
						if(val != -1) {
							System.out.println(val);
						}
					}
					break;
				case 5:
					{
						int val = q.rear();
						if(val != -1){
							System.out.println(val);
						}
					}
					break;
				case 6: 
					q.printQueue();
					break;
				default:
					System.out.println("Wrong choice!");
					break;
			}
			System.out.println("Do you want to continue?");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
	}
}
