//2 stacks in an array
import java.util.*;

class TwoStacks{
	int maxSize;
	int[] stackArr;
	int top1=-1;
	int top2;

	TwoStacks(int size){
		maxSize = size;
		stackArr = new int[maxSize];
		top2 = size;
	}

	void push1(int data){
		if(top2-top1 > 1) {
			top1++;
			stackArr[top1] = data;
		}else{
			System.out.println("Stack Overflow");
		}
	}

	void push2(int data) {
		if(top2-top1 >1){
			top2--;
			stackArr[top2] = data;
		}else{
			System.out.println("Stack Overflow");
		}
	}

	int pop1(){
		if(top1!=-1){
			int val = stackArr[top1];
			top1--;
			return val;
		}else{
			System.out.println("Stack is empty");
			return -1;
		}
	}

	int pop2() {
		if(top2 != maxSize){
			int val = stackArr[top2];
			top2++;
			return val;
		}else{
			System.out.println("Stack is empty");
			return -1;
		}
	}

	void printStack1(){
		if(top1 != -1){
			System.out.print("[");
			for(int i=0; i<= top1; i++){
				if(i!= top1)
					System.out.print(stackArr[i] + ", ");
				else
					System.out.print(stackArr[i]);
			}
			System.out.println("]");
		}else{
			System.out.println("Stack is empty");
		}
	}

	void printStack2(){
		if(top2 != maxSize){
			System.out.print("[");
			for(int i=maxSize-1; i>= top2; i--){
				if(i!= top2)
					System.out.print(stackArr[i] + ", ");
				else
					System.out.print(stackArr[i]);
			}
			System.out.println("]");
		}else{
			System.out.println("Stack is empty");
		}
		
	}
}

class Client {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		TwoStacks obj = new TwoStacks(size);
		char ch;
		do{
			System.out.println("1.push1");
			System.out.println("2.push2");
			System.out.println("3.pop1");
			System.out.println("4.pop2");
			System.out.println("5.printStack1");
			System.out.println("6.printStack2");
			System.out.println("Enter your choice!");
			
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					{
						System.out.println("Enter element to push in stack 1");
						int data = sc.nextInt();
						obj.push1(data);
					}
					break;

				case 2:
					{
						System.out.println("Enter element to push in stack 2");
						int data = sc.nextInt();
						obj.push2(data);
					}
					break;

				case 3:
					{
						int val = obj.pop1();
						if(val!= -1){
							System.out.println(val + "popped from stack 1");
						}
					}
					break;

				case 4:
					{
						int val = obj.pop2();
						if(val != -1){
							System.out.println(val + "popped from stack 2");
						}
					}
					break;
				case 5:
					{
						obj.printStack1();
					}
					break;

				case 6:
					{
						obj.printStack2();
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
		}while(ch == 'y' || ch == 'Y');	
	}
}
