class Client{
	class Node{
		int data;
		Node next = null;
		Node(int val){
			this.data = data;
		}
	}
	class LinkedList{
		Node head;
	}
	LinkedList ll = new LinkedList();	
	void addFirst(){
		System.out.println("In add first");
		System.out.println("head " + ll.head);
	}
}
class Solution{
	public static void main(String[] args){
		Client obj = new Client();
		obj.addFirst();
	}
}
