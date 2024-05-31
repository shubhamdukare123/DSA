import java.util.*;
class StackArrDemo{
	int maxSize;
	int top;
	int[] stackArr;
	StackArrDemo(int size){
		this.maxSize = size;
		this.top = -1;
		this.stackArr = new int[size];
	}

	boolean empty(){
		if(top == -1){
			return true;
		}else{
			return false;
		}
	}
	int push(int val){
		if(top == maxSize - 1){
			System.out.println("Stack is full");
			return -1;
		}else{
			top++;
			stackArr[top] = val;
		       return val;	
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
}	
class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		StackArrDemo s = new StackArrDemo(size);
		char ch;
		do{
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("Choose operation");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					{
						System.out.println("Enter element to push");
						int val = sc.nextInt();
						int ret = s.push(val);
						if(ret != -1){
							System.out.println(ret + " pushed");
						}
					}
					break;
				case 2:
					{
						int ret = s.pop();
						if(ret != -1){
							System.out.println(ret + " popped");
						}
					}
					break;
				default:
					{
						System.out.println("Wrong choice");
					}				
			}
			System.out.println("Continue?");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' ||  ch == 'y');	
	}
}
