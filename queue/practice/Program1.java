import java.util.*;
class QueueDemo{
	public static void main(String[] args){
		Queue q = new LinkedList();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		System.out.println(q);
		System.out.println(q.removeLast());
	}
}
