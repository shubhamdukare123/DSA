class Node{
	int data;
	int minElem;
	Node next;
	Node(int data, int minElem){
		this.data = data;
		this.minElem = minElem;
	}

}
class LinkedList{
	Node head = null;
}
class StackDemo{
	LinkedList ll;
	void minStack(){
		this.ll = new LinkedList();
	}
	void push(int data){
		if(ll.head == null){
		
		}
	}
}
class Client{
	public static void main(String[] args){
		StackDemo obj = new StackDemo();
		obj.minStack();
		obj.push(10);
	}
}
