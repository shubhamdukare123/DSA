import java.util.*;
class StackDemo{
	int maxSize;
	int stackArr[];
	int top = -1;

	StackDemo(int size){
		this.maxSize = size;
		stackArr = new int[size];
	}
	
	void push(int element){
		if(top == maxSize-1){
			System.out.println("Stack is full");
		}else{
			top++;
			stackArr[top] = element;
		}
	}

	int pop(){
		if(empty()){
			System.out.println("Stack is empty");
			return -1;
		}else{
			int val = stackArr[top];
			top--;
			return val;
		}	
	}

	int peek(){
		if(empty()){
			System.out.println("Stack is empty");
			return -1;
		}else{
			return stackArr[top];
		}
	}


	boolean empty(){
		if(top == -1){
			return true;
		}else{
			return false;
		}
	}

	int size(){
		return top+1;
	}

	void printStack(){
		System.out.print("[");
		for(int i=0; i<=top; i++){
			if(i!=top)
				System.out.print(stackArr[i] + ",");
			else
				System.out.print(stackArr[i]);
		}
		System.out.println("]");
	}


}
class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Stack size");
		int size = sc.nextInt();
		StackDemo s = new StackDemo(size);
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
