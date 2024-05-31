// circular queue using array
import java.util.*;
class CircularQueue {
	int maxSize;
	int front;
	int rear;
	int queueArr[];
	CircularQueue(int size){
		this.maxSize = size;
		this.front = -1;
		this.rear = -1;
		this.queueArr = new int[size];
	}
	
	void enqueue(int data){
		if((rear == maxSize-1 && front == 0)||((rear+1)%maxSize == front)){
			System.out.println("Queue is full");
			return;
		}
		else{	
			if(front == -1) {
				front = 0;
				rear = 0;
			}else{
				if(rear == maxSize-1) {
					rear = 0;
				}else{
					rear++;
				}
			}
			queueArr[rear] = data;
		}
	}

	int dequeue(){
		if(rear == -1){
			System.out.println("Queuue is empty");
			return -1;
		}else{
			int ret = queueArr[rear];
			if(front == rear) {
				front = rear = -1;1	

			} 
		}
	}

	boolean isEmpty(){
		if(rear == -1 || rear>front){
			return true;
		}else
			return false;
	}

	int front(){
		if(rear > front || rear == -1){
			System.out.println("Queue is empty");
			return -1;
		}else{
			return queueArr[front];
		}
	}

	int rear(){
		if(rear > front || rear == -1) {
			System.out.println("Queue is empty");;
			return -1;
		}else{
			return queueArr[rear];
		}
	}

	void printQueue(){
		if(rear > front || rear == -1) {
			System.out.println("Queue is empty");
			return;
		}else{	
			if(rear >= front){
				for(int i=front; i<=rear; i++){
					System.out.print(queueArr[i] + " ");
				}
				System.out.println();
			}else{
				for(int i = front; i< maxSize; i++){
					System.out.print(queueArr[i] + " ");
				}
				for(int i=0; i<=rear; i++){
					System.out.print(queueArr[i] + " ");
				}
				System.out.println();
			}
		}
	}
}
class Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter queue size");
		int size = sc.nextInt();
		CircularQueue q = new CircularQueue(size);
		char ch;
		do{
			System.out.println("1.enqueue");
			System.out.println("2.dequeue");
			System.out.println("3.isempty");
			System.out.println("4.front");
			System.out.println("5.rear");
			System.out.println("6.printQueue");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					{
						System.out.println("Enter data to enqueue");
						int data = sc.nextInt();
						q.enqueue(data);
					}
					break;
				case 2:
					{
					 	int ret = q.dequeue();
						if(ret!=-1){
							System.out.println(ret + " popped");
						}
					}
					break;

				case 3:
					{
						if(isEmpty()) {
							System.out.println("Queue is empty");
						}
						else{
							System.out.println("Queue is not empty");
						}
					}
					break;

				case 4: 
					{
						int val = q.front();
						if(val!=-1){
							System.out.println(val);
						}
					}
					break;

				case 5:
					{
						int val = q.rear();
						if(val!=-1)
							System.out.println(val);
					}
					break;

				case 6: 
					{
						q.printQueue();
					}
					break;

				default:
					{
						System.out.println("Wrong choice");
					}
					break;

			}
			System.out.println("Continue?");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y' );
	}
}


